package com.djjbanx.deepcraft.common.blocks.storage;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Nullable;

import com.djjbanx.deepcraft.common.DeepCraft;
import com.djjbanx.deepcraft.common.dimensions.FirstCircleTeleporter;
import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;


public class BlockCompressedDiamond extends Block {

	public BlockCompressedDiamond() {
		super(Material.IRON);
		this.setUnlocalizedName("compressedDiamondBlock")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(10.0f)
		.setResistance(60.0f)
		.setHarvestLevel("pickaxe", 3);
	}
	@Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {

		System.out.println("This is a test");
        if (player instanceof EntityPlayerMP)
        {
            WorldServer worldserver = (WorldServer)world;
            EntityPlayerMP var4 = (EntityPlayerMP)player;

            if (player.getRidingEntity() == null && player.isBeingRidden() == false && player instanceof EntityPlayer && var4.dimension != DeepCraft.dimensionID)
            {
            	var4.getServer().getPlayerList().transferPlayerToDimension(var4, DeepCraft.dimensionID, new FirstCircleTeleporter(worldserver));
            }
            if (player.getRidingEntity() == null && player.isBeingRidden() == false && player instanceof EntityPlayer && var4.dimension == DeepCraft.dimensionID)
            {
            	var4.getServer().getPlayerList().transferPlayerToDimension(var4, 0, new FirstCircleTeleporter(worldserver));
            }
            var4.getServer().getPlayerList().transferPlayerToDimension(var4, DeepCraft.dimensionID, new FirstCircleTeleporter(worldserver));
        }
        return true;
    }
}
