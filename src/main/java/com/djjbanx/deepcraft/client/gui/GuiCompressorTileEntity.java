package com.djjbanx.deepcraft.client.gui;

import com.djjbanx.deepcraft.common.blocks.tile.CompressorTileEntity;
import com.djjbanx.deepcraft.common.containers.ContainerCompressorTileEntity;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiCompressorTileEntity extends GuiContainer {

	private IInventory playerInv;
	private CompressorTileEntity te;
	
	
	public GuiCompressorTileEntity(IInventory playerInv, CompressorTileEntity te) {
        super(new ContainerCompressorTileEntity(playerInv, te));

        this.playerInv = playerInv;
        this.te = te;
        
        //Default Size x=176 y=166
        this.xSize = 176;
        this.ySize = 166;
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
	    this.mc.getTextureManager().bindTexture(new ResourceLocation("deepcraft:textures/gui/CompressorGui.png"));
	    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
	    String s = this.te.getDisplayName().getUnformattedText();
	    this.fontRendererObj.drawString(s, 8, 6, 4210752);            //#404040
	    this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, 72, 4210752);      //#404040
	}
}
