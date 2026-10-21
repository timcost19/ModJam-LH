package net.mcreator.testjam.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class DemonCorrupteVillageChaqueMiseAJourDeTickDeLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Compte_Ticks = 0;
		if (Compte_Ticks == 60) {
			Compte_Ticks = 0;
			if (world instanceof ServerLevel _level0 && _level0.isVillage(BlockPos.containing(x, y, z))) {
				if (Mth.nextDouble(RandomSource.create(), 1, 10) == 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.witch.throw")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.witch.throw")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.ALLAY.spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -10, 10), y, z + Mth.nextDouble(RandomSource.create(), -10, 10)), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			}
		} else {
			Compte_Ticks = Compte_Ticks + 1;
		}
	}
}