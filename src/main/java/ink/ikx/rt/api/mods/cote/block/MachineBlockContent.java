package ink.ikx.rt.api.mods.cote.block;

import com.teamacronymcoders.contenttweaker.modules.vanilla.blocks.BlockContent;
import ink.ikx.rt.api.mods.cote.block.tile.MachineTileEntityContent;
import javax.annotation.Nullable;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import youyihj.zenutils.api.cotx.annotation.ExpandContentTweakerEntry;

@ExpandContentTweakerEntry
public class MachineBlockContent extends BlockContent implements ITileEntityProvider {

    private final MachineBlockRepresentation representation;

    public MachineBlockContent(MachineBlockRepresentation representation) {
        super(representation);
        this.representation = representation;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new MachineTileEntityContent(representation.machineName);
    }

    @ExpandContentTweakerEntry.RepresentationGetter
    public MachineBlockRepresentation getRepresentation() {
        return representation;
    }
}
