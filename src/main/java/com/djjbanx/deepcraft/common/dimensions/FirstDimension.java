package com.djjbanx.deepcraft.common.dimensions;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class FirstDimension {
	private static int id = DimensionManager.getNextFreeDimId();
	public static void registerDimension() {
		DimensionManager.registerDimension(id, DimensionType.OVERWORLD);
		WorldProvider p = DimensionManager.createProviderFor(id);
	}
	public static int getID() {
		return id;
	}
}
