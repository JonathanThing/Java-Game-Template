package core.scenes;

import java.awt.Graphics2D;

import core.Level;
import core.Scene;

public class GameScene extends Scene {

    private Level currentLevel;

    public GameScene() {
        currentLevel = new Level();
    }

    @Override
    public void update() {

        currentLevel.update();
    }

    @Override
    public void draw(Graphics2D g2) {

    }

}