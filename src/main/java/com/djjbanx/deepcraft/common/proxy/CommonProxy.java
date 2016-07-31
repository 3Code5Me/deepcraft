package com.djjbanx.deepcraft.common.proxy;

import com.djjbanx.deepcraft.common.blocks.ModBlocks;
import com.djjbanx.deepcraft.common.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	ModItems.createItems();
    	ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
