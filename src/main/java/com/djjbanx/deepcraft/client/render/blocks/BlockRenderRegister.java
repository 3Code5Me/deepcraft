package com.djjbanx.deepcraft.client.render.blocks;

import com.djjbanx.deepcraft.common.DeepCraft;
import com.djjbanx.deepcraft.common.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	public static void registerBlockRenderer() {
		reg(ModBlocks.compressedIronBlock);
		reg(ModBlocks.compressedGoldBlock);
		reg(ModBlocks.compressedDiamondBlock);
		reg(ModBlocks.hardenedDirtBlock);
		reg(ModBlocks.hardenedGravelBlock);
		reg(ModBlocks.hardenedStoneBlock);
	}
	
	public static void reg(Block block, int meta) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(DeepCraft.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(DeepCraft.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
