package com.djjbanx.deepcraft.common.world;

import java.util.Random;

import com.djjbanx.deepcraft.common.blocks.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			//Rate 6 MinH 5 MaxH 126
			this.runGenerator(genBlackPowderOre, world, random, chunkX, chunkZ, 6, 5, 126);
			//Rate 12 MinH 32 MaxH 126
			this.runGenerator(genBoneOre, world, random, chunkX, chunkZ, 12, 32, 126);
			break;
		case -1:
			
			break;
		case 1:
			
			break;
		}
	}
	
	private WorldGenerator genBlackPowderOre; //Generates Black Powder Ore
	private WorldGenerator genBoneOre;
	
	public OreWorldGen() {
		//4
		this.genBlackPowderOre = new WorldGenMinable(ModBlocks.blackPowderOre.getDefaultState(), 4);
		//3
		this.genBoneOre = new WorldGenMinable(ModBlocks.boneOre.getDefaultState(), 3);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunkX * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunkZ * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}
