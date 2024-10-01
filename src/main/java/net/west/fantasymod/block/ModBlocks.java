package net.west.fantasymod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.west.fantasymod.Fantasymod;
import net.west.fantasymod.block.custom.FallSoulLogBlock;
import net.west.fantasymod.block.custom.SoulMushroomBlock;

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
    public static final Block DWARF_COBBLE = registerBlock("dwarf_cobble",
            new Block(AbstractBlock.Settings.create().strength(9F)));
    public static final Block DWARF_COBBLESTONE = registerBlock("dwarf_cobblestone",
            new Block(AbstractBlock.Settings.create().strength(10F)));
    public static final Block DWARF_BRICK = registerBlock("dwarf_brick",
            new Block(AbstractBlock.Settings.create().strength(4F)));
    public static final Block DWARF_STONEBRICK = registerBlock("dwarf_stonebrick",
            new Block(AbstractBlock.Settings.create().strength(8F)));
    public static final Block RIVER_STONE = registerBlock("river_stone",
            new Block(AbstractBlock.Settings.create().strength(5F)));
    public static final Block SILVER_LOG = registerBlock("silver_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block CRYSTAL_LOG = registerBlock("crystal_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block CRYSTAL_LEAVES = registerBlock("crystal_leaves",
            new LeavesBlock((LeavesBlock.Settings.create().strength(2.0F).noCollision().burnable().luminance(state -> 9))));
    public static final Block SILVER_LEAVES = registerBlock("silver_leaves",
            new LeavesBlock((AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable().luminance(state -> 9))));
    public static final Block DWARF_CRYSTAL_STONE = registerBlock("dwarf_crystal_stone",
            new Block(AbstractBlock.Settings.create().strength(0.6F).luminance(state -> 5)));
    public static final Block DWARF_LIMESTONE = registerBlock("dwarf_limestone",
            new Block(AbstractBlock.Settings.create().strength(1.4F)));
    public static final Block DWARF_STONEBLOCK = registerBlock("dwarf_stoneblock",
            new Block(AbstractBlock.Settings.create().strength(1.4F)));
    public static final Block DWARF_PILLAR = registerBlock("dwarf_pillar",
            new Block(AbstractBlock.Settings.create().strength(1.5F)));
    public static final Block DWARF_RED_STONE = registerBlock("dwarf_red_stone",
            new Block(AbstractBlock.Settings.create().strength(1.4F)));
    public static final Block DWARF_ONYNIC = registerBlock("dwarf_onynic",
            new Block(AbstractBlock.Settings.create().strength(1.4F)));
    public static final Block WEALT_LEAVES = registerBlock("wealt_leaves",
            new LeavesBlock((LeavesBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable().luminance(state -> 5))));
    public static final Block WEALT_LOG = registerBlock("wealt_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 5)));
    public static final Block VAGLIR_LOG = registerBlock("vaglir_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DWARF_SAPLOG = registerBlock("dwarf_saplog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DWARF_LIGHTLOG = registerBlock("dwarf_lightlog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DWARF_light_LEAVES = registerBlock("dwarf_light_leaves",
            new LeavesBlock((AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable().luminance(state -> 5))));
    public static final Block DWARF_YORKRYLOG = registerBlock("dwarf_yorkrylog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DWARF_EMERWAVELOG = registerBlock("dwarf_emerwavresaplog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block ELF_LANTOLOG = registerBlock("elf_lantolog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block ELF_LANTO_LEAVES = registerBlock("elf_lanto_leaves",
            new LeavesBlock((AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable().luminance(state -> 5))));
    public static final Block DWARF_ARAPAHOLOG = registerBlock("dwarf_arapaholog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DWARF_GIOLOG = registerBlock("dwarf_giolog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DWARF_GIO_LEAVES = registerBlock("dwarf_gio_leaves",
              new LeavesBlock((AbstractPlantBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable().luminance(state -> 5))));
    public static final Block DARKELF_CROTHERLOG = registerBlock("darkelf_crotherlog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DARKELF_LAGANLOG = registerBlock("darkelf_laganlog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DWARF_WHITEBRICK = registerBlock("dwarf_whitebrick",
            new Block(AbstractBlock.Settings.create().strength(1.5F)));
    public static final Block DARKELF_STONE = registerBlock("darkelf_stone",
            new Block(AbstractBlock.Settings.create().strength(1.4F)));
    public static final Block DARKELF_STONEBRICK = registerBlock("darkelf_stonebrick",
            new Block(AbstractBlock.Settings.create().strength(6.F)));
    public static final Block DARKELF_BEIGE = registerBlock("darkelf_beige",
            new Block(AbstractBlock.Settings.create().strength(1.5F)));
    public static final Block DARKELF_COBALT = registerBlock("darkelf_cobalt",
            new Block(AbstractBlock.Settings.create().strength(9F)));
    public static final Block DARKELF_BEIGE_SLAB =registerBlock("darkelf_beige_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(7F)));
    public static final Block DARKELF_BRICK = registerBlock("darkelf_brick",
            new Block(AbstractBlock.Settings.create().strength(1.4F)));
    public static final Block BURNT_LOG = registerBlock("burnt_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(4F)));
    public static final Block MOSSY_OAK_LOG = registerBlock("mossy_oak_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(6F)));
    public static final Block DEAD_LOG = registerBlock("dead_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(4F)));
    public static final Block SUNELF_LOG = registerBlock("sunelf_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable().luminance(state -> 7)));
    public static final Block DROW_STONE = registerBlock("drow_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F)));
    public static final Block DROW_COBBLE = registerBlock("drow_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F)));
    public static final Block DROW_BRICK =registerBlock("drow_brick",
            new Block(AbstractBlock.Settings.create().strength(1.3F)));
    public static final Block DROW_LOG = registerBlock("drow_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(7F)));
    public static final Block DROW_LEAVES = registerBlock("drow_leaves",
            new LeavesBlock((AbstractPlantBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable().luminance(state -> 5))));
    public static final Block DUSKWOOD_LOG = registerBlock("duskwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(7F)));
    public static final Block DUSKWOOD_LEAVES = registerBlock("duskwood_leaves",
            new LeavesBlock((AbstractPlantBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable().luminance(state -> 5))));
    public static final Block SOUL_LOG = registerBlock("soul_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(7F).luminance(state -> 7)));
    public static final Block SOUL_STONE = registerBlock("soul_stone",
            new Block(AbstractBlock.Settings.create().strength(1.4F).luminance(state -> 7)));
    public static final Block SOUL_LEAVES = registerBlock("soul_leaves",
            new LeavesBlock((AbstractPlantBlock.Settings.create().mapColor(MapColor.LAPIS_BLUE).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.GRASS).burnable().luminance(state -> 9))));
    public static final Block IRONWOOD_LOG = registerBlock("ironwood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(7F).luminance(state -> 7)));
    public static final Block IRONWOOD_LEAVES = registerBlock("ironwood_leaves",
            new LeavesBlock((AbstractPlantBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.GRASS).burnable().luminance(state -> 9))));
    public static final Block HIEXEL_LOG = registerBlock("hiexel_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(7F).luminance(state -> 7)));
    public static final Block HIEXEL_LEAVES = registerBlock("hiexel_leaves",
            new LeavesBlock((AbstractPlantBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASS).noCollision().strength(2.0F).sounds(BlockSoundGroup.GRASS).burnable().luminance(state -> 9))));
   public static final Block HIEXEL_STONE = registerBlock("hiexel_stone",
           new Block(AbstractBlock.Settings.create().strength(6F)));
    public static final Block SOUL_MUSHROOM = registerBlock("soul_mushroom",
            new SoulMushroomBlock(AbstractBlock.Settings.create().strength(7F).luminance(state -> 7).noCollision()));
    public static final Block FALL_SOUL_LOG = registerBlock("fall_soul_log",
            new FallSoulLogBlock(AbstractBlock.Settings.create().strength(7F).luminance(state -> 7)));
    public static final Block SOUL_BRICK = registerBlock("soul_brick",
            new Block(AbstractBlock.Settings.create().strength(1.4F).luminance(state -> 7)));
    public static final Block SOUL_STONE_FENCE = registerBlock("soul_stone_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().luminance(state -> 4)));
    public static final Block DARKELF_TORCH = registerBlock("darkelf_torch",
            new TorchBlock(ParticleTypes.FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 10).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DWARF_CELESTIAL = registerBlock("dwarf_celestial",
            new Block(AbstractBlock.Settings.create().strength(1.5F)));
    public static final Block ELF_VINE = registerBlock("elf_vine",
            new VineBlock(AbstractBlock.Settings.create().strength(2F).noCollision()));
    public static final Block ELF_TWISTING_VINES = registerBlock("elf_twisting_vines",
            new TwistingVinesBlock(AbstractBlock.Settings.create().strength(2F)));
    public static final Block DROW_VINE = registerBlock("drow_vine",
            new VineBlock(AbstractBlock.Settings.create().strength(3F).noCollision().luminance(state -> 4)));
    public static final Block MITHIRL_ORE = registerBlock("mithirl_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().luminance(state -> 4)));
    public static final Block MITHIRL_DEEPSLATE_ORE = registerBlock("mithirl_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).luminance(state -> 4)));
    public static final Block BLOODELF_COBBLE = registerBlock("bloodelf_cobble",
            new Block(AbstractBlock.Settings.create().strength(10F).luminance(state -> 4)));
    public static final Block BLOODELF_STONE = registerBlock("bloodelf_stone",
            new Block(AbstractBlock.Settings.create().strength(10F).luminance(state -> 4)));
    public static final Block BLOODELF_BRICK = registerBlock("bloodelf_brick",
            new Block(AbstractBlock.Settings.create().strength(10F).luminance(state -> 4)));
    public static final Block CHAOSDWARF_COBBLE = registerBlock("chaosdwarf_cobble",
            new Block(AbstractBlock.Settings.create().strength(10F).luminance(state -> 4)));
    public static final Block CHAOSDWARF_STONE = registerBlock( "chaosdwarf_stone",
            new Block(AbstractBlock.Settings.create().strength(10F).luminance(state -> 4)));
    public static final Block CHAOSDWARF_BRICK = registerBlock("chaosdwarf_brick",
            new Block(AbstractBlock.Settings.create().strength(10F).luminance(state -> 4)));












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
            entries.add(DWARF_BRICK);
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
            entries.add(DWARF_COBBLE);
            entries.add(DWARF_COBBLESTONE);
            entries.add(DWARF_STONE);
            entries.add(DWARF_STONEBRICK);
            entries.add(SILVER_LOG);
            entries.add(SILVER_LEAVES);
            entries.add(CRYSTAL_LOG);
            entries.add(CRYSTAL_LEAVES);
            entries.add(DWARF_CRYSTAL_STONE);
            entries.add(DWARF_LIMESTONE);
            entries.add(DWARF_RED_STONE);
            entries.add(DWARF_ONYNIC);
            entries.add(DWARF_STONEBLOCK);
            entries.add(DWARF_PILLAR);
            entries.add(WEALT_LEAVES);
            entries.add(WEALT_LOG);
            entries.add(VAGLIR_LOG);
            entries.add(DWARF_SAPLOG);
            entries.add(DWARF_LIGHTLOG);
            entries.add(DWARF_light_LEAVES);
            entries.add(DWARF_EMERWAVELOG);
            entries.add(DWARF_YORKRYLOG);
            entries.add(DWARF_ARAPAHOLOG);
            entries.add(DWARF_GIOLOG);
            entries.add(DWARF_GIO_LEAVES);
            entries.add(DWARF_WHITEBRICK);
            entries.add(ELF_LANTOLOG);
            entries.add(ELF_LANTO_LEAVES);
            entries.add(DARKELF_LAGANLOG);
            entries.add(DARKELF_CROTHERLOG);
            entries.add(DARKELF_BEIGE);
            entries.add(DARKELF_COBALT);
            entries.add(DARKELF_STONEBRICK);
            entries.add(DARKELF_STONE);
            entries.add(DARKELF_BEIGE_SLAB);
            entries.add(DARKELF_BRICK);
            entries.add(BURNT_LOG);
            entries.add(MOSSY_OAK_LOG);
            entries.add(DEAD_LOG);
            entries.add(SUNELF_LOG);
            entries.add(DROW_STONE);
            entries.add(DROW_BRICK);
            entries.add(DROW_LOG);
            entries.add(DROW_LEAVES);
            entries.add(DUSKWOOD_LEAVES);
            entries.add(DUSKWOOD_LOG);






        });
    }
}
