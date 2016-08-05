package com.djjbanx.deepcraft.common.proxy;

import com.djjbanx.deepcraft.common.DeepCraft;
import com.djjbanx.deepcraft.common.blocks.ModBlocks;
import com.djjbanx.deepcraft.common.crafting.ModCrafting;
import com.djjbanx.deepcraft.common.items.ModItems;
import com.djjbanx.deepcraft.common.network.GuiHandler;
import com.djjbanx.deepcraft.common.world.OreWorldGen;
import com.djjbanx.deepcraft.common.world.StructureWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	ModItems.createItems();
    	ModBlocks.createBlocks();
    	ModBlocks.createTileEntities();
    }

    public void init(FMLInitializationEvent event) {
    	ModCrafting.initCrafting();
    	
    	GameRegistry.registerWorldGenerator(new OreWorldGen(), 0);
    	GameRegistry.registerWorldGenerator(new StructureWorldGen(), 0);
    	
    	NetworkRegistry.INSTANCE.registerGuiHandler(DeepCraft.instance, new GuiHandler());
    	
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
