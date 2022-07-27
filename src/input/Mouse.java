package input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;

import core.Game;

/**
 * Singleton class to represnt the mouse for user input
 */
public class Mouse extends MouseAdapter {

    private static Mouse mouseInstance; // Mouse instance for singleton pattern
    private HashSet<Integer> buttonsPressed = new HashSet<Integer>(); // Hashset storing all mouse buttons pressed

    private Mouse() {
        Game.getInstance().getGameWindow().getGraphicsPanel().addMouseListener(this);
    }

    /**
     * Returns the mouse instance.
     * If no mouse instance exists, creates one.
     * 
     * @return mouse instance
     */
    public static Mouse getInstance() {
        if (mouseInstance == null) {
            mouseInstance = new Mouse();
        }
        return mouseInstance;
    }

    public boolean isButtonPressed(int button) {
        return buttonsPressed.contains(button);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        buttonsPressed.add(e.getButton());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        buttonsPressed.remove(e.getButton());
    }

}
