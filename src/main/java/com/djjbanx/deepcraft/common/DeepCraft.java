package com.djjbanx.deepcraft.common;

import com.djjbanx.deepcraft.common.proxy.CommonProxy;

import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DeepCraft.MODID, name = DeepCraft.MODNAME, version = DeepCraft.VERSION)
public class DeepCraft {
    public static final String MODID = "deepcraft";
    public static final String MODNAME = "Deep Craft";
    public static final String VERSION = "1.0";
    
    @Instance
    public static DeepCraft instance = new DeepCraft();
    
    @SidedProxy(clientSide = "com.djjbanx.deepcraft.client.proxy.ClientProxy", serverSide = "com.djjbanx.deepcraft.common.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    //PreInit reads config, creates blocks items etc, and registers them
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    //Init Builds data structures, adds crafting, and registers new handlers
    	proxy.init(event);

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    //PostInit communicates with others mods and makes last minute adjustments
    	proxy.postInit(event);
    }
}
