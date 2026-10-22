/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testjam.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.testjam.potion.CorruptionEffectMobEffect;
import net.mcreator.testjam.TestJamMod;

public class TestJamModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, TestJamMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> CORRUPTION_EFFECT = REGISTRY.register("corruption_effect", CorruptionEffectMobEffect::new);
}