package me.coodlude.edgeofdarkness.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

public class GuiTardisInt extends GuiScreen {

    public GuiTardisInt() {
        super();
    }

    @Override
    public void initGui() {
        super.initGui();


        int height = this.height / 2 - 15;
        int width = this.width / 2 - 15;
        int id = -1;

        this.buttonList.clear();
        this.addButton(new GuiButton(id++, width - 66, height - 109, 65, 20, "<"));
        this.addButton(new GuiButton(id++, width + 66, height - 109, 65, 20, ">"));

    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);

        switch (button.id) {
            case 0: // Left Arrow
                break;
            case 1: // Right Arrow
                break;
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
