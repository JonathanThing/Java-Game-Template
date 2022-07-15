package util;

import java.awt.Font;

public class Const {

    public static final int PANEL_WIDTH = 800;
    public static final int PANEL_HEIGHT = 600;
    public static final int FRAME_WIDTH = PANEL_WIDTH + 16;
    public static final int FRAME_HEIGHT = PANEL_HEIGHT + 39;

    public static final int MOUSE_OFFSET_X = 8;
    public static final int MOUSE_OFFSET_Y = 29;

    public static final int FPS = 60;

    public static final int BOX_SIZE = 64;

    public static final Font DEFAULT_FONT = new Font("Copperplate Gothic Bold", Font.PLAIN, 20);
    public static final Font MENU_FONT = new Font("Copperplate Gothic Bold", Font.PLAIN, 40);
    public static final Font TITLE_FONT = new Font("Copperplate Gothic Bold", Font.PLAIN, 80);

    private Const() {
    }
}