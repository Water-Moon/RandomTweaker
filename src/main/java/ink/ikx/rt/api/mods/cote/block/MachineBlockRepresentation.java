package ink.ikx.rt.api.mods.cote.block;

import com.teamacronymcoders.base.registrysystem.BlockRegistry;
import com.teamacronymcoders.contenttweaker.ContentTweaker;
import com.teamacronymcoders.contenttweaker.api.ctobjects.blockmaterial.IBlockMaterialDefinition;
import com.teamacronymcoders.contenttweaker.modules.vanilla.blocks.BlockRepresentation;
import crafttweaker.annotations.ModOnly;
import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenRegister
@ModOnly("contenttweaker")
@ZenClass("mods.randomtweaker.cote.Block")
public class MachineBlockRepresentation extends BlockRepresentation {

    @ZenProperty
    public String machineName;

    public MachineBlockRepresentation(String unlocalizedName, String machineName, IBlockMaterialDefinition material) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setBlockMaterial(material);
        this.setMachineName(machineName);
    }

    @ZenMethod
    public String getMachineName() {
        return machineName;
    }

    @ZenMethod
    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public void register() {
        ContentTweaker.instance.getRegistry(BlockRegistry.class, "BLOCK").register(new MachineBlockContent(this));
    }
}
