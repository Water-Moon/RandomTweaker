package ink.ikx.rt.api.mods.cote.block;

import com.teamacronymcoders.contenttweaker.modules.vanilla.blocks.BlockContent;
import ink.ikx.rt.api.mods.cote.block.tile.MachineTileEntityContent;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import youyihj.zenutils.api.cotx.annotation.ExpandContentTweakerEntry;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

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
    public TileEntity createTileEntity(@Nullable World world, @Nonnull IBlockState state) {
        return hasTileEntity(state) ? new MachineTileEntityContent(representation.machineName) : null;
    }

    @ExpandContentTweakerEntry.RepresentationGetter
    public MachineBlockRepresentation getRepresentation() {
        return representation;
    }
}
