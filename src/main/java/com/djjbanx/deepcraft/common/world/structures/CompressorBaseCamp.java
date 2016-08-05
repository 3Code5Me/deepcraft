package com.djjbanx.deepcraft.common.world.structures;

import java.util.Random;

import com.djjbanx.deepcraft.common.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class CompressorBaseCamp extends WorldGenerator {
	
	private final int[][] clear = new int[][] {
		{0,0,0},{1,0,0},{2,0,0},{3,0,0},{4,0,0},{5,0,0},{6,0,0},
		{0,0,1},{1,0,1},{2,0,1},{3,0,1},{4,0,1},{5,0,1},{6,0,1},
		{0,0,2},{1,0,2},{2,0,2},{3,0,2},{4,0,2},{5,0,2},{6,0,2},
		{0,0,3},{1,0,3},{2,0,3},{3,0,3},{4,0,3},{5,0,3},{6,0,3},
		{0,0,4},{1,0,4},{2,0,4},{3,0,4},{4,0,4},{5,0,4},{6,0,4},
		
		{0,1,0},{1,1,0},{2,1,0},{3,1,0},{4,1,0},{5,1,0},{6,1,0},
		{0,1,1},{1,1,1},{2,1,1},{3,1,1},{4,1,1},{5,1,1},{6,1,1},
		{0,1,2},{1,1,2},{2,1,2},{3,1,2},{4,1,2},{5,1,2},{6,1,2},
		{0,1,3},{1,1,3},{2,1,3},{3,1,3},{4,1,3},{5,1,3},{6,1,3},
		{0,1,4},{1,1,4},{2,1,4},{3,1,4},{4,1,4},{5,1,4},{6,1,4},
		
		{0,2,0},{1,2,0},{2,2,0},{3,2,0},{4,2,0},{5,2,0},{6,2,0},
		{0,2,1},{1,2,1},{2,2,1},{3,2,1},{4,2,1},{5,2,1},{6,2,1},
		{0,2,2},{1,2,2},{2,2,2},{3,2,2},{4,2,2},{5,2,2},{6,2,2},
		{0,2,3},{1,2,3},{2,2,3},{3,2,3},{4,2,3},{5,2,3},{6,2,3},
		{0,2,4},{1,2,4},{2,2,4},{3,2,4},{4,2,4},{5,2,4},{6,2,4}
	};

	private final int[][] hardenedCobblePos = new int[][] { { 0, 0, 1 }, { 0, 0, 2 }, { 0, 0, 3 }, { 1, 0, 2 },
			{ 5, 0, 2 }, { 6, 0, 1 }, { 6, 0, 2 }, { 6, 0, 3 },

			{ 0, 1, 2 }, { 6, 1, 2 } };
	private final int[][] stoneSlabPos = new int[][] { { 0, 0, 4 }, { 1, 0, 3 }, { 2, 0, 4 }, { 4, 0, 4 }, { 5, 0, 3 },
			{ 6, 0, 4 } };

	private final int[][] torchPos = new int[][] { { 0, 1, 0 }, { 6, 1, 0 },

			{ 1, 2, 4 }, { 5, 2, 4 } };

	private final int[][] woodenFencePos = new int[][] { { 0, 0, 0 }, { 6, 0, 0 } };

	private final int[][] cobbleFencePos = new int[][] { { 1, 1, 4 }, { 5, 1, 4 } };

	private final int[] ironBlockPos = new int[] { 1, 0, 4 };
	private final int[] hardenedStonePos = new int[] { 5, 0, 4 };
	private final int[] compressorPos = new int[] { 3, 0, 4 };
	private final int[] anvilPos = new int[] { 3, 1, 4 };

	public CompressorBaseCamp() {
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		if (canSpawnHere(worldIn, position)) {
		IBlockState hardenedCobble = ModBlocks.hardenedCobblestone.getDefaultState();
		IBlockState stoneSlab = Blocks.STONE_SLAB.getDefaultState().withProperty(BlockSlab.HALF,
				BlockSlab.EnumBlockHalf.BOTTOM);
		IBlockState torch = Blocks.TORCH.getDefaultState().withProperty(BlockTorch.FACING, EnumFacing.UP);
		IBlockState woodenFence = Blocks.OAK_FENCE.getDefaultState();
		IBlockState cobbleFence = Blocks.COBBLESTONE_WALL.getDefaultState().withProperty(BlockWall.VARIANT,
				BlockWall.EnumType.NORMAL);
		IBlockState ironBlock = Blocks.IRON_BLOCK.getDefaultState();
		IBlockState hardenedStone = ModBlocks.hardenedStone.getDefaultState();
		IBlockState compressor = ModBlocks.compressor.getDefaultState();
		IBlockState anvil = Blocks.ANVIL.getDefaultState().withProperty(BlockAnvil.DAMAGE, 0);

		clearArea(worldIn, position, clear);
		
		buildLayer(worldIn, position, hardenedCobblePos, hardenedCobble);
		buildLayer(worldIn, position, stoneSlabPos, stoneSlab);
		buildLayer(worldIn, position, torchPos, torch);
		buildLayer(worldIn, position, woodenFencePos, woodenFence);
		buildLayer(worldIn, position, cobbleFencePos, cobbleFence);

		placeBlock(worldIn, position, ironBlockPos, ironBlock);
		placeBlock(worldIn, position, hardenedStonePos, hardenedStone);
		placeBlock(worldIn, position, compressorPos, compressor);
		placeBlock(worldIn, position, anvilPos, anvil);

		System.out.println("Built a Base Camp at " + position);
		return true;
		}
		System.out.println("There was no solid block at selected spot: " + position);
		return false;
	}

	private void clearArea(World world, BlockPos frontLeftCorner, int[][] blockPositions) {
		for (int[] coord : blockPositions) {
			removeBlock(world, frontLeftCorner, coord[0], coord[1], coord[2]);
		}
	}
	
	private void removeBlock(World world, BlockPos frontLeftCorner, int offsetX, int offsetY, int offsetZ) {
		BlockPos placePos = frontLeftCorner.add(offsetX, offsetY, offsetZ);
		world.destroyBlock(placePos, false);
	}

	private void buildLayer(World world, BlockPos frontLeftCorner, int[][] blockPositions, IBlockState toPlace) {
		// iterate through the entire int[][]
		for (int[] coord : blockPositions) {
			placeBlock(world, frontLeftCorner, coord[0], coord[1], coord[2], toPlace);
		}
	}

	/** Helper Method **/
	private void placeBlock(World world, BlockPos frontLeftCorner, int[] offsets, IBlockState toPlace) {
		placeBlock(world, frontLeftCorner, offsets[0], offsets[1], offsets[2], toPlace);
	}

	/** Places a block using corner position and offsets **/
	private void placeBlock(World world, BlockPos frontLeftCorner, int offsetX, int offsetY, int offsetZ,
			IBlockState toPlace) {
		// figure out where that block is relative to the corner
		BlockPos placePos = frontLeftCorner.add(offsetX, offsetY, offsetZ);
		world.setBlockState(placePos, toPlace, 2);
	}
	
	private boolean canSpawnHere(World world, BlockPos pos) {
		BlockPos bottomRight = pos.add(7, 0, 0);
		BlockPos topRight = pos.add(7, 0, 5);
		BlockPos topLeft = pos.add(0, 0, 5);
		
		return isBlockValid(world, pos) && isBlockValid(world, bottomRight) && isBlockValid(world, topRight) && isBlockValid(world, topLeft);
	}
	private boolean isBlockValid(World world, BlockPos pos) {
		Block at = world.getBlockState(pos).getBlock();
		return at.isBlockSolid(world, pos, EnumFacing.UP) && !at.isFoliage(world, pos) && !at.isWood(world, pos);
	}
}
