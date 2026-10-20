package net.mcreator.testjam.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.testjam.entity.OscarEntity;
import net.mcreator.testjam.client.model.Modeloscar_3D_model;

public class OscarRenderer extends MobRenderer<OscarEntity, Modeloscar_3D_model<OscarEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("test_jam:textures/entities/texture_2.png");

	public OscarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloscar_3D_model<OscarEntity>(context.bakeLayer(Modeloscar_3D_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OscarEntity entity) {
		return entityTexture;
	}
}