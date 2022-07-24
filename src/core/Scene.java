package core;

import java.awt.Color;
import java.awt.Graphics2D;

public class Scene {
    public Scene() {

    }

    public void render(Graphics2D g2) {
        g2.setColor(Color.GREEN);
        g2.fillRect(0, 0, 100, 100);
    }

    public void update() {

    }
}
