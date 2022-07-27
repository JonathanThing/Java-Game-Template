package input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;

import core.Game;

/**
 * Singleton class to represnt the keyboard for user input
 */
public class Keyboard extends KeyAdapter {

    private static Keyboard keyboardInstance; // Keyboard instance for singleton pattern
    private HashSet<Integer> keysPressed = new HashSet<Integer>(); // Hashset storing all keys currently pressed

    private Keyboard() {
        Game.getInstance().getGameWindow().addKeyListener(this);
    }

    /**
     * Returns the keyboard instance.
     * If no keyboard instance exists, creates one.
     * 
     * @return keyboard instance
     */
    public static Keyboard getInstance() {
        if (keyboardInstance == null) {
            keyboardInstance = new Keyboard();
        }
        return keyboardInstance;
    }

    public boolean isKeyPressed(int key) {
        return keysPressed.contains(key);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keysPressed.add(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keysPressed.remove(e.getKeyCode());
    }
}
