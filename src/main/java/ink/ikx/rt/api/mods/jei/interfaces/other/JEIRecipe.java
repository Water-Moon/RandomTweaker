package ink.ikx.rt.api.mods.jei.interfaces.other;

import crafttweaker.api.item.IIngredient;
import ink.ikx.rt.api.internal.utils.element.Element;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenMethod;


@ZenClass("mods.randomtweaker.jei.JEIRecipe")
public interface JEIRecipe {

    @ZenGetter("uid")
    String getUid();

    @ZenGetter("inputs")
    IIngredient[] getInputs();

    @ZenGetter("outputs")
    IIngredient[] getOutputs();

    @ZenGetter("Elements")
    Element[] getJEIElements();

    @ZenMethod
    JEIRecipe setJEIElements(Element[] Elements);

    @ZenMethod
    JEIRecipe setUid(String uid);

    @ZenMethod
    JEIRecipe onJEITooltip(JEITooltip JEITooltip);

    @ZenMethod
    JEIRecipe addJEIElement(Element Element);

    @ZenMethod
    JEIRecipe setInputs(IIngredient[] inputs);

    @ZenMethod
    JEIRecipe setOutputs(IIngredient[] outputs);

    @ZenMethod
    JEIRecipe addInput(IIngredient stack);

    @ZenMethod
    JEIRecipe addOutput(IIngredient stack);

    @ZenMethod
    void build();

    JEITooltip getJEITooltip();

}
