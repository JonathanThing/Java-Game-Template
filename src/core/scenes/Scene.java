package core.scenes;

import java.awt.Graphics2D;

import core.Game;
import misc.mediaPlayers.AudioHandler;

/**
 * Class to represent a scene.
 * A scene is a special game state that has special game logic such as a menu
 * system or the actual game.
 */
public abstract class Scene {

    private SceneUI sceneUI; // Scene UI

    public Scene(String musicFilePath, SceneUI sceneUI) {
        AudioHandler audioHandler = Game.getInstance().getAudioHandler();
        audioHandler.setMenuMusic(musicFilePath);
        audioHandler.playMenuMusic();
        audioHandler.loopMenuMusic();

        this.sceneUI = sceneUI;
    }

    public abstract void render(Graphics2D g2);

    public abstract void update();

    public SceneUI getSceneUI() {
        return sceneUI;
    }

    public void setSceneUI(SceneUI sceneUI) {
        this.sceneUI = sceneUI;
    }
}
