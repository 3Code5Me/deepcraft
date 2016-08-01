package com.djjbanx.deepcraft.common.other;

import com.djjbanx.deepcraft.common.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTab {
	public static final CreativeTabs tabDeepCraft = new CreativeTabs("DeepCraft") {
		@Override
		public Item getTabIconItem() {
			return ModItems.compressedDiamond;
		}
	};
}
