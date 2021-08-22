package ink.ikx.rt.api.internal.utils.element;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenSetter;

@ZenRegister
@ZenClass("mods.randomtweaker.ManaBarElement")
public interface ManaBarElement extends Element {

    @ZenGetter("mana")
    int getMana();

    @ZenGetter("log_multiples")
    int getMultiplesLog();

    @ZenSetter("mana")
    void setMana(int mana);

}
