package com.djjbanx.deepcraft.client.proxy;

import com.djjbanx.deepcraft.client.render.blocks.BlockRenderRegister;
import com.djjbanx.deepcraft.client.render.items.ItemRenderRegister;
import com.djjbanx.deepcraft.common.proxy.CommonProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		super.init(event);
		
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		super.postInit(event);
	}
}
