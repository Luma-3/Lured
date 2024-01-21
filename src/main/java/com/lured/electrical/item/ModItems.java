package com.lured.electrical.item;

import com.lured.electrical.Electrical;
import com.lured.electrical.item.custom.RandomDiceItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Electrical.MODID);

    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties().tab(ModCustomCreativeTab.ELECTRICAL_TAB)));

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(ModCustomCreativeTab.ELECTRICAL_TAB)));

    public static final RegistryObject<Item> RAW_LITHIUM = ITEMS.register("raw_lithium",
            () -> new Item(new Item.Properties().tab(ModCustomCreativeTab.ELECTRICAL_TAB)));

    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot",
            () -> new Item(new Item.Properties().tab(ModCustomCreativeTab.ELECTRICAL_TAB)));

    public static final RegistryObject<Item> RANDOM_DICE = ITEMS.register("random_dice",
            () -> new RandomDiceItem(new Item.Properties().tab(ModCustomCreativeTab.ELECTRICAL_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
