/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.testjam.TestJamMod;

public class TestJamModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TestJamMod.MODID);
	public static final DeferredItem<Item> OSCAR_SPAWN_EGG;
	static {
		OSCAR_SPAWN_EGG = REGISTRY.register("oscar_spawn_egg", () -> new DeferredSpawnEggItem(TestJamModEntities.OSCAR, -1, -1, new Item.Properties()));
	}
	// Start of user code block custom items
	// End of user code block custom items
}