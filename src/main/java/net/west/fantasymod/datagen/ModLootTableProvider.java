package net.west.fantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
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
        addDrop(ModBlocks.SOUL_BRICK);
        addDrop(ModBlocks.SOUL_STONE);
        addDrop(ModBlocks.MITHIRL_STONE);
        addDrop(ModBlocks.LIMESTONE);
        addDrop(ModBlocks.IRON_STONE);
        addDrop(ModBlocks.SOUL_STONE_FENCE);
        addDrop(ModBlocks.DARKELF_BEIGE_SLAB);
        addDrop(ModBlocks.DARKELF_BEIGE);
        addDrop(ModBlocks.SILVER_STONE);
        addDrop(ModBlocks.HIEXEL_STONE);
        addDrop(ModBlocks.DARKELF_TORCH);
        addDrop(ModBlocks.CRYSTAL_TORCH);
        addDrop(ModBlocks.SOUL_LOG);
        addDrop(ModBlocks.MOSSY_OAK_LOG);
        addDrop(ModBlocks.DWARF_CELESTIAL);
        addDrop(ModBlocks.ELF_VINE);
        addDrop(ModBlocks.ELF_TWISTING_VINES);
        addDrop(ModBlocks.DROW_VINE);

    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
