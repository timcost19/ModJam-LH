package net.mcreator.testjam.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.testjam.init.TestJamModEntities;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CorruptedVillageProcedure {

    @SubscribeEvent
    public static void onEntitySpawned(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof Villager villager) {
            execute(event, event.getLevel(), villager.getX(), villager.getY(), villager.getZ());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level && _level.isVillage(BlockPos.containing(x, y, z))) {
            // 1 chance sur 20 (5%) lors de l'apparition d'un villageois dans un village
            if (_level.getRandom().nextInt(20) == 0) {
                double spawnX = x + Mth.nextDouble(RandomSource.create(), -10, 10);
                double spawnZ = z + Mth.nextDouble(RandomSource.create(), -10, 10);

                Entity entityToSpawn = TestJamModEntities.DEMON_CORRUPTE_VILLAGE.get().spawn(
                        _level, 
                        BlockPos.containing(spawnX, y, spawnZ),
                        MobSpawnType.MOB_SUMMONED
                );
                
                if (entityToSpawn != null) {
                    entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
                }
            }
        }
    }
}