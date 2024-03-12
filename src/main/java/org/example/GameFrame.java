package org.example;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Chess Game by Bartosz c:");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        init();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void init() {
        GamePanel gamePanel = new GamePanel();
        SidePanel sidePanel = new SidePanel();

        this.setLayout(new BorderLayout());
        this.add(gamePanel, BorderLayout.CENTER);
        this.add(sidePanel, BorderLayout.EAST);
    }
}
