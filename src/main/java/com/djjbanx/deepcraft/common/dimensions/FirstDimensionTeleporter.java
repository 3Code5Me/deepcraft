package com.djjbanx.deepcraft.common.dimensions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.management.PlayerList;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class FirstDimensionTeleporter extends Teleporter {

	public FirstDimensionTeleporter(WorldServer worldIn) {
		super(worldIn);
	}
	
	public void teleport(Entity e) {
		e.getServer().getPlayerList().transferPlayerToDimension((EntityPlayerMP) e, FirstDimension.getID(), this);
	}

}
