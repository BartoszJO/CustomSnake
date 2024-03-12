package org.example;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {
    SidePanel() {
        Dimension size = new Dimension(200, GamePanel.BOARD_SIZE);
        this.setPreferredSize(size);
        this.setBackground(Color.black);
        // Tutaj dodajemy przyciski lub inne elementy, które mają się znaleźć na panelu bocznym
    }
}
