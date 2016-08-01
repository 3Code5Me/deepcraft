package com.djjbanx.deepcraft.common.blocks.storage;

import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHardenedGravel extends Block {

	public  BlockHardenedGravel() {
		super(Material.IRON);
		this.setUnlocalizedName("hardenedGravelBlock")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(5.0f)
		.setResistance(35.0f)
		.setHarvestLevel("pickaxe", 3);
	}
	
}
