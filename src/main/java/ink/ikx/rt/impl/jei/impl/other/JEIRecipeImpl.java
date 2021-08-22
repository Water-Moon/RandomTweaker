package ink.ikx.rt.impl.jei.impl.other;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.api.item.IIngredient;
import ink.ikx.rt.RandomTweaker;
import ink.ikx.rt.api.internal.utils.element.Element;
import ink.ikx.rt.api.mods.jei.interfaces.other.JEIRecipe;
import ink.ikx.rt.api.mods.jei.interfaces.other.JEITooltip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JEIRecipeImpl implements JEIRecipe {

    public String uid;
    public JEITooltip JEITooltip = null;
    public List<IIngredient> inputs = new ArrayList<>();
    public List<IIngredient> outputs = new ArrayList<>();
    public List<Element> Elements = new ArrayList<>();

    public JEIRecipeImpl(String uid) {
        this.uid = uid;
    }

    @Override
    public IIngredient[] getInputs() {
        return inputs.toArray(new IIngredient[0]);
    }

    @Override
    public IIngredient[] getOutputs() {
        return outputs.toArray(new IIngredient[0]);
    }

    @Override
    public Element[] getJEIElements() {
        return Elements.toArray(new Element[0]);
    }

    @Override
    public String getUid() {
        return uid;
    }

    @Override
    public JEITooltip getJEITooltip() {
        return JEITooltip;
    }

    @Override
    public JEIRecipe setInputs(IIngredient[] inputs) {
        this.inputs = Arrays.asList(inputs);
        return this;
    }

    @Override
    public JEIRecipe setOutputs(IIngredient[] outputs) {
        this.outputs = Arrays.asList(outputs);
        return this;
    }

    @Override
    public JEIRecipe setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public JEIRecipe addJEIElement(Element Element) {
        this.Elements.add(Element);
        return this;
    }

    @Override
    public JEIRecipe setJEIElements(Element[] Elements) {
        this.Elements = Arrays.asList(Elements);
        return this;
    }

    @Override
    public JEIRecipe onJEITooltip(JEITooltip JEITooltip) {
        this.JEITooltip = JEITooltip;
        return this;
    }

    @Override
    public JEIRecipe addInput(IIngredient stack) {
        this.inputs.add(stack);
        return this;
    }

    @Override
    public JEIRecipe addOutput(IIngredient stack) {
        this.outputs.add(stack);
        return this;
    }

    @Override
    public void build() {
        if (!inputs.isEmpty()) {
            RandomTweaker.JEIRecipeList.add(this);
        } else {
            CraftTweakerAPI.getLogger().logError("Recipe Input cannot be empty !");
        }
    }
}
