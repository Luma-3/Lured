package com.lured.electrical.block;

import com.lured.electrical.block.custom.JumpBlock;
import com.lured.electrical.item.ModCustomCreativeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class Materials extends ModBlocks{

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registryObject("aluminium_block",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(6f, 1200f).requiresCorrectToolForDrops()),
            ModCustomCreativeTab.ELECTRICAL_TAB);

    public static final RegistryObject<Block> LITHIUM_BLOCK = registryObject("lithium_block",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(6f, 1200f).requiresCorrectToolForDrops()),
            ModCustomCreativeTab.ELECTRICAL_TAB);

    public static final RegistryObject<Block> LITHIUM_ORE = registryObject("lithium_ore",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(6f, 1200f).requiresCorrectToolForDrops()),
            ModCustomCreativeTab.ELECTRICAL_TAB);

    public static final RegistryObject<Block> JUMP_BLOCK = registryObject("jump_block",
            () -> new JumpBlock(Block.Properties.of(Material.METAL)
                    .strength(6f,1200f)),
            ModCustomCreativeTab.ELECTRICAL_TAB);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
