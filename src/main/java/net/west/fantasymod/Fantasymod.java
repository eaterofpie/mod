package net.west.fantasymod;

import net.fabricmc.api.ModInitializer;


import net.west.fantasymod.block.ModBlocks;
import net.west.fantasymod.item.ModItemGroups;
import net.west.fantasymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Fantasymod implements ModInitializer {
	public static final String MOD_ID = "fantasymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);











	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}

}


