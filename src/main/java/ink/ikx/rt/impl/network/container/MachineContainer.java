package ink.ikx.rt.impl.network.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MachineContainer extends Container {

    private final World world;
    private final BlockPos pos;

    public MachineContainer(EntityPlayer player, World world, int x, int y, int z) {
        this.world = world;
        this.pos = new BlockPos(x, y, z);

        InventoryPlayer inventory = player.inventory;

        for (int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventory, i, i * 18 + 8, 152));
            this.addSlotToContainer(new Slot(inventory, i + 9, i * 18 + 8, 94));
            this.addSlotToContainer(new Slot(inventory, i + 28, i * 18 + 8, 112));
            this.addSlotToContainer(new Slot(inventory, i + 28, i * 18 + 8, 130));
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return playerIn.world.equals(this.world) && playerIn.getDistanceSq(pos) <= 64.0;
    }
}
