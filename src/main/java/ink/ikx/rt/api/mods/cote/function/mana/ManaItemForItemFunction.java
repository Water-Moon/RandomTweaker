package ink.ikx.rt.api.mods.cote.function.mana;

import crafttweaker.api.item.IItemStack;
import ink.ikx.rt.impl.utils.annotation.RTRegisterClass;
import stanhebben.zenscript.annotations.ZenClass;

@RTRegisterClass({"contenttweaker", "botania"})
@ZenClass("mods.randomtweaker.cote.ManaItemForItemFunction")
@FunctionalInterface
public interface ManaItemForItemFunction {

    boolean handle(IItemStack stack, IItemStack otherStack);

}
