package ink.ikx.rt.api.internal.utils.element;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenSetter;

@ZenRegister
@ZenClass("mods.randomtweaker.FontInfoElement")
public interface FontInfoElement extends Element {

    @ZenGetter("info")
    String getInfo();

    @ZenGetter("color")
    int getColor();

    @ZenSetter("info")
    void setInfo(String info);

    @ZenSetter("color")
    void setColor(int color);
}
