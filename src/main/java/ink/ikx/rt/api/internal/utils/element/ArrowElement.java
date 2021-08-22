package ink.ikx.rt.api.internal.utils.element;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenSetter;

@ZenRegister
@ZenClass("mods.randomtweaker.ArrowElement")
public interface ArrowElement extends Element {

    @ZenGetter("direction")
    int getDirection();

    @ZenSetter("direction")
    void setDirection(int direction);
}
