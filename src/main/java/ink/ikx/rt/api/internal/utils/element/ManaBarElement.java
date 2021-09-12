package ink.ikx.rt.api.internal.utils.element;

import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenSetter;

@ZenClass("mods.randomtweaker.ManaBarElement")
public interface ManaBarElement extends Element {

    @ZenGetter("mana")
    int getMana();

    @ZenGetter("log_multiples")
    int getMultiplesLog();

    @ZenGetter
    int getMode();

    @ZenSetter
    void setMode(int mode);

    @ZenSetter("mana")
    void setMana(int mana);

}
