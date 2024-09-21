package net.west.fantasymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.west.fantasymod.Fantasymod;
import net.west.fantasymod.item.custom.wand;

public class ModItems {

    public static final Item WAND = registerItem("wand",new wand(new Item.Settings()));
    public static final Item MITHIRL = registerItem("mithirl", new Item(new Item.Settings()));
    public static final Item RAW_MITHIRL = registerItem("raw_mithirl",new Item(new Item.Settings()));

public static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(Fantasymod.MOD_ID, name), item);
}


    public static void registerModItems() {
        Fantasymod.LOGGER.info("Registering Mod Items for" + Fantasymod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MITHIRL);
            entries.add(RAW_MITHIRL);
            entries.add(WAND);
        });
    }

}
