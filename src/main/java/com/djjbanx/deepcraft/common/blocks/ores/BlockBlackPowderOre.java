package com.djjbanx.deepcraft.common.blocks.ores;

import java.util.Random;

import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockBlackPowderOre extends Block {

	public BlockBlackPowderOre() {
		super(Material.ROCK);
		this.setUnlocalizedName("blackPowderOre")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(3.0f)
		.setResistance(15.0f)
		.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
		return Items.GUNPOWDER;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
		return 1 + random.nextInt(3 + fortune);
	}
	
}
