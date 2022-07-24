package input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;

import core.Game;

public class Keyboard extends KeyAdapter {

    private static Keyboard keyboardInstance;
    private HashSet<Integer> keysPressed = new HashSet<Integer>();

    private Keyboard() {
        Game.getInstance().getGameWindow().addKeyListener(this);
    }

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
        System.out.println("key pressed");
        keysPressed.add(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("key released");
        keysPressed.remove(e.getKeyCode());
    }
}
