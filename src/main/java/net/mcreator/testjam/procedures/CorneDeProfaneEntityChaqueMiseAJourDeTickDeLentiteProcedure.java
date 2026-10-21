package net.mcreator.testjam.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class CorneDeProfaneEntityChaqueMiseAJourDeTickDeLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Compte_Ticks = 0;
		if (Compte_Ticks == 20 && entity.isPassenger()) {
			Compte_Ticks = 0;
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					entity.startRiding(entityiterator);
				}
			}
		} else {
			Compte_Ticks = Compte_Ticks + 1;
		}
	}
}