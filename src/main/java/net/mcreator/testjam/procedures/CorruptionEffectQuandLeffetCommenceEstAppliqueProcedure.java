package net.mcreator.testjam.procedures;

import net.neoforged.neoforge.client.event.RenderLivingEvent;

import net.minecraft.world.entity.Entity;

public class CorruptionEffectQuandLeffetCommenceEstAppliqueProcedure {
	public static void execute(Entity entity, RenderLivingEvent entityRenderEvent) {
		if (entity == null || entityRenderEvent == null)
			return;
		SetEntityCorruptedProcedure.execute(entity, entityRenderEvent);
	}
}