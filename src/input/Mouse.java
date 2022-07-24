package input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;

import core.Game;

public class Mouse extends MouseAdapter {

    private static Mouse mouseInstance;
    private HashSet<Integer> buttonsPressed = new HashSet<Integer>();

    private Mouse() {
        Game.getInstance().getGameWindow().addMouseListener(this);
    }

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
        System.out.println("pressed");
        buttonsPressed.add(e.getButton());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
        buttonsPressed.remove(e.getButton());
    }

}
