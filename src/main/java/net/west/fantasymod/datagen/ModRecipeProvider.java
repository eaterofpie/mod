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




        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MITHIRL, RecipeCategory.DECORATIONS, ModBlocks.MITHIRL_ORE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHIRL, RecipeCategory.DECORATIONS, ModBlocks.MITHIRL_COBBLE);






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


    }


}

