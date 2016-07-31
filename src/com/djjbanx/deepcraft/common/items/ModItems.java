package com.djjbanx.deepcraft.common.items;

import com.djjbanx.deepcraft.common.items.rescources.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item compressedIron;
	public static Item compressedGold;
	public static Item compressedDiamond;
	
	public static void createItems() {
		GameRegistry.registerItem(compressedIron = new ItemCompressedIron(), "compressedIron");
		GameRegistry.registerItem(compressedGold = new ItemCompressedGold(), "compressedGold");
		GameRegistry.registerItem(compressedDiamond = new ItemCompressedDiamond(), "compressedDiamond");
		
	}
}
