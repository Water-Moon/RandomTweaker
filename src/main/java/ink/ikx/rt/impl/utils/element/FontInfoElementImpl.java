package ink.ikx.rt.impl.utils.element;

import ink.ikx.rt.api.internal.utils.element.FontInfoElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;

public class FontInfoElementImpl extends ElementImpl implements FontInfoElement {

    public String info;
    public int color;

    public FontInfoElementImpl(int x, int y, String info, int color, int width, int height) {
        super(x, y, width, height);
        this.color = color;
        this.info = info;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public int getColor() {
        return this.color;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }


    @Override
    public void Render(Minecraft minecraft) {
        FontRenderer fontRenderer = minecraft.fontRenderer;
        fontRenderer.drawString(this.info, this.x, this.y, this.color);
    }
}
