package ink.ikx.rt.api.internal.utils.element;

import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenSetter;

@ZenClass("mods.randomtweaker.ArrowElement")
public interface ArrowElement extends Element {

    @ZenGetter("direction")
    int getDirection();

    @ZenSetter("direction")
    void setDirection(int direction);
}
