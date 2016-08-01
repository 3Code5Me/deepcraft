package com.djjbanx.deepcraft.common.crafting;

import com.djjbanx.deepcraft.common.blocks.ModBlocks;
import com.djjbanx.deepcraft.common.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedIronBlock), new Object[] {
				"###",
				"###",
				"###",
				'#', ModItems.compressedIron
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedGoldBlock), new Object[] {
				"###",
				"###",
				"###",
				'#', ModItems.compressedGold
		});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedDiamondBlock), new Object[] {
				"###",
				"###",
				"###",
				'#', ModItems.compressedDiamond
		});
	}
}
