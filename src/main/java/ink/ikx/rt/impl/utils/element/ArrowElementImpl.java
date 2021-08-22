package ink.ikx.rt.impl.utils.element;

import crafttweaker.CraftTweakerAPI;
import ink.ikx.rt.api.internal.utils.element.ArrowElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class ArrowElementImpl extends ElementImpl implements ArrowElement {

    public int direction;

    public ArrowElementImpl(int x, int y, int direction) {
        super(x, y, 0, 0);
        this.direction = direction;
    }

    @Override
    public int getDirection() {
        return this.direction;
    }

    @Override
    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public void Render(Minecraft minecraft) {
        Render(minecraft, direction);
    }

    private void Render(Minecraft minecraft, int direction) {
        GlStateManager.enableAlpha();
        minecraft.getTextureManager().bindTexture(new ResourceLocation(this.getTexture()));
        switch (direction) {
            case 0:
                Gui.drawModalRectWithCustomSizedTexture(this.getX(), this.getY(), 36, 0, 22, 15, 256, 256);
                break;
            case 1:
                Gui.drawModalRectWithCustomSizedTexture(this.getX(), this.getY(), 36, 16, 22, 15, 256, 256);
                break;
            case 2:
                Gui.drawModalRectWithCustomSizedTexture(this.getX(), this.getY(), 64, 0, 15, 22, 256, 256);
                break;
            case 3:
                Gui.drawModalRectWithCustomSizedTexture(this.getX(), this.getY(), 64, 32, 15, 22, 256, 256);
                break;
            default:
                CraftTweakerAPI.getLogger().logError("Direction is not supported and you shouldn't goto in here");
                break;
        }
        GlStateManager.disableAlpha();
    }
}
