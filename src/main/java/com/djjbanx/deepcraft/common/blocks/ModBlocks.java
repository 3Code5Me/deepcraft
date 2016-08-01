package com.djjbanx.deepcraft.common.blocks;

import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedDiamond;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedGold;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedIron;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block compressedIronBlock;
	public static Block compressedGoldBlock;
	public static Block compressedDiamondBlock;
	
	public static void createBlocks() {
		GameRegistry.registerBlock(compressedIronBlock = new BlockCompressedIron(), "compressedIronBlock");
		GameRegistry.registerBlock(compressedGoldBlock = new BlockCompressedGold(), "compressedGoldBlock");
		GameRegistry.registerBlock(compressedDiamondBlock = new BlockCompressedDiamond(), "compressedDiamondBlock");
	}
}
