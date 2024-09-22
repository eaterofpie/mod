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
    public static final ItemGroup DWARF_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Fantasymod.MOD_ID,"dwarf_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.MITHIRL))
                    .displayName(Text.translatable("itemgroup.fantasymod.mithril_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MITHIRL);
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

                    })


                    .build());


    public static void registerItemGroups() {
        Fantasymod.LOGGER.info("Registering Item Groups for" + Fantasymod.MOD_ID);
    }
}
