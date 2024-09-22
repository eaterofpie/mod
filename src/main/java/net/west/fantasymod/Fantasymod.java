package net.west.fantasymod;

import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.west.fantasymod.block.ModBlocks;
import net.west.fantasymod.item.ModItemGroups;
import net.west.fantasymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.registry.Registry.*;

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


