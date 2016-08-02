package com.djjbanx.deepcraft.common.blocks.machines;

import com.djjbanx.deepcraft.common.blocks.tile.CompressorTileEntity;
import com.djjbanx.deepcraft.common.other.ModCreativeTab;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

public class BlockCompressor extends BlockContainer {

	public BlockCompressor() {
		super(Material.ANVIL);
		this.setUnlocalizedName("compressor")
		.setCreativeTab(ModCreativeTab.tabDeepCraft)
		.setHardness(5.0F)
		.setResistance(25.0F)
		.setHarvestLevel("pickaxe", 2);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new CompressorTileEntity();
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
}
