package com.djjbanx.deepcraft.common.blocks.storage;
import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHardenedCobblestone extends Block {

	public  BlockHardenedCobblestone() {
		super(Material.ROCK);
		this.setUnlocalizedName("hardenedCobblestone")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(8.0f)
		.setResistance(45.0f)
		.setHarvestLevel("pickaxe", 2);
	}
	
}
