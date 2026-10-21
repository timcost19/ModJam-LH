/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.testjam.block.VillageCorrompueSpawnBlockBlock;
import net.mcreator.testjam.TestJamMod;

public class TestJamModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TestJamMod.MODID);
	public static final DeferredBlock<Block> VILLAGE_CORROMPUE_SPAWN_BLOCK;
	static {
		VILLAGE_CORROMPUE_SPAWN_BLOCK = REGISTRY.register("village_corrompue_spawn_block", VillageCorrompueSpawnBlockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}