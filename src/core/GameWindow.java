package core;

import javax.swing.JFrame;

import util.Const;

/**
 * Code for JFrame
 */
public class GameWindow extends JFrame {
    private GraphicsPanel graphicsPanel;

    public GameWindow(String title) {
        super(title);

        graphicsPanel = new GraphicsPanel();
        add(graphicsPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Const.FRAME_WIDTH, Const.FRAME_HEIGHT);
        setResizable(true);
        setFocusable(true);
    }

    public GraphicsPanel getGraphicsPanel() {
        return graphicsPanel;
    }

}
