package com.djjbanx.deepcraft.common.blocks.storage;

import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHardenedDirt extends Block {

	public  BlockHardenedDirt() {
		super(Material.GROUND);
		this.setUnlocalizedName("hardenedDirtBlock")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(7.0f)
		.setResistance(30.0f)
		.setHarvestLevel("shovel", 3);
	}
	
}
