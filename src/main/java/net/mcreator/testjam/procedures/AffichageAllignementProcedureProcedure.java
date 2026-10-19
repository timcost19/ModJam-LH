package net.mcreator.testjam.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.testjam.network.TestJamModVariables;

public class AffichageAllignementProcedureProcedure {
	public static String execute(LevelAccessor world) {
		String Color = "";
		if (TestJamModVariables.MapVariables.get(world).Allignement >= 100 || TestJamModVariables.MapVariables.get(world).Allignement <= -100) {
			if (TestJamModVariables.MapVariables.get(world).Allignement >= 200) {
				Color = "\u00A7a";
			}
			if (TestJamModVariables.MapVariables.get(world).Allignement >= 100) {
				Color = "\u00A7b";
			}
			if (TestJamModVariables.MapVariables.get(world).Allignement <= -100) {
				Color = "\u00A71";
			}
			if (TestJamModVariables.MapVariables.get(world).Allignement <= -200) {
				Color = "\u00A7d";
			}
		} else {
			Color = "\u00A7b";
		}
		return Color + "" + new java.text.DecimalFormat("##.##").format(TestJamModVariables.MapVariables.get(world).Allignement);
	}
}