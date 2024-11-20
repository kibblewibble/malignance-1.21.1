package com.teamcerulean.malignance.block;

import com.teamcerulean.malignance.Malignance;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block registerBlock(String name, Block block)    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Malignance.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Malignance.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Malignance.LOGGER.info("Registering Mod Blocks for " + Malignance.MOD_ID);
    }
}