package ink.ikx.rt.impl.utils.element;

import ink.ikx.rt.api.internal.utils.element.FluidElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class FluidElementImpl extends ElementImpl implements FluidElement {

    public FluidElementImpl(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void Render(Minecraft minecraft) {
        if (this.getWidth() == 16 && this.getHeight() == 16) {
            this.Render(minecraft, 18, 0);
        } else if (this.getWidth() == 34 && this.getHeight() == 16) {
            this.Render(minecraft, 0, 18);
        } else if (this.getWidth() == 16 && this.getHeight() == 34) {
            this.Render(minecraft, 0, 36);
        }
    }

    private void Render(Minecraft minecraft, int u, int v) {
        GlStateManager.enableAlpha();
        minecraft.getTextureManager()
            .bindTexture(new ResourceLocation(this.getTexture()));
        Gui.drawModalRectWithCustomSizedTexture(this.getX() - 1, this.getY() - 1,
            u, v, this.getWidth() + 2, this.getHeight() + 2, 256, 256);
        GlStateManager.disableAlpha();
    }
}
