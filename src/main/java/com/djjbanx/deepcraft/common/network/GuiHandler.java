package com.djjbanx.deepcraft.common.network;

import com.djjbanx.deepcraft.client.gui.GuiCompressorTileEntity;
import com.djjbanx.deepcraft.common.blocks.tile.CompressorTileEntity;
import com.djjbanx.deepcraft.common.containers.ContainerCompressorTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int COMPRESSOR_GUI = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == COMPRESSOR_GUI)
			return new ContainerCompressorTileEntity(player.inventory, (CompressorTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == COMPRESSOR_GUI)
			return new GuiCompressorTileEntity(player.inventory, (CompressorTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		
		return null;
	}

}
