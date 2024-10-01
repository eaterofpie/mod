package net.west.fantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.west.fantasymod.Fantasymod;
import net.west.fantasymod.block.ModBlocks;
import net.west.fantasymod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> MITHIRL_SMELTABLES = List.of(ModItems.MITHIRL, ModBlocks.MITHIRL_ORE,
                ModBlocks.MITHIRL_DEEPSLATE_ORE);


        offerSmelting(exporter, MITHIRL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHIRL, 0.25f, 200, "mithirl");
        offerBlasting(exporter, MITHIRL_SMELTABLES, RecipeCategory.MISC, ModItems.RAW_MITHIRL, 0.25f, 100, "raw_mithirl");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHIRL, RecipeCategory.DECORATIONS, ModBlocks.MITHIRL_COBBLE, convertBetween(ModBlocks.MITHIRL_COBBLE, ModItems.MITHIRL), null, convertBetween(ModItems.MITHIRL, ModBlocks.MITHIRL_COBBLE), null);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHIRL_COBBLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHIRL_STONE, convertBetween(ModBlocks.MITHIRL_STONE, ModBlocks.MITHIRL_COBBLE), null, convertBetween(ModBlocks.MITHIRL_COBBLE, ModBlocks.MITHIRL_STONE), null);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHIRL_COBBLE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModItems.MITHIRL)
                .criterion(hasItem(ModItems.MITHIRL), conditionsFromItem(ModItems.MITHIRL))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "mithril_cobble_from_raw_mithril"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHIRL_STONE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.MITHIRL_COBBLE)
                .criterion(hasItem(ModBlocks.MITHIRL_COBBLE), conditionsFromItem(ModBlocks.MITHIRL_COBBLE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "mithril_stone_from_mithirl_cobble"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHIRL_STONEBRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.MITHIRL_STONE)
                .criterion(hasItem(ModBlocks.MITHIRL_STONE), conditionsFromItem(ModBlocks.MITHIRL_STONE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "mithril_stonebrick_from_mithirl_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DWARF_COBBLE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModItems.DWARFIRON)
                .criterion(hasItem(ModItems.DWARFIRON), conditionsFromItem(ModItems.DWARFIRON))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "dwarf_cobble_from_dwarfiron"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DWARF_COBBLESTONE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DWARF_COBBLE)
                .criterion(hasItem(ModBlocks.DWARF_COBBLE), conditionsFromItem(ModBlocks.DWARF_COBBLE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "dwarf_cobblestone_from_dwarf_cobble"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DWARF_STONE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DWARF_COBBLE)
                .criterion(hasItem(ModBlocks.DWARF_COBBLE), conditionsFromItem(ModBlocks.DWARF_COBBLE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "dwarf_stone_from_dwarf_cobble"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DWARF_STONEBRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DWARF_STONE)
                .criterion(hasItem(ModBlocks.DWARF_STONE), conditionsFromItem(ModBlocks.DWARF_STONE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "dwarf_stonebrick_from_dwarf_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DWARF_STONEBLOCK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DWARF_STONEBRICK)
                .criterion(hasItem(ModBlocks.DWARF_STONEBRICK), conditionsFromItem(ModBlocks.DWARF_STONEBRICK))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "dwarf_stoneblock_from_dwarf_stonebrick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DWARF_BRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DWARF_STONE)
                .criterion(hasItem(ModBlocks.DWARF_STONE), conditionsFromItem(ModBlocks.DWARF_STONE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "dwarf_brick_from_dwarf_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DROW_STONE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DROW_COBBLE)
                .criterion(hasItem(ModBlocks.DROW_COBBLE), conditionsFromItem(ModBlocks.DROW_COBBLE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "drow_stone_from_drow_cobble"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DROW_BRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DROW_STONE)
                .criterion(hasItem(ModBlocks.DROW_STONE), conditionsFromItem(ModBlocks.DROW_STONE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "drow_brick_from_drow_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKELF_BRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DARKELF_STONE)
                .criterion(hasItem(ModBlocks.DARKELF_STONE), conditionsFromItem(ModBlocks.DARKELF_STONE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "darkelf_brick_from_darkelf_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKELF_COBALT)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DARKELF_BRICK)
                .criterion(hasItem(ModBlocks.DARKELF_BRICK), conditionsFromItem(ModBlocks.DARKELF_BRICK))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "darkelf_cobalt_from_darkelf_brick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKELF_BEIGE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.DARKELF_COBALT)
                .criterion(hasItem(ModBlocks.DARKELF_COBALT), conditionsFromItem(ModBlocks.DARKELF_COBALT))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "darkelf_beige_from_darkelf_cobalt"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKELF_BEIGE_SLAB)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.DARKELF_BEIGE)
                .criterion(hasItem(ModBlocks.DARKELF_BEIGE), conditionsFromItem(ModBlocks.DARKELF_BEIGE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "darkelf_beige_slab_from_darkelf_beige"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.DARKELF_LAGANLOG)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.DARKELF_COBALT)
                .criterion(hasItem(ModBlocks.DARKELF_COBALT), conditionsFromItem(ModBlocks.DARKELF_COBALT))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "darkelf_laganlog_from_darkelf_cobalt"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOODELF_COBBLE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModItems.GEM_RUDY)
                .criterion(hasItem(ModItems.GEM_RUDY), conditionsFromItem(ModItems.GEM_RUDY))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "bloodelf_cobble_from_gem_ruby"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOODELF_STONE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.BLOODELF_COBBLE)
                .criterion(hasItem(ModBlocks.BLOODELF_COBBLE), conditionsFromItem(ModBlocks.BLOODELF_COBBLE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "bloodelf_stone_from_bloodelf_cobble"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOODELF_BRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.BLOODELF_STONE)
                .criterion(hasItem(ModBlocks.BLOODELF_STONE), conditionsFromItem(ModBlocks.BLOODELF_STONE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "bloodelf_brick_from_bloodelf_stone"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHAOSDWARF_STONE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.CHAOSDWARF_COBBLE)
                .criterion(hasItem(ModBlocks.CHAOSDWARF_COBBLE), conditionsFromItem(ModBlocks.CHAOSDWARF_COBBLE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "chaosdwarf_stone_from_chaosdwarf_cobble"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHAOSDWARF_COBBLE)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModItems.GEM_RUDY)
                .criterion(hasItem(ModItems.GEM_RUDY), conditionsFromItem(ModItems.GEM_RUDY))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "chaosdwarf_cobble_from_gem_ruby"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHAOSDWARF_BRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.CHAOSDWARF_STONE)
                .criterion(hasItem(ModBlocks.CHAOSDWARF_STONE), conditionsFromItem(ModBlocks.CHAOSDWARF_STONE))
                .offerTo(exporter, Identifier.of(Fantasymod.MOD_ID, "chaosdwarf_brick_from_chaosdwarf_stone"));
    }

}

