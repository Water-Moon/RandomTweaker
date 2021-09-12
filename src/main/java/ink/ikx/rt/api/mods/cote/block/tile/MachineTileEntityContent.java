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

    public static final String TAG_CUSTOM_NAME = "CustomName";

    public MachineTileEntityContent(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public void update() {

    }

    @Override
    public void readFromNBT(@Nonnull NBTTagCompound compound) {
        this.machineName = compound.getString(TAG_CUSTOM_NAME);
        super.readFromNBT(compound);
    }

    @Nonnull
    @Override
    public NBTTagCompound writeToNBT(@Nonnull NBTTagCompound compound) {
        compound.setString(TAG_CUSTOM_NAME, machineName);
        return super.writeToNBT(compound);
    }

    @ZenGetter("data")
    public IData getCustomData() {
        return NBTConverter.from(this.getTileData(), false);
    }

    @ZenSetter("data")
    public void setCustomData(IData data) {
        TileData.checkDataMap(data);
        this.getTileData().merge((NBTTagCompound) NBTConverter.from(data));
        this.markDirty();
    }

    @ZenMethod
    public void updateCustomData(IData data) {
        setCustomData(this.getCustomData().add(data));
    }
}
