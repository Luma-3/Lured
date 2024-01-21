package com.lured.electrical.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModCustomCreativeTab {
    public static final CreativeModeTab ELECTRICAL_TAB = new CreativeModeTab("electrical_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ALUMINIUM_INGOT.get());
        }
    };
}
