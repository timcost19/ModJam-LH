package net.mcreator.testjam.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.Minecraft;

import net.mcreator.testjam.client.model.ModelCorneDeProfané;

import java.util.Map;
import java.util.Collections;

@EventBusSubscriber(Dist.CLIENT)
public class TestJamModHumanoidModels {
	public static PlayerModel CORNE_DE_PROFANE_H_MODEL;

	@SubscribeEvent
	public static void initModels(EntityRenderersEvent.AddLayers event) {
		ModelCorneDeProfané corne_de_profane_h_model_temp = new ModelCorneDeProfané(Minecraft.getInstance().getEntityModels().bakeLayer(ModelCorneDeProfané.LAYER_LOCATION));
		CORNE_DE_PROFANE_H_MODEL = new PlayerModel(new ModelPart(Collections.emptyList(),
				Map.ofEntries(Map.entry("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap())), Map.entry("head", new ModelPart(Collections.emptyList(), Collections.emptyMap())), Map.entry("body", corne_de_profane_h_model_temp.head),
						Map.entry("left_arm", corne_de_profane_h_model_temp.head), Map.entry("right_arm", corne_de_profane_h_model_temp.head), Map.entry("left_leg", corne_de_profane_h_model_temp.head),
						Map.entry("right_leg", corne_de_profane_h_model_temp.head), Map.entry("left_sleeve", new ModelPart(Collections.emptyList(), Collections.emptyMap())),
						Map.entry("right_sleeve", new ModelPart(Collections.emptyList(), Collections.emptyMap())), Map.entry("left_pants", new ModelPart(Collections.emptyList(), Collections.emptyMap())),
						Map.entry("right_pants", new ModelPart(Collections.emptyList(), Collections.emptyMap())), Map.entry("jacket", new ModelPart(Collections.emptyList(), Collections.emptyMap())),
						Map.entry("cloak", new ModelPart(Collections.emptyList(), Collections.emptyMap())), Map.entry("ear", new ModelPart(Collections.emptyList(), Collections.emptyMap())))),
				false);
	}
}