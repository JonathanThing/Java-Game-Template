package core;

import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import util.Const;

public class MenuScene extends Scene {

    public MenuScene() {

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        JLabel title = new JLabel("JAVASTEIN 3D");
        title.setFont(Const.TITLE_FONT);
        Game.gamePanel.add(title, c);

        c.gridy = 1;
        JButton playerButton = new JButton("Play");
        playerButton.setFont(Const.MENU_FONT);
        playerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Game.changeScene(new GameScene());
            }
        });
        Game.gamePanel.add(playerButton, c);

    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics2D g2) {

    }

}
