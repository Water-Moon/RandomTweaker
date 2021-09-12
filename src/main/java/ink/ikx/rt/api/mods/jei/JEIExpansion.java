package ink.ikx.rt.api.mods.jei;

import ink.ikx.rt.api.internal.utils.element.ArrowElement;
import ink.ikx.rt.api.internal.utils.element.CustomElement;
import ink.ikx.rt.api.internal.utils.element.FluidElement;
import ink.ikx.rt.api.internal.utils.element.FontInfoElement;
import ink.ikx.rt.api.internal.utils.element.ItemElement;
import ink.ikx.rt.api.internal.utils.element.ManaBarElement;
import ink.ikx.rt.api.mods.jei.interfaces.other.JEIBackground;
import ink.ikx.rt.api.mods.jei.interfaces.other.JEIPanel;
import ink.ikx.rt.api.mods.jei.interfaces.other.JEIRecipe;
import ink.ikx.rt.api.mods.jei.interfaces.slots.JEIItemSlot;
import ink.ikx.rt.api.mods.jei.interfaces.slots.JEILiquidSlot;
import ink.ikx.rt.impl.jei.impl.other.JEIBackgroundImpl;
import ink.ikx.rt.impl.jei.impl.other.JEIPanelImpl;
import ink.ikx.rt.impl.jei.impl.other.JEIRecipeImpl;
import ink.ikx.rt.impl.jei.impl.slots.JEIItemSlotImpl;
import ink.ikx.rt.impl.jei.impl.slots.JEILiquidSlotImpl;
import ink.ikx.rt.impl.utils.element.ArrowElementImpl;
import ink.ikx.rt.impl.utils.element.CustomElementImpl;
import ink.ikx.rt.impl.utils.element.FluidElementImpl;
import ink.ikx.rt.impl.utils.element.FontInfoElementImpl;
import ink.ikx.rt.impl.utils.element.ItemInputElementImpl;
import ink.ikx.rt.impl.utils.element.ItemOutputElementImpl;
import ink.ikx.rt.impl.utils.element.ManaBarElementImpl;
import stanhebben.zenscript.annotations.Optional;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethodStatic;

@ZenExpansion("mods.jei.JEI")
public class JEIExpansion {

    @ZenMethodStatic
    public static JEIPanel createJEIPanel(String uid, String localizationKey) {
        return new JEIPanelImpl(uid, localizationKey);
    }

    @ZenMethodStatic
    public static JEIBackground createJEIBackground(int width, int height) {
        return new JEIBackgroundImpl(width, height);
    }

    @ZenMethodStatic
    public static JEIBackground createJEIBackground(String resourceName, int u, int v, int width, int height) {
        return new JEIBackgroundImpl(resourceName, u, v, width, height);
    }

    @ZenMethodStatic
    public static JEILiquidSlot createLiquidSlot(boolean isInput, int x, int y, int width, int height, int capacityMb, boolean showCapacity, @Optional(valueBoolean = true) boolean hasBase) {
        return new JEILiquidSlotImpl(isInput, x, y, width, height, capacityMb, showCapacity, hasBase);
    }

    @ZenMethodStatic
    public static JEILiquidSlot createLiquidSlot(boolean isInput, int x, int y, @Optional(valueBoolean = true) boolean hasBase) {
        return createLiquidSlot(isInput, x, y, 16, 16, 1000, false, hasBase);
    }

    @ZenMethodStatic
    public static JEIItemSlot createItemSlot(boolean isInput, int x, int y, @Optional(valueBoolean = true) boolean hasBase) {
        return new JEIItemSlotImpl(isInput, x, y, hasBase);
    }

    @ZenMethodStatic
    public static JEIRecipe createJEIRecipe(String uid) {
        return new JEIRecipeImpl(uid);
    }

    //-------------------------------------------------------------------------------------------

    //Please make sure you really need this.
    @ZenMethodStatic
    public static ItemElement createItemInputElement(int x, int y) {
        return new ItemInputElementImpl(x, y);
    }

    //Please make sure you really need this.
    @ZenMethodStatic
    public static ItemElement createItemOutputElement(int x, int y) {
        return new ItemOutputElementImpl(x, y);
    }

    //Please make sure you really need this.
    @ZenMethodStatic
    public static FluidElement createFluidElement(int x, int y, int width, int height) {
        return new FluidElementImpl(x, y, width, height);
    }

    @ZenMethodStatic
    public static FontInfoElement createFontInfoElement(int x, int y, String info, int color, @Optional int width, @Optional int height) {
        return new FontInfoElementImpl(x, y, info, color, width, height);
    }

    @ZenMethodStatic
    public static ArrowElement createArrowElement(int x, int y, int direction) {
        return new ArrowElementImpl(x, y, direction);
    }

    @ZenMethodStatic
    public static ManaBarElement createManaBarElement(int x, int y, int mana, int mode) {
        return new ManaBarElementImpl(x, y, mana, mode);
    }

    @ZenMethodStatic
    public static ManaBarElement createManaBarElement(int x, int y, int mana) {
        return new ManaBarElementImpl(x, y, mana, 0);
    }

    @ZenMethodStatic
    public static CustomElement createCustomElement(int x, int y, int width, int height, int u, int v, String texture) {
        return new CustomElementImpl(x, y, width, height, u, v, texture);
    }
}
