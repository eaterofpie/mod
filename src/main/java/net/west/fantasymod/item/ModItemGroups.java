package net.west.fantasymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.west.fantasymod.Fantasymod;
import net.west.fantasymod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MITHIRL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Fantasymod.MOD_ID,"mithirl_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.MITHIRL))
                    .displayName(Text.translatable("itemgroup.fantasymod.mithril"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DWARFSILVER);
                        entries.add(ModItems.DWARFIRON);
                        entries.add(ModItems.GEM_RUDY);
                        entries.add(ModItems.MITHIRL);
                        entries.add(ModBlocks.MITHIRL_ORE);
                        entries.add(ModBlocks.MITHIRL_DEEPSLATE_ORE);
                        entries.add(ModBlocks.MITHIRL_STONE);
                        entries.add(ModBlocks.MITHIRL_COBBLE);
                        entries.add(ModBlocks.MITHIRL_STONEBRICK);
                        entries.add(ModBlocks.BLACK_STONEBRICK);
                        entries.add(ModBlocks.MITHIRL_DEEPSLATE);
                        entries.add(ModBlocks.BLACK_STONE);
                        entries.add(ModBlocks.BLACK_COBBLE);
                        entries.add(ModBlocks.SILVER_STONE);
                        entries.add(ModBlocks.CRYSTAL_STONE);
                        entries.add(ModBlocks.LIMESTONE);
                        entries.add(ModBlocks.RIVER_STONE);
                        entries.add(ModBlocks.HIEXEL_STONE);
                        entries.add(ModBlocks.SOUL_STONE);
                        entries.add(ModBlocks.SOUL_BRICK);
                        entries.add(ModBlocks.DARKELF_BEIGE_SLAB);
                        entries.add(ModBlocks.SOUL_STONE_FENCE);
                        entries.add(ModBlocks.DWARF_CELESTIAL);
                        entries.add(ModBlocks.DROW_COBBLE);
                        entries.add(ModBlocks.DWARF_COBBLE);
                        entries.add(ModBlocks.BLOODELF_COBBLE);
                        entries.add(ModBlocks.BLOODELF_STONE);
                        entries.add(ModBlocks.CHAOSDWARF_COBBLE);
                        entries.add(ModBlocks.CHAOSDWARF_STONE);
                        entries.add(ModBlocks.CHAOSDWARF_BRICK);

                    })


                    .build());
    public static final ItemGroup WAND_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Fantasymod.MOD_ID,"wood_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.WAND))
                    .displayName(Text.translatable("WOOD_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DUSKWOOD_LOG);
                        entries.add(ModBlocks.DUSKWOOD_LEAVES);
                        entries.add(ModBlocks.DROW_LEAVES);
                        entries.add(ModBlocks.DROW_LOG);
                        entries.add(ModBlocks.SUNELF_LOG);
                        entries.add(ModBlocks.SILVER_LEAVES);
                        entries.add(ModBlocks.SILVER_LOG);
                        entries.add(ModBlocks.DEAD_LOG);
                        entries.add(ModBlocks.VAGLIR_LOG);
                        entries.add(ModBlocks.BURNT_LOG);
                        entries.add(ModBlocks.DARKELF_LAGANLOG);;
                        entries.add(ModBlocks.CRYSTAL_LOG);
                        entries.add(ModBlocks.CRYSTAL_LEAVES);
                        entries.add(ModBlocks.SOUL_LOG);
                        entries.add(ModBlocks.SOUL_LEAVES);
                        entries.add(ModBlocks.IRONWOOD_LEAVES);
                        entries.add(ModBlocks.IRONWOOD_LOG);
                        entries.add(ModBlocks.DWARF_GIOLOG);
                        entries.add(ModBlocks.DWARF_light_LEAVES);
                        entries.add(ModBlocks.DWARF_LIGHTLOG);
                        entries.add(ModBlocks.DWARF_YORKRYLOG);
                        entries.add(ModBlocks.ELF_LANTO_LEAVES);
                        entries.add(ModBlocks.ELF_LANTOLOG);
                        entries.add(ModBlocks.DWARF_GIO_LEAVES);
                        entries.add(ModBlocks.WEALT_LEAVES);
                        entries.add(ModBlocks.WEALT_LOG);
                        entries.add(ModBlocks.HIEXEL_LOG);
                        entries.add(ModBlocks.HIEXEL_LEAVES);
                        entries.add(ModBlocks.FALL_SOUL_LOG);

                    })


                    .build());
    public static final ItemGroup RAW_MITHIRL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Fantasymod.MOD_ID,"forest_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.RAW_MITHIRL))
                    .displayName(Text.translatable("forest_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SOUL_MUSHROOM);
                        entries.add(ModBlocks.DARKELF_TORCH);
                        entries.add(ModBlocks.CRYSTAL_TORCH);
                        entries.add(ModBlocks.ELF_VINE);
                        entries.add(ModBlocks.ELF_TWISTING_VINES);
                        entries.add(ModBlocks.DROW_VINE);
                    })


                    .build());




    public static void registerItemGroups() {
        Fantasymod.LOGGER.info("Registering Item Groups for" + Fantasymod.MOD_ID);
    }
}
