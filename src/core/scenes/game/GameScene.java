package core.scenes.game;

import java.awt.Graphics2D;

import core.scenes.Scene;
import lists.Music;

public class GameScene extends Scene {

    public GameScene() {
        super(Music.GAME_THEME, new GameUI());
    }

    @Override
    public void render(Graphics2D g) {

    }

    @Override
    public void update() {
    }

}
