/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.testjam.network.TestnegativeallignementMessage;
import net.mcreator.testjam.network.TestAllignementMessage;

@EventBusSubscriber(Dist.CLIENT)
public class TestJamModKeyMappings {
	public static final KeyMapping TESTPOSITIVE_ALLIGNEMENT = new KeyMapping("key.test_jam.testpositive_allignement", GLFW.GLFW_KEY_UP, "key.category.test_jam.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new TestAllignementMessage(0, 0));
				TestAllignementMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TESTNEGATIVEALLIGNEMENT = new KeyMapping("key.test_jam.testnegativeallignement", GLFW.GLFW_KEY_DOWN, "key.category.test_jam.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new TestnegativeallignementMessage(0, 0));
				TestnegativeallignementMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TESTPOSITIVE_ALLIGNEMENT);
		event.register(TESTNEGATIVEALLIGNEMENT);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				TESTPOSITIVE_ALLIGNEMENT.consumeClick();
				TESTNEGATIVEALLIGNEMENT.consumeClick();
			}
		}
	}
}