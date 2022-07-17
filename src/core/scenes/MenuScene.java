package core.scenes;

import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import core.Game;
import core.Scene;
import util.Const;

public class MenuScene extends Scene {

    public MenuScene() {

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 0, 100, 0);
        c.gridx = 0;
        c.gridy = 0;
        JLabel title = new JLabel("Title");
        title.setFont(Const.TITLE_FONT);
        Game.getGamePanel().add(title, c);

        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 1;
        JButton playButton = new JButton("Play");
        playButton.setFont(Const.MENU_FONT);
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Game.changeScene(new GameScene());
            }
        });
        Game.getGamePanel().add(playButton, c);

        c.gridx = 0;
        c.gridy = 2;
        JButton editButton = new JButton("Editor");
        editButton.setFont(Const.MENU_FONT);
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Game.changeScene(new EditorScene());
            }
        });
        Game.getGamePanel().add(editButton, c);

    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics2D g2) {

    }

}
