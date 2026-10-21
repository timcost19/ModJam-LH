/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.testjam.entity.DemonCorrupteVillageEntity;
import net.mcreator.testjam.entity.CorneDeProfaneEntityEntity;
import net.mcreator.testjam.TestJamMod;

@EventBusSubscriber
public class TestJamModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, TestJamMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DemonCorrupteVillageEntity>> DEMON_CORRUPTE_VILLAGE = register("demon_corrupte_village",
			EntityType.Builder.<DemonCorrupteVillageEntity>of(DemonCorrupteVillageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CorneDeProfaneEntityEntity>> CORNE_DE_PROFANE_ENTITY = register("corne_de_profane_entity",
			EntityType.Builder.<CorneDeProfaneEntityEntity>of(CorneDeProfaneEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		DemonCorrupteVillageEntity.init(event);
		CorneDeProfaneEntityEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DEMON_CORRUPTE_VILLAGE.get(), DemonCorrupteVillageEntity.createAttributes().build());
		event.put(CORNE_DE_PROFANE_ENTITY.get(), CorneDeProfaneEntityEntity.createAttributes().build());
	}
}