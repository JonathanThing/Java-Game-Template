package input;

import java.awt.event.MouseEvent;
import java.util.HashSet;

import util.Vector;

public class Mouse {
    public static HashSet<Integer> buttonsPressed = new HashSet<Integer>();
    public static Vector mousePosition = new Vector(0, 0);

    public static void updatePosition(MouseEvent e) {
        mousePosition.setVector(e.getX(), e.getY());
    }

    public static void mousePressed(MouseEvent e) {
        buttonsPressed.add(e.getButton());
    }

    public static void mouseReleased(MouseEvent e) {
        buttonsPressed.remove(e.getButton());
    }

    public static boolean isMousePressed(int e) {
        return buttonsPressed.contains(e);
    }

    public Mouse() {
    }
}
