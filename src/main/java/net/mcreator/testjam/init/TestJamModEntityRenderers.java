/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.testjam.client.renderer.DemonCorrupteVillageRenderer;
import net.mcreator.testjam.client.renderer.CorneDeProfaneEntityRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class TestJamModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TestJamModEntities.DEMON_CORRUPTE_VILLAGE.get(), DemonCorrupteVillageRenderer::new);
		event.registerEntityRenderer(TestJamModEntities.CORNE_DE_PROFANE_ENTITY.get(), CorneDeProfaneEntityRenderer::new);
	}
}