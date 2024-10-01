package net.west.fantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.west.fantasymod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DWARF_BRICK)
                .add(ModBlocks.DWARF_COBBLESTONE)
                .add(ModBlocks.DWARF_COBBLE)
                .add(ModBlocks.DWARF_STONE)
                .add(ModBlocks.DWARF_STONEBLOCK)
                .add(ModBlocks.DWARF_STONEBRICK)
                .add(ModBlocks.DWARF_ONYNIC)
                .add(ModBlocks.DARKELF_COBALT)
                .add(ModBlocks.DARKELF_STONEBRICK)
                .add(ModBlocks.DARKELF_BEIGE)
                .add(ModBlocks.DARKELF_BEIGE_SLAB)
                .add(ModBlocks.DWARF_LIMESTONE)
                .add(ModBlocks.DWARF_PILLAR)
                .add(ModBlocks.DWARF_RED_STONE)
                .add(ModBlocks.DWARF_CRYSTAL_STONE)
                .add(ModBlocks.IRON_STONEBRICK)
                .add(ModBlocks.IRON_STONE)
                .add(ModBlocks.LIME_MOSSYSTONE)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.CRYSTAL_STONE)
                .add(ModBlocks.SILVER_STONE)
                .add(ModBlocks.BLACK_STONEBRICK)
                .add(ModBlocks.BLACK_COBBLE)
                .add(ModBlocks.MITHIRL_STONEBRICK)
                .add(ModBlocks.MITHIRL_STONE)
                .add(ModBlocks.MITHIRL_DEEPSLATE)
                .add(ModBlocks.MITHIRL_COBBLE)
                .add(ModBlocks.MITHIRL_DEEPSLATE_ORE)
                .add(ModBlocks.MITHIRL_ORE)
                .add(ModBlocks.DWARF_WHITEBRICK)
                .add(ModBlocks.DARKELF_BRICK)
                .add(ModBlocks.DARKELF_BEIGE)
                .add(ModBlocks.DROW_BRICK)
                .add(ModBlocks.DROW_STONE)
                .add(ModBlocks.DROW_COBBLE)
                .add(ModBlocks.HIEXEL_STONE)
                .add(ModBlocks.RIVER_STONE)
                .add(ModBlocks.SOUL_STONE)
                .add(ModBlocks.SOUL_BRICK)
                .add(ModBlocks.DWARF_CELESTIAL)
                .add(ModBlocks.BLOODELF_COBBLE)
                .add(ModBlocks.BLOODELF_STONE)
                .add(ModBlocks.BLOODELF_BRICK)
                .add(ModBlocks.CHAOSDWARF_COBBLE)
                .add(ModBlocks.CHAOSDWARF_STONE)
                .add(ModBlocks.CHAOSDWARF_BRICK)
                .add(ModBlocks.SOUL_STONE_FENCE);






        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.DARKELF_LAGANLOG)
                .add(ModBlocks.DWARF_EMERWAVELOG)
                .add(ModBlocks.DWARF_YORKRYLOG)
                .add(ModBlocks.DWARF_LIGHTLOG)
                .add(ModBlocks.DWARF_SAPLOG)
                .add(ModBlocks.ELF_LANTOLOG)
                .add(ModBlocks.DWARF_GIOLOG)
                .add(ModBlocks.DWARF_ARAPAHOLOG)
                .add(ModBlocks.DARKELF_CROTHERLOG)
                .add(ModBlocks.SUNELF_LOG)
                .add(ModBlocks.MOSSY_OAK_LOG)
                .add(ModBlocks.SOUL_LOG)
                .add(ModBlocks.IRONWOOD_LOG)
                .add(ModBlocks.HIEXEL_LOG)
                .add(ModBlocks.FALL_SOUL_LOG)
                .add(ModBlocks.DUSKWOOD_LOG)
                .add(ModBlocks.DROW_LOG)
                .add(ModBlocks.DEAD_LOG)
                .add(ModBlocks.BURNT_LOG)
                .add(ModBlocks.CRYSTAL_LOG)
                .add(ModBlocks.WEALT_LOG)
                .add(ModBlocks.VAGLIR_LOG)
                .add(ModBlocks.SILVER_LOG)
                .add(ModBlocks.SILVER_LEAVES)
                .add(ModBlocks.DUSKWOOD_LEAVES)
                .add(ModBlocks.DWARF_GIO_LEAVES)
                .add(ModBlocks.DROW_LEAVES)
                .add(ModBlocks.WEALT_LEAVES)
                .add(ModBlocks.CRYSTAL_LEAVES)
                .add(ModBlocks.DWARF_light_LEAVES)
                .add(ModBlocks.ELF_LANTO_LEAVES)
                .add(ModBlocks.HIEXEL_LEAVES)
                .add(ModBlocks.IRONWOOD_LEAVES)
                .add(ModBlocks.SOUL_LEAVES);





        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.SOUL_STONE_FENCE);

    }
}
