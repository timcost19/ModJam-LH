package net.mcreator.testjam.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.testjam.network.TestJamModVariables;

public class TestPositiveAllignementProcedureProcedure {
	public static void execute(LevelAccessor world) {
		TestJamModVariables.MapVariables.get(world).Allignement = TestJamModVariables.MapVariables.get(world).Allignement + 10;
		TestJamModVariables.MapVariables.get(world).markSyncDirty();
	}
}