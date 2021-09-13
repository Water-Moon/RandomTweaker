package ink.ikx.rt.impl.network;

import ink.ikx.rt.impl.network.container.MachineContainer;
import ink.ikx.rt.impl.network.container.MachineGuiContainer;
import javax.annotation.Nullable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class RTGuiHandler implements IGuiHandler {

    public static final int MACHINE_BLOCK_ID = 1;

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MACHINE_BLOCK_ID) {
            return new MachineContainer(player, world, x, y, z);
        }
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MACHINE_BLOCK_ID) {
            return new MachineGuiContainer(player, world, x, y, z);
        }
        return null;
    }
}
