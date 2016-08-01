package com.djjbanx.deepcraft.common.blocks.storage;

import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCompressedIron extends Block {

	public BlockCompressedIron() {
		super(Material.IRON);
		this.setUnlocalizedName("compressedIronBlock")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(10.0f)
		.setResistance(60.0f)
		.setHarvestLevel("pickaxe", 3);
	}
	
}
