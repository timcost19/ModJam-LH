package net.mcreator.testjam.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.testjam.init.TestJamModMobEffects;

import java.util.Comparator;

public class OscarChaqueMiseAJourDeTickDeLentiteProcedure {

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z, null);
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(Object event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }

        if (world instanceof ServerLevel _level) {
            final Vec3 _center = new Vec3(x, y, z);

            for (Entity entityiterator : world.getEntitiesOfClass(
                    Entity.class,
                    new AABB(_center, _center).inflate(4.0),
                    e -> true
            ).stream().sorted(Comparator.comparingDouble(
                    _entcnd -> _entcnd.distanceToSqr(_center)
            )).toList()) {

                // Si l'entité proche est un villageois
                if (entityiterator instanceof Villager targetVillager) {

                    // Applique l'effet de corruption directement via le DeferredHolder
                    if (TestJamModMobEffects.CORRUPTION_EFFECT != null) {
                        targetVillager.addEffect(new MobEffectInstance(
                            TestJamModMobEffects.CORRUPTION_EFFECT, 
                            999999, 
                            0, 
                            false, 
                            true
                        ));
                    }

                    // Supprime Oscar
                    entity.discard();

                    break;
                }
            }
        }
    }
}