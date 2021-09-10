package ink.ikx.rt.api.mods.cote;

import com.teamacronymcoders.contenttweaker.api.ctobjects.blockmaterial.IBlockMaterialDefinition;
import crafttweaker.annotations.ModOnly;
import ink.ikx.rt.api.mods.cote.block.MachineBlockRepresentation;
import ink.ikx.rt.api.mods.cote.potion.PotionRepresentation;
import ink.ikx.rt.api.mods.cote.potion.PotionTypeRepresentation;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethodStatic;

@ModOnly("contenttweaker")
@ZenExpansion("mods.contenttweaker.VanillaFactory")
public class ExpandVanillaFactory {

    @ZenMethodStatic
    public static PotionRepresentation createPotion(String unlocalizedName, int color) {
        return new PotionRepresentation(unlocalizedName, color);
    }

    @ZenMethodStatic
    public static PotionTypeRepresentation createPotionType(String unlocalizedName, PotionRepresentation potion) {
        return new PotionTypeRepresentation(unlocalizedName, potion);
    }

    @ZenMethodStatic
    public static MachineBlockRepresentation createMachine(String unlocalizedName, String machineName, IBlockMaterialDefinition material) {
        return new MachineBlockRepresentation(unlocalizedName, machineName, material);
    }
}
