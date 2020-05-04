package me.coodlude.edgeofdarkness.client.gui;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisInfo;
import me.coodlude.edgeofdarkness.network.NetworkHandler;
import me.coodlude.edgeofdarkness.network.packets.PacketTardisInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.DimensionManager;

import java.io.IOException;

public class GuiTardisDim extends GuiScreen {

    //TODO Fix that you can tp to other dimensions & & Better Portal soon (I hope)
    private GuiButton rb;
    private GuiButton lb;
    private GuiButton coords;
    private GuiButton set;

    static final int GUI_WIDTH = 256;
    static final int GUI_HEIGHT = 256;
    public Integer[] dims;
    private int selection = 0;
    public String[] args;


    private Minecraft mc;
    private FontRenderer fr;

    public GuiTardisDim(String... args) {
        mc = Minecraft.getMinecraft();
        fr = mc.fontRenderer;
        this.dims = DimensionManager.getStaticDimensionIDs();
        this.args = args;
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button == this.rb) {
            if(selection - 1 < 0) {
                selection = dims.length - 1;
            }else{
                selection -= 1;
            }
        }

        if (button == this.lb) {
            if(selection + 1 > (dims.length - 1)) {
                selection = 0;
            }else{
                selection += 1;
            }
        }

        if(button == this.set) {
            NetworkHandler.NETWORK.sendToServer(new PacketTardisInfo("destination_dim", String.valueOf(dims[selection])));
        }

        if (button == this.coords) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiTardisCoords(args));
        }

        super.actionPerformed(button);
    }

    @Override
    public void initGui() {
        int x = width / 2 - 15;
        int y = height / 2 - 15;
        String right = "/\\";
        String left = "\\/";
        String coord = "Coords";

        int yOffset = fr.FONT_HEIGHT + 3;
        rb = new GuiButton(1, x - 11, y + yOffset - 50, 20, 20, right);
        lb = new GuiButton(2, x - 11, y + yOffset + 50, 20, 20, left);
        coords = new GuiButton(3, x + 66, y + yOffset - 109, 65, 20, coord);
        set = new GuiButton(4, x + 11, y + yOffset * 9, "Set");
        rb.x -= rb.width / 2;
        lb.x -= lb.width / 2;
        set.x -= set.width / 2;
        coords.x -= coords.width / 2;

        this.buttonList.clear();
        this.addButton(rb);
        this.addButton(lb);
        this.addButton(coords);
        this.addButton(set);
    }


    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {

        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {

        int x = (width - GUI_WIDTH) / 2;
        int y = (height - GUI_HEIGHT) / 2;

        int bf = selection - 1 < 0 ? dims.length - 1 : selection - 1;
        int af = (selection + 1 > dims.length - 1) ? 0 : selection + 1;


        fr.drawString(DimensionManager.getProviderType(dims[bf]).getName(), 190,100,0xF000);
        fr.drawString(DimensionManager.getProviderType(dims[selection]).getName(), 190,120,0xA001);
        fr.drawString(DimensionManager.getProviderType(dims[af]).getName(), 190,140,0xF000);


        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {

        super.keyTyped(typedChar, keyCode);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
    }
}
