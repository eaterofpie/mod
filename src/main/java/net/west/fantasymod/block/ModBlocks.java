package net.west.fantasymod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.west.fantasymod.Fantasymod;

public class ModBlocks {
    public static final Block MITHIRL_STONE = registerBlock("mithirl_stone",
            new Block(AbstractBlock.Settings.create().strength(5F).luminance(state -> 15)));
    public static final Block MITHIRL_COBBLE = registerBlock("mithirl_cobble",
            new Block(AbstractBlock.Settings.create().strength(5F).luminance(state -> 15)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK,Identifier.of(Fantasymod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Fantasymod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        Fantasymod.LOGGER.info("Registering Mod Blocks for" + Fantasymod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(MITHIRL_STONE);
            entries.add(MITHIRL_COBBLE);
        });
    }
}
