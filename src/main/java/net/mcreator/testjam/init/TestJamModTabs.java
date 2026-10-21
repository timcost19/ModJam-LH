/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.testjam.TestJamMod;

@EventBusSubscriber
public class TestJamModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestJamMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TestJamModItems.DEMON_CORRUPTE_VILLAGE_SPAWN_EGG.get());
			tabData.accept(TestJamModItems.CORNE_DE_PROFANE_ENTITY_SPAWN_EGG.get());
		}
	}
}