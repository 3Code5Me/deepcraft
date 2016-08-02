package com.djjbanx.deepcraft.common.blocks;

import com.djjbanx.deepcraft.common.DeepCraft;
import com.djjbanx.deepcraft.common.blocks.machines.BlockCompressor;
import com.djjbanx.deepcraft.common.blocks.ores.BlockBlackPowderOre;
import com.djjbanx.deepcraft.common.blocks.ores.BlockBoneOre;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedDiamond;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedGold;
import com.djjbanx.deepcraft.common.blocks.storage.BlockCompressedIron;
import com.djjbanx.deepcraft.common.blocks.storage.BlockHardenedCobblestone;
import com.djjbanx.deepcraft.common.blocks.storage.BlockHardenedDirt;
import com.djjbanx.deepcraft.common.blocks.storage.BlockHardenedGravel;
import com.djjbanx.deepcraft.common.blocks.storage.BlockHardenedStone;
import com.djjbanx.deepcraft.common.blocks.tile.CompressorTileEntity;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block compressedIronBlock;
	public static Block compressedGoldBlock;
	public static Block compressedDiamondBlock;
	
	public static Block hardenedDirt;
	public static Block hardenedGravel;
	public static Block hardenedStone;
	public static Block hardenedCobblestone;
	
	public static Block blackPowderOre;
	public static Block boneOre;
	
	public static Block compressor;
	
	public static void createBlocks() {
		registerBlock(compressedIronBlock = new BlockCompressedIron(), "compressedIronBlock");
		registerBlock(compressedGoldBlock = new BlockCompressedGold(), "compressedGoldBlock");
		registerBlock(compressedDiamondBlock = new BlockCompressedDiamond(), "compressedDiamondBlock");
		
		registerBlock(hardenedDirt = new BlockHardenedDirt(), "hardenedDirt");
		registerBlock(hardenedGravel = new BlockHardenedGravel(), "hardenedGravel");
		registerBlock(hardenedStone = new BlockHardenedStone(), "hardenedStone");
		registerBlock(hardenedCobblestone = new BlockHardenedCobblestone(), "hardenedCobblestone");
		
		registerBlock(blackPowderOre = new BlockBlackPowderOre(), "blackPowderOre");
		registerBlock(boneOre = new BlockBoneOre(), "boneOre");
		
		registerBlock(compressor = new BlockCompressor(), "compressor");
	}
	
	public static void createTileEntities() {
		registerTile(CompressorTileEntity.class, "compressorTileEntity");
	}

	private static void registerTile(Class<? extends TileEntity> entity, String id) {
		GameRegistry.registerTileEntity(entity, id);
	}
	
	private static void registerBlock(Block block, String string) {
		block.setRegistryName(DeepCraft.MODID, string);
		GameRegistry.register(block);
		ItemBlock iblock = new ItemBlock(block);
		iblock.setRegistryName(DeepCraft.MODID, string);
		GameRegistry.register(iblock);
	}
}
