package com.djjbanx.deepcraft.common.blocks.storage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCompressedGold extends Block {

	public BlockCompressedGold() {
		super(Material.IRON);
		this.setUnlocalizedName("compressedGoldBlock")
		.setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
		.setHardness(10.0f)
		.setResistance(60.0f)
		.setHarvestLevel("pickaxe", 3);
	}
	
}
