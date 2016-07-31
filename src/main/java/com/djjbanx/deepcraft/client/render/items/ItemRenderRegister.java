package com.djjbanx.deepcraft.client.render.items;

import com.djjbanx.deepcraft.common.DeepCraft;
import com.djjbanx.deepcraft.common.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		reg(ModItems.compressedIron);
		reg(ModItems.compressedGold);
		reg(ModItems.compressedDiamond);
	}
	
	public static void reg(Item item, int meta) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, meta, new ModelResourceLocation(DeepCraft.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(DeepCraft.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
