package net.mcreator.testjam.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.mcreator.testjam.procedures.TestPositiveAllignementProcedureProcedure;
import net.mcreator.testjam.TestJamMod;

@EventBusSubscriber
public record TestAllignementMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<TestAllignementMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(TestJamMod.MODID, "key_testpositive_allignement"));
	public static final StreamCodec<RegistryFriendlyByteBuf, TestAllignementMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, TestAllignementMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new TestAllignementMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<TestAllignementMessage> type() {
		return TYPE;
	}

	public static void handleData(final TestAllignementMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (type == 0) {

			TestPositiveAllignementProcedureProcedure.execute(world);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TestJamMod.addNetworkMessage(TestAllignementMessage.TYPE, TestAllignementMessage.STREAM_CODEC, TestAllignementMessage::handleData);
	}
}