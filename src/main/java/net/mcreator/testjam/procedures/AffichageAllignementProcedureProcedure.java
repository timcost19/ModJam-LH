package net.mcreator.testjam.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.testjam.network.TestJamModVariables;

public class AffichageAllignementProcedureProcedure {
	public static String execute(LevelAccessor world) {
		return new java.text.DecimalFormat("##.##").format(TestJamModVariables.MapVariables.get(world).Allignement) + "";
	}
}