package com.djjbanx.deepcraft.common.blocks;

import com.djjbanx.deepcraft.common.DeepCraft;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedDiamond;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedGold;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedIron;
import com.djjbanx.deepcraft.common.blocks.storage.BlockHardenedDirt;
import com.djjbanx.deepcraft.common.blocks.storage.BlockHardenedGravel;
import com.djjbanx.deepcraft.common.blocks.storage.BlockHardenedStone;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block compressedIronBlock;
	public static Block compressedGoldBlock;
	public static Block compressedDiamondBlock;
	
	public static Block hardenedDirtBlock;
	public static Block hardenedGravelBlock;
	public static Block hardenedStoneBlock;
	
	public static void createBlocks() {
		registerBlock(compressedIronBlock = new BlockCompressedIron(), "compressedIronBlock");
		registerBlock(compressedGoldBlock = new BlockCompressedGold(), "compressedGoldBlock");
		registerBlock(compressedDiamondBlock = new BlockCompressedDiamond(), "compressedDiamondBlock");
		
		registerBlock(hardenedDirtBlock = new BlockHardenedDirt(), "hardenedDirt");
		registerBlock(hardenedGravelBlock = new BlockHardenedGravel(), "hardenedGravel");
		registerBlock(hardenedStoneBlock = new BlockHardenedStone(), "hardenedStone");
	}

	private static void registerBlock(Block block, String string) {
		block.setRegistryName(DeepCraft.MODID, string);
		GameRegistry.register(block);
		ItemBlock iblock = new ItemBlock(block);
		iblock.setRegistryName(DeepCraft.MODID, string);
		GameRegistry.register(iblock);
	}
}
