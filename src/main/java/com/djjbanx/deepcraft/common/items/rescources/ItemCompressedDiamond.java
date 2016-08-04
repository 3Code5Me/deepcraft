package com.djjbanx.deepcraft.common.items.rescources;

import com.djjbanx.deepcraft.common.DeepCraft;
import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ItemCompressedDiamond extends Item {
	public ItemCompressedDiamond() {
		super();
		setUnlocalizedName("compressedDiamond");
		setCreativeTab(ModCreativeTab.tabDeepCraft);
	}
}
