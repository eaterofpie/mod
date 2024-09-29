package net.west.fantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.west.fantasymod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.FALL_SOUL_LOG);
        addDrop(ModBlocks.SOUL_MUSHROOM);
        addDrop(ModBlocks.DARKELF_LAGANLOG);
        addDrop(ModBlocks.MITHIRL_COBBLE);
        addDrop(ModBlocks.DWARF_CRYSTAL_STONE);
        addDrop(ModBlocks.DWARF_STONE);


    }
}
