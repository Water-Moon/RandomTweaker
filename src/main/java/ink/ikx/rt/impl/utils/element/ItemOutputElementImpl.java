package ink.ikx.rt.impl.utils.element;

import ink.ikx.rt.api.internal.utils.element.ItemElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class ItemOutputElementImpl extends ElementImpl implements ItemElement {

    public final int U = 80;
    public final int V = 0;

    public ItemOutputElementImpl(int x, int y) {
        super(x, y, 27, 26);
    }

    @Override
    public int getU() {
        return this.U;
    }

    @Override
    public int getV() {
        return this.V;
    }

    @Override
    public void Render(Minecraft minecraft) {
        GlStateManager.enableAlpha();
        minecraft.getTextureManager()
            .bindTexture(new ResourceLocation(this.getTexture()));
        Gui.drawModalRectWithCustomSizedTexture(this.getX() - 4, this.getY() - 4,
            this.getU(), this.getV(), this.getWidth(), this.getHeight(), 256, 256);
        GlStateManager.disableAlpha();
    }
}
