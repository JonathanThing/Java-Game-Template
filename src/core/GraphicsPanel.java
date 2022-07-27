package core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

/**
 * Code for JPanel
 */
public class GraphicsPanel extends JPanel {
    public GraphicsPanel() {
        setLayout(new GridBagLayout());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Game.getInstance().getCurrentScene().render(g2);
    }
}
