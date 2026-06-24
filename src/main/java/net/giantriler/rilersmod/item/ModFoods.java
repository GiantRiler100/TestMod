package net.giantriler.rilersmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1f).build();
}
