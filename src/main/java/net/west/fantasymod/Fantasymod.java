package net.west.fantasymod;

import net.fabricmc.api.ModInitializer;



import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
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


