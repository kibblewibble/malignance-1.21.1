package com.teamcerulean.malignance.item;

import com.teamcerulean.malignance.Malignance;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CERULEAN_DUST = registerItem("cerulean_dust", new Item(new Item.Settings().food(ModFoodComponents.CERULEAN_DUST)));
    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar", new Item(new Item.Settings().food(ModFoodComponents.CHOCOLATE_BAR)));
    public static final Item FRAGMENTED_DUST = registerItem("fragmented_dust", new Item(new Item.Settings()));
    public static final Item STELLAR_ESSENCE = registerItem("stellar_essence", new Item(new Item.Settings()));
    public static final Item BUNDLE_OF_DUST = registerItem("bundle_of_dust", new Item(new Item.Settings()));
    public static final Item EFFIGY = registerItem("effigy", new Item(new Item.Settings()));
    public static final Item SUN_TALISMAN = registerItem("sun_talisman", new Item(new Item.Settings()));

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Malignance.MOD_ID, name), item);
}
    public static void registerModItems() {
        Malignance.LOGGER.info("Registering Mod Items for " + Malignance.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->  {
            entries.add(CERULEAN_DUST);
            entries.add(STELLAR_ESSENCE);
            entries.add(FRAGMENTED_DUST);
            entries.add(BUNDLE_OF_DUST);
            entries.add(CHOCOLATE_BAR);
    });
}}
