/**
 * 
 */
package com.djjbanx.deepcraft.common.dimensions;

import com.djjbanx.deepcraft.common.DeepCraft;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.*;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.DimensionManager;


public class FirstCircleWorldProvider extends WorldProviderSurface {


	public final String saveFolder;
	
	public FirstCircleWorldProvider() {
		setDimension(DeepCraft.dimensionID);
		saveFolder = "DIM" + DeepCraft.dimensionID;
	}
	
	/**
	 * Always return these colors
	 */
	@Override
	public float[] calcSunriseSunsetColors(float celestialAngle, float f1) {
		return null;//super.calcSunriseSunsetColors(celestialAngle, f1);
	}
	
	/**
	 * Fog color
	 */
	@Override
    public Vec3d getFogColor(float f, float f1)
    {
        float bright = MathHelper.cos(0.25f * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(bright < 0.0F)
        {
            bright = 0.0F;
        }
        if(bright > 1.0F)
        {
            bright = 1.0F;
        }
        float red = 0.7529412F;
        float green = 1.0F;
        float blue = 0.8470588F;
        red *= bright * 0.94F + 0.06F;
        green *= bright * 0.94F + 0.06F;
        blue *= bright * 0.91F + 0.09F;
        return new Vec3d(red, green, blue);
    }
	
    /**
     * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
     */
    public float calculateCelestialAngle(long par1, float par3)
    {
        return 0.225f;
    }

    /**
     * the y level at which clouds are rendered.
     */
    //@SideOnly(Side.CLIENT) // need for magic beans, even on server
    public float getCloudHeight()
    {
        return 161.0F;
    }
}