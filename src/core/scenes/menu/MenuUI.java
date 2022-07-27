package core.scenes.menu;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import core.Game;
import core.GraphicsPanel;
import core.scenes.SceneUI;
import core.scenes.editor.EditorScene;
import core.scenes.game.GameScene;
import util.Const;

public class MenuUI extends SceneUI {

    public MenuUI() {

    }

    public void init() {
        GraphicsPanel graphicsPanel = Game.getInstance().getGameWindow().getGraphicsPanel();

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;
        JLabel title = new JLabel("Title");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font(Const.FONT_NAME, Font.BOLD, 100));
        graphicsPanel.add(title, c);

        c.gridx = 0;
        c.gridy = 1;
        JButton playButton = new JButton("Play");
        playButton.setFont(new Font(Const.FONT_NAME, Font.BOLD, 50));
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.getInstance().setCurrentScene(new GameScene());
            }
        });
        graphicsPanel.add(playButton, c);

        c.gridx = 0;
        c.gridy = 2;
        JButton editorButton = new JButton("Editor");
        editorButton.setFont(new Font(Const.FONT_NAME, Font.BOLD, 30));
        editorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.getInstance().setCurrentScene(new EditorScene());
            }
        });
        graphicsPanel.add(editorButton, c);

        c.gridx = 0;
        c.gridy = 3;
        JButton menuButton = new JButton("Settings");
        menuButton.setFont(new Font(Const.FONT_NAME, Font.BOLD, 30));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.getInstance().setCurrentScene(new MenuScene());
            }
        });
        graphicsPanel.add(menuButton, c);

        c.gridx = 0;
        c.gridy = 4;
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font(Const.FONT_NAME, Font.BOLD, 30));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        graphicsPanel.add(exitButton, c);

        graphicsPanel.revalidate();
    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

}
