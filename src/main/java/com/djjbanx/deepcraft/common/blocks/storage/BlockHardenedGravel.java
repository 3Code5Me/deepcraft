package com.djjbanx.deepcraft.common.blocks.storage;

import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockHardenedGravel extends BlockFalling {

	public  BlockHardenedGravel() {
		super(Material.SAND);
		this.setUnlocalizedName("hardenedGravel")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(5.0f)
		.setResistance(35.0f)
		.setHarvestLevel("shovel", 2);
	}
	
}
