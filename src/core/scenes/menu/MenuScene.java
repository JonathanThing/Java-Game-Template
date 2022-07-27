package core.scenes.menu;

import java.awt.Graphics2D;

import core.scenes.Scene;
import lists.Music;

public class MenuScene extends Scene {

    public MenuScene() {
        super(Music.MENU_THEME, new MenuUI());
    }

    @Override
    public void render(Graphics2D g) {

    }

    @Override
    public void update() {

    }
}
