/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.testjam.TestJamMod;

public class TestJamModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TestJamMod.MODID);
	public static final DeferredItem<Item> VILLAGE_CORROMPUE_SPAWN_BLOCK;
	public static final DeferredItem<Item> DEMON_CORRUPTE_VILLAGE_SPAWN_EGG;
	public static final DeferredItem<Item> CORNE_DE_PROFANE_ENTITY_SPAWN_EGG;
	static {
		VILLAGE_CORROMPUE_SPAWN_BLOCK = block(TestJamModBlocks.VILLAGE_CORROMPUE_SPAWN_BLOCK);
		DEMON_CORRUPTE_VILLAGE_SPAWN_EGG = REGISTRY.register("demon_corrupte_village_spawn_egg", () -> new DeferredSpawnEggItem(TestJamModEntities.DEMON_CORRUPTE_VILLAGE, -1, -1, new Item.Properties()));
		CORNE_DE_PROFANE_ENTITY_SPAWN_EGG = REGISTRY.register("corne_de_profane_entity_spawn_egg", () -> new DeferredSpawnEggItem(TestJamModEntities.CORNE_DE_PROFANE_ENTITY, -52225, -13434880, new Item.Properties()));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}