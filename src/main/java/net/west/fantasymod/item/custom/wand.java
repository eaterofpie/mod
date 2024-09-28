package net.west.fantasymod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.west.fantasymod.block.ModBlocks;

import java.util.Map;

public class wand extends Item {
    public static final Map<Block, Block> WAND_MAP =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.BLUE_WOOL, ModBlocks.BLACK_STONEBRICK,
                    Blocks.RED_WOOL, ModBlocks.BLACK_STONE,
                    Blocks.GREEN_WOOL, ModBlocks.DARKELF_BRICK,
                    Blocks.LIGHT_BLUE_WOOL, ModBlocks.DWARF_LIMESTONE,
                    Blocks.PINK_WOOL, ModBlocks.DARKELF_STONE

            );
    public wand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if (WAND_MAP.containsKey(clickBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), WAND_MAP.get(clickBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                       item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

            }

        }

        return ActionResult.SUCCESS;
    }
}
