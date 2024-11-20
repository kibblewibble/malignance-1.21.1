package com.teamcerulean.malignance.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CERULEAN_DUST = new FoodComponent.Builder().nutrition(-1).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100), 1.0f)
            .alwaysEdible().snack().build();
}
