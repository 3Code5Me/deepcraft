package com.djjbanx.deepcraft.common.world;

import java.util.Random;

import com.djjbanx.deepcraft.common.world.structures.CompressorBaseCamp;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class StructureWorldGen implements IWorldGenerator {

	CompressorBaseCamp compressorBaseCamp;
	
	public StructureWorldGen() {
		compressorBaseCamp = new CompressorBaseCamp();
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			//default is 1% (0.01) chance to spawn minY=10, maxY=64
			this.runGenerator(compressorBaseCamp, world, random, chunkX, chunkZ, 0.01, 10, 64);
			break;
		case -1:
			
			break;
		case 1:
			
			break;
		}
	}

	private void runGenerator(WorldGenerator structure, World world, Random rand, int chunkX, int chunkZ, double chanceToSpawnPerChunk, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		int heightDiff = maxHeight - minHeight + 1;
	    
	    if (rand.nextDouble() < chanceToSpawnPerChunk) {
	    int x = chunkX * 16 + rand.nextInt(16);
	    int y = minHeight + rand.nextInt(heightDiff);
	    int z = chunkZ * 16 + rand.nextInt(16);
	    structure.generate(world, rand, new BlockPos(x, y, z));
	    }
	}

}
