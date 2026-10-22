package net.mcreator.testjam.procedures;

import net.minecraft.world.entity.Entity;

public class CorneDeProfaneEntityQuandLeJoueurFaitUnClicDroitSurLentiteProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.startRiding(sourceentity);
	}
}