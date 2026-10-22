package net.mcreator.testjam.procedures;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.testjam.network.TestJamModVariables;
import net.mcreator.testjam.client.model.ModelCorneDeProfané;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class SetVariablesProcedure {
	@SubscribeEvent
	public static void afterModelRegistration(EntityRenderersEvent.AddLayers event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		TestJamModVariables.CorneDeProfaneModel = new ModelCorneDeProfané(Minecraft.getInstance().getEntityModels().bakeLayer(ModelCorneDeProfané.LAYER_LOCATION));
		TestJamModVariables.TextureCorneDeProfane = ResourceLocation.fromNamespaceAndPath("test_jam", "textures/entities/cornedeprofane_texture.png");
	}
}