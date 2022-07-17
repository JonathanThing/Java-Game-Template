package core;

import java.awt.Graphics2D;

/*
 * Scene
 * Base class for all scenes.
 */
public abstract class Scene {
    public Scene() {

    }

    public abstract void update();

    public abstract void draw(Graphics2D g2);
}
