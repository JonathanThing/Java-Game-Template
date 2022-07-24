package core;

import util.Const;

public class Game {

    private static Game gameInstance;

    private GameWindow gameWindow;
    private Scene currentScene;
    private DeltaTimeTracker deltaTimeTracker;

    private Game() {
        this.gameWindow = new GameWindow("Game");
        this.deltaTimeTracker = new DeltaTimeTracker();
        this.currentScene = new Scene();
    }

    public static Game getInstance() {
        if (Game.gameInstance == null) {
            Game.gameInstance = new Game();
        }
        return Game.gameInstance;
    }

    public void start() {
        while (true) {
            currentScene.update();
            gameWindow.getGraphicsPanel().repaint();
            deltaTimeTracker.updateDeltaTime();
            try {
                Thread.sleep(1000 / Const.FPS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public GameWindow getGameWindow() {
        return gameWindow;
    }

    public Scene getCurrentScene() {
        return currentScene;
    }
}
