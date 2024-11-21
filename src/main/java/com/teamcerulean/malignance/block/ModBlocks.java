package com.teamcerulean.malignance.block;

import com.teamcerulean.malignance.Malignance;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLOCK_OF_STELLAR_ESSENCE = registerBlock("block_of_stellar_essence",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block BLOCK_OF_CERULEAN = registerBlock("block_of_cerulean",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .requiresTool()
                    .strength(30.0F, 1200.0F)
                    .sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//

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