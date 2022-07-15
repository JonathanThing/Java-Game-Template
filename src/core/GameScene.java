package core;

import java.awt.Graphics2D;

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