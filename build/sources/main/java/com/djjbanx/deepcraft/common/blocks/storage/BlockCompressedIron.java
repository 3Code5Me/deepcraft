package com.djjbanx.deepcraft.common.blocks.storage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCompressedIron extends Block {

	public BlockCompressedIron() {
		super(Material.IRON);
		this.setUnlocalizedName("compressedIronBlock")
		.setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
		.setHardness(10.0f)
		.setResistance(60.0f)
		.setHarvestLevel("pickaxe", 3);
	}
	
}
