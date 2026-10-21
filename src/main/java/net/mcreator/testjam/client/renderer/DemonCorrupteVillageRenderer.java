package net.mcreator.testjam.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.testjam.entity.DemonCorrupteVillageEntity;

public class DemonCorrupteVillageRenderer extends HumanoidMobRenderer<DemonCorrupteVillageEntity, HumanoidModel<DemonCorrupteVillageEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("test_jam:textures/entities/b37374d5a1f4d529.png");

	public DemonCorrupteVillageRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<DemonCorrupteVillageEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(DemonCorrupteVillageEntity entity) {
		return entityTexture;
	}
}