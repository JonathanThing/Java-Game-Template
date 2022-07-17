package input;

import java.awt.event.KeyEvent;
import java.util.HashSet;

public class Keyboard {
    static HashSet<Integer> keysPressed = new HashSet<Integer>();

    public static void keyPressed(KeyEvent e) {
        keysPressed.add(e.getKeyCode());
    }

    public static void keyReleased(KeyEvent e) {
        keysPressed.remove(e.getKeyCode());
    }

    public static boolean isKeyPressed(int e) {
        return keysPressed.contains(e);
    }

    public Keyboard() {
    }
}
