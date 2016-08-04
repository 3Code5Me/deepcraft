package com.djjbanx.deepcraft.common.dimensions;

import com.djjbanx.deepcraft.common.DeepCraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.management.PlayerList;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class FirstCircleTeleporter extends Teleporter {

	public FirstCircleTeleporter(WorldServer worldIn) {
		super(worldIn);
	}
	
	public void teleport(Entity e) {
		e.getServer().getPlayerList().transferPlayerToDimension((EntityPlayerMP) e, DeepCraft.dimensionID, this);
	}

}
