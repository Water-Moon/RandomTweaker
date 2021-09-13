package ink.ikx.rt.api.mods.cote.block;

import com.teamacronymcoders.contenttweaker.modules.vanilla.blocks.BlockContent;
import ink.ikx.rt.RandomTweaker;
import ink.ikx.rt.api.mods.cote.block.tile.MachineTileEntityContent;
import ink.ikx.rt.impl.network.RTGuiHandler;
import javax.annotation.Nullable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import youyihj.zenutils.api.cotx.annotation.ExpandContentTweakerEntry;

@ExpandContentTweakerEntry
public class MachineBlockContent extends BlockContent {

    private final MachineBlockRepresentation representation;

    public MachineBlockContent(MachineBlockRepresentation representation) {
        super(representation);
        this.representation = representation;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new MachineTileEntityContent(representation.machineName);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote && representation.hasGui) {
            playerIn.openGui(RandomTweaker.MODID, RTGuiHandler.MACHINE_BLOCK_ID, worldIn, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }
        return false;
    }

    @ExpandContentTweakerEntry.RepresentationGetter
    public MachineBlockRepresentation getRepresentation() {
        return representation;
    }
}
