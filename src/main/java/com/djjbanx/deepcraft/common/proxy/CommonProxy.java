package com.djjbanx.deepcraft.common.proxy;

import com.djjbanx.deepcraft.common.blocks.ModBlocks;
import com.djjbanx.deepcraft.common.crafting.ModCrafting;
import com.djjbanx.deepcraft.common.items.ModItems;
import com.djjbanx.deepcraft.common.world.ModWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	ModItems.createItems();
    	ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent event) {
    	ModCrafting.initCrafting();
    	
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
