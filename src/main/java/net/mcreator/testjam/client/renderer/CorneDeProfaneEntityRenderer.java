package net.mcreator.testjam.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.testjam.entity.CorneDeProfaneEntityEntity;
import net.mcreator.testjam.client.model.ModelCorneDeProfané;

public class CorneDeProfaneEntityRenderer extends MobRenderer<CorneDeProfaneEntityEntity, ModelCorneDeProfané<CorneDeProfaneEntityEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("test_jam:textures/entities/cornedeprofane_texture.png");

	public CorneDeProfaneEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCorneDeProfané<CorneDeProfaneEntityEntity>(context.bakeLayer(ModelCorneDeProfané.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorneDeProfaneEntityEntity entity) {
		return entityTexture;
	}
}