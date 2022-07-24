package core;

import javax.swing.JFrame;

import util.Const;

public class GameWindow extends JFrame {
    private GraphicsPanel graphicsPanel;

    public GameWindow(String title) {
        super(title);

        graphicsPanel = new GraphicsPanel();
        add(graphicsPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Const.FRAME_WIDTH, Const.FRAME_HEIGHT);
        setVisible(true);
    }

    public GraphicsPanel getGraphicsPanel() {
        return graphicsPanel;
    }

    public void setGraphicsPanel(GraphicsPanel graphicsPanel) {
        this.graphicsPanel = graphicsPanel;
    }
}
