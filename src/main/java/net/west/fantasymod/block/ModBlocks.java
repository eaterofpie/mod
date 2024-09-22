package net.west.fantasymod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.west.fantasymod.Fantasymod;

public class ModBlocks {
    public static final Block MITHIRL_STONE = registerBlock("mithirl_stone",
            new Block(AbstractBlock.Settings.create().strength(5F).luminance(state -> 15)));
    public static final Block MITHIRL_COBBLE = registerBlock("mithirl_cobble",
            new Block(AbstractBlock.Settings.create().strength(5F).luminance(state -> 15)));
    public static final Block MITHIRL_DEEPSLATE = registerBlock("mithirl_deepslate",
            new Block(AbstractBlock.Settings.create().strength(5F).luminance(state -> 8)));
    public static final Block MITHIRL_STONEBRICK = registerBlock("mithirl_stonebrick",
            new Block(AbstractBlock.Settings.create().strength(4F).luminance(state -> 5)));
    public static final Block BLACK_STONE = registerBlock("black_stone",
            new Block(AbstractBlock.Settings.create().strength(5F)));
    public static final Block BLACK_COBBLE = registerBlock("black_cobble",
            new Block(AbstractBlock.Settings.create().strength(5F)));
    public static final Block BLACK_STONEBRICK = registerBlock("black_stonebrick",
            new Block(AbstractBlock.Settings.create().strength(7F)));
    public static final Block SILVER_STONE = registerBlock("silver_stone",
            new Block(AbstractBlock.Settings.create().strength(8F).luminance(state -> 5)));
    public static final Block CRYSTAL_STONE = registerBlock("crystal_stone",
            new Block(AbstractBlock.Settings.create().strength(8F).luminance(state -> 5)));
    public static final Block CRYSTAL_TORCH = registerBlock("crystal_torch",
            new TorchBlock(ParticleTypes.FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 10).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create().strength(8F)));
    public static final Block LIME_MOSSYSTONE = registerBlock("lime_mossystone",
            new Block(AbstractBlock.Settings.create().strength(7F)));
    public static final Block IRON_STONE = registerBlock("iron_stone",
            new Block(AbstractBlock.Settings.create().strength(8F)));
    public static final Block IRON_STONEBRICK =registerBlock("iron_stonebrick",
            new Block(AbstractBlock.Settings.create().strength(7F)));
    public static final Block DWARF_STONE = registerBlock("dwarf_stone",
            new Block(AbstractBlock.Settings.create().strength(8F)));



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
            entries.add(MITHIRL_DEEPSLATE);
            entries.add(MITHIRL_STONEBRICK);
            entries.add(BLACK_STONE);
            entries.add(BLACK_COBBLE);
            entries.add(BLACK_STONEBRICK);
            entries.add(SILVER_STONE);
            entries.add(CRYSTAL_STONE);
            entries.add(CRYSTAL_TORCH);
            entries.add(LIMESTONE);
            entries.add(LIME_MOSSYSTONE);
            entries.add(IRON_STONE);
            entries.add(IRON_STONEBRICK);
            entries.add(DWARF_STONE);
        });
    }
}
