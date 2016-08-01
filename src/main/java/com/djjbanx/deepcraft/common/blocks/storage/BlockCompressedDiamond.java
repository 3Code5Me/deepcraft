package com.djjbanx.deepcraft.common.blocks.storage;

import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCompressedDiamond extends Block {

	public BlockCompressedDiamond() {
		super(Material.IRON);
		this.setUnlocalizedName("compressedDiamondBlock")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(10.0f)
		.setResistance(60.0f)
		.setHarvestLevel("pickaxe", 3);
	}
	
}
