package core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import core.scenes.MenuScene;
import input.Keyboard;
import input.Mouse;
import util.Const;

/*
 * Game
 * Core game class that handles the game loop and scene switching.
 * Contains the JFrame, GraphicsPanel, and listeners.
 */

public class Game {
    static JFrame gameWindow;
    static GraphicsPanel gamePanel;

    static MyKeyListener keyListener = new MyKeyListener();
    static MyMouseListener mouseListener = new MyMouseListener();
    static MouseMotionListener mouseMotionListener = new myMouseMotionListener();

    static Scene currentScene;

    public Game() {

        // Game Window
        gameWindow = new JFrame("Game Window");
        gameWindow.setSize(Const.FRAME_WIDTH, Const.FRAME_HEIGHT);
        gameWindow.setResizable(true); // Change later to false
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Game Panel
        gamePanel = new GraphicsPanel();
        gamePanel.addMouseListener(mouseListener);
        gamePanel.addMouseMotionListener(mouseMotionListener);
        gamePanel.addKeyListener(keyListener);
        gamePanel.setLayout(new GridBagLayout());
        gameWindow.add(gamePanel);

        // Set look and feel to current system
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set current scene to menu scene
        currentScene = new MenuScene();

        gameWindow.setVisible(true);
        runGame();
    }

    // Game loop
    public static void runGame() {
        while (true) {
            currentScene.update();
            gameWindow.repaint();
            try {
                Thread.sleep(1000 / Const.FPS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class GraphicsPanel extends JPanel {
        public GraphicsPanel() {
            setFocusable(true);
            requestFocusInWindow();
        }

        // Draw the game
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            currentScene.draw(g2);
        }
    }

    static class MyKeyListener implements KeyListener {
        public void keyPressed(KeyEvent e) {
            Keyboard.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            Keyboard.keyReleased(e);
        }

        public void keyTyped(KeyEvent e) {
        }
    }

    static class MyMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
            Mouse.mousePressed(e);
        }

        public void mouseReleased(MouseEvent e) {
            Mouse.mouseReleased(e);
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }
    }

    static class myMouseMotionListener implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            Mouse.updatePosition(e);
        }

        public void mouseMoved(MouseEvent e) {
            Mouse.updatePosition(e);
        }
    }

    /*
     * changeScene
     * Changes the current scene to the given scene.
     * Also clears the
     */
    public static void changeScene(Scene scene) {
        currentScene = scene;
        gamePanel.removeAll();
    }

    public static GraphicsPanel getGamePanel() {
        return gamePanel;
    }
}