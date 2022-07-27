package core.scenes.editor;

import java.awt.Graphics2D;

import core.scenes.Scene;
import lists.Music;

public class EditorScene extends Scene {

    public EditorScene() {
        super(Music.EDITOR_THEME, new EditorUI());
    }

    @Override
    public void render(Graphics2D g2) {

    }

    @Override
    public void update() {

    }

}
