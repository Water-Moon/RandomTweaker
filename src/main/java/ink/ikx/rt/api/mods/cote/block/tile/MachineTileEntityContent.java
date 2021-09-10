package ink.ikx.rt.api.mods.cote.block.tile;

import crafttweaker.annotations.ModOnly;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.data.IData;
import crafttweaker.mc1120.data.NBTConverter;
import ink.ikx.rt.api.internal.utils.TileData;
import javax.annotation.Nonnull;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenSetter;

@ZenRegister
@ModOnly("contenttweaker")
@ZenClass("mods.randomtweaker.cote.MachineTileEntity")
public class MachineTileEntityContent extends TileEntity implements ITickable {

    private String machineName;
    private final TileData customData = new TileData();

    public static final String TAG_CUSTOM_NAME = "CustomName";
    public static final String TAG_CUSTOM_DATA = "CustomData";

    public MachineTileEntityContent(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public void update() {

    }

    @Override
    public void readFromNBT(@Nonnull NBTTagCompound compound) {
        customData.readFromNBT(compound.getCompoundTag(TAG_CUSTOM_DATA));
        this.machineName = compound.getString(TAG_CUSTOM_NAME);
        super.readFromNBT(compound);
    }

    @Nonnull
    @Override
    public NBTTagCompound writeToNBT(@Nonnull NBTTagCompound compound) {
        compound.setString(TAG_CUSTOM_NAME, machineName);
        if (!compound.hasKey(TAG_CUSTOM_DATA)) {
            compound.setTag(TAG_CUSTOM_DATA, new NBTTagCompound());
        }
        customData.writeToNBT(compound.getCompoundTag(TAG_CUSTOM_DATA));
        return super.writeToNBT(compound);
    }

    @ZenGetter("data")
    public IData getCustomData() {
        return customData.getData();
    }

    @ZenSetter("data")
    public void setCustomData(IData data) {
        customData.readFromNBT((NBTTagCompound) NBTConverter.from(data));
        this.markDirty();
    }

    @ZenMethod
    public void updateCustomData(IData data) {
        TileData.checkDataMap(data);
        setCustomData(getCustomData().add(data));
    }
}
