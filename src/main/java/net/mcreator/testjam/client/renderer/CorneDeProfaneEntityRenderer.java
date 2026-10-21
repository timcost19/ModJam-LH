package net.mcreator.testjam.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.testjam.entity.CorneDeProfaneEntityEntity;
import net.mcreator.testjam.client.model.ModelCustomModel;

public class CorneDeProfaneEntityRenderer extends MobRenderer<CorneDeProfaneEntityEntity, ModelCustomModel<CorneDeProfaneEntityEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("test_jam:textures/entities/cornedeprofane_texture.png");

	public CorneDeProfaneEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel<CorneDeProfaneEntityEntity>(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorneDeProfaneEntityEntity entity) {
		return entityTexture;
	}
}