package com.djjbanx.deepcraft.common.blocks.storage;
import java.util.Random;

import com.djjbanx.deepcraft.common.blocks.ModBlocks;
import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockHardenedStone extends Block {

	public  BlockHardenedStone() {
		super(Material.ROCK);
		this.setUnlocalizedName("hardenedStone")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(10.0f)
		.setResistance(50.0f)
		.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
		return Item.getItemFromBlock(ModBlocks.hardenedCobblestone);
	}
	
}
