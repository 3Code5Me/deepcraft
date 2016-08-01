package com.djjbanx.deepcraft.common.blocks.storage;
import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHardenedStone extends Block {

	public  BlockHardenedStone() {
		super(Material.ROCK);
		this.setUnlocalizedName("hardenedStoneBlock")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(10.0f)
		.setResistance(50.0f)
		.setHarvestLevel("pickaxe", 3);
	}
	
}
