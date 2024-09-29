package net.west.fantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.west.fantasymod.block.ModBlocks;
import net.west.fantasymod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool modelGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOUL_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FALL_SOUL_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_CRYSTAL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHIRL_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARKELF_LAGANLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_STONEBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHIRL_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHIRL_STONEBRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTAL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELF_LANTO_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEALT_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEALT_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEAD_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTAL_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_GIO_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DROW_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DROW_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELF_LANTOLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_YORKRYLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_GIOLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_SAPLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VAGLIR_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_STONEBRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_LIGHTLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARKELF_COBALT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARKELF_CROTHERLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BURNT_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTAL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARKELF_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARKELF_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARKELF_STONEBRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DROW_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DROW_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUSKWOOD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUSKWOOD_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_ARAPAHOLOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_EMERWAVELOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_light_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_ONYNIC);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_RED_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_STONEBRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_WHITEBRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HIEXEL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HIEXEL_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HIEXEL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_STONEBRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRONWOOD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRONWOOD_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_MOSSYSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_OAK_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RIVER_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUNELF_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHIRL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARF_CELESTIAL);


        modelGarnetPool.fence(ModBlocks.SOUL_STONE_FENCE);
        modelGarnetPool.slab(ModBlocks.DARKELF_BEIGE_SLAB);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WAND, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MITHIRL,Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHIRL,Models.GENERATED);

    }
}
