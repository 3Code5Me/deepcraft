package com.djjbanx.deepcraft.common.blocks.tile;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class ExampleTileEntity extends TileEntity implements ITickable{

	private boolean aBoolean;
    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private String aString;
    private byte[] aByteArray;
    private int[] anIntArray;

    private ItemStack anItemStack;

    private ArrayList<Integer> aList = new ArrayList<Integer>();
    
	@Override
	public void update() {
		
	}

	@Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        //Primitives:
        compound.setBoolean("aBoolean", this.aBoolean);
        compound.setByte("aByte", this.aByte);
        compound.setShort("aShort", this.aShort);
        compound.setInteger("anInt", this.anInt);
        compound.setLong("aLong", this.aLong);
        compound.setFloat("aFloat", this.aFloat);
        compound.setDouble("aDouble", this.aDouble);
        compound.setString("aString", this.aString);
        compound.setByteArray("aByteArray", this.aByteArray);
        compound.setIntArray("anIntArray", this.anIntArray);

        //Item Stack:
        NBTTagCompound stack = new NBTTagCompound();
        this.anItemStack.writeToNBT(stack);
        compound.setTag("anItemStack", stack);

        //TagList of Integer Tags:
        NBTTagList list = new NBTTagList();
        for (int i = 0; i < this.aList.size(); i++) {
            NBTTagCompound nbt = new NBTTagCompound();
            nbt.setInteger("id", i);
            nbt.setInteger("value", (Integer) this.aList.get(i));
            list.appendTag(nbt);
        }
        compound.setTag("aList", list);
        return null;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        //Primitives:
        this.aBoolean = compound.getBoolean("aBoolean");
        this.aByte = compound.getByte("aByte");
        this.aShort = compound.getShort("aShort");
        this.anInt = compound.getInteger("anInt");
        this.aLong = compound.getLong("aLong");
        this.aFloat = compound.getFloat("aFloat");
        this.aDouble = compound.getDouble("aDouble");
        this.aString = compound.getString("aString");
        this.aByteArray = compound.getByteArray("aByteArray");
        this.anIntArray = compound.getIntArray("anIntArray");

        //ItemStack:
        this.anItemStack = ItemStack.loadItemStackFromNBT(compound.getCompoundTag("anItemStack"));

        //TagList of Integer Tags:
        NBTTagList list = compound.getTagList("aList", 10);
        this.aList.clear();
        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound nbt = list.getCompoundTagAt(i);
            int id = nbt.getInteger("id");
            int value = nbt.getInteger("value");
            this.aList.ensureCapacity(id);
            this.aList.set(id, value);
        }
    }
}
