package com.teamcerulean.malignance.item;

import com.teamcerulean.malignance.Malignance;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MALIGNANCE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Malignance.MOD_ID, "malignance_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.CERULEAN_DUST))
                    .displayName(Text.translatable("Malignance"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CERULEAN_DUST);
                        entries.add(ModItems.FRAGMENTED_DUST);
                        entries.add(ModItems.STELLAR_ESSENCE);
                        entries.add(ModItems.BUNDLE_OF_DUST);
                    }).build());

    public static void registerItemGroups() {
        Malignance.LOGGER.info("Registering Item Groups for " + Malignance.MOD_ID);
    }
}
