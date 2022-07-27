package core;

import java.awt.event.KeyEvent;

import javax.swing.UIManager;

import core.scenes.Scene;
import core.scenes.editor.EditorScene;
import core.scenes.game.GameScene;
import core.scenes.menu.MenuScene;
import input.Keyboard;
import misc.mediaPlayers.AudioHandler;
import util.Const;

/**
 * Singleton class that serves as the main game class.
 * Handles the current scene, game window, delta time tracker, and audio
 * handler.
 * Is responsible for main game loop.
 */
public class Game {

    private static Game gameInstance; // Game instance for singleton pattern

    private GameWindow gameWindow; // Game window (JFrame + JPanel)
    private Scene currentScene; // Current scene
    private DeltaTimeTracker deltaTimeTracker; // Delta time tracker
    private AudioHandler audioHandler; // Audio handler

    // Singleton pattern
    private Game() {

    }

    /**
     * intialize
     * Intializes game variables such as the game window.
     * This is not done in the constructor to prevent an infinite loop.
     */
    private void intialize() {

        // Set look and feel to the system default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize game variables
        gameWindow = new GameWindow("Javastein 3D");
        deltaTimeTracker = new DeltaTimeTracker();
        audioHandler = new AudioHandler();
        setCurrentScene(new MenuScene());

        gameWindow.setVisible(true);
    }

    /**
     * start
     * Intializes the game and starts the game loop.
     */
    public void start() {

        intialize();

        // Main game loop
        while (true) {
            deltaTimeTracker.updateDeltaTime(); // Update the delta time
            currentScene.update(); // Update game logic for current scene
            gameWindow.getGraphicsPanel().repaint(); // Repaint game panel

            // Debugging keyboard commands, remove later
            Keyboard keyboard = Keyboard.getInstance();
            if (keyboard.isKeyPressed(KeyEvent.VK_ESCAPE)) {
                setCurrentScene(new MenuScene());
            }

            if (keyboard.isKeyPressed(KeyEvent.VK_1)) {
                setCurrentScene(new GameScene());
            }

            if (keyboard.isKeyPressed(KeyEvent.VK_2)) {
                setCurrentScene(new MenuScene());
            }

            if (keyboard.isKeyPressed(KeyEvent.VK_3)) {
                setCurrentScene(new EditorScene());
            }

            // Limit the game to the specified FPS
            try {
                Thread.sleep(1000 / Const.FPS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Returns the game instance.
     * If no game instance exists, creates one.
     * 
     * @return game instance
     */
    public static Game getInstance() {
        if (gameInstance == null) {
            gameInstance = new Game();
        }
        return gameInstance;
    }

    /**
     * getGameWindow
     * Returns the game window.
     * 
     * @return game window
     */
    public GameWindow getGameWindow() {
        return gameWindow;
    }

    /**
     * getDeltaTimeTracker
     * Returns the game's delta time tracker.
     * 
     * @return delta time tracker
     */
    public DeltaTimeTracker getDeltaTimeTracker() {
        return deltaTimeTracker;
    }

    /**
     * getCurrentScene
     * Returns the game's current scene
     * 
     * @return scene
     */
    public Scene getCurrentScene() {
        return currentScene;
    }

    /**
     * setCurrentScene
     * Changes the currentScene of the game and handles removing the old UI and
     * adding the new UI.
     * 
     * @param newScene
     */
    public void setCurrentScene(Scene newScene) {
        gameWindow.getGraphicsPanel().removeAll(); // Remove current UI
        currentScene = newScene; // Set new current scene
        currentScene.getSceneUI().init(); // Initializes the new scene UI
        gameWindow.requestFocus(); // Refocuses the game window for keylistener
    }

    /**
     * getAudioHandler
     * Returns the game's audio handler
     * 
     * @return audio handler
     */
    public AudioHandler getAudioHandler() {
        return audioHandler;
    }
}
