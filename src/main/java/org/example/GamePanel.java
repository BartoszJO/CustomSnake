package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    static final int UNIT_SIZE = 75; // Rozmiar jednostki (kwadratu) na planszy
    static final int GAME_SIZE = 8; // Liczba jednostek w poziomie i pionie
    static final int BOARD_SIZE = UNIT_SIZE * GAME_SIZE; // Całkowity rozmiar planszy
    static final int DELAY = 75;
    boolean running = false;
    Timer timer;

    GamePanel() {
        // Zmieniamy wymiar na wymiar samej planszy
        this.setPreferredSize(new Dimension(BOARD_SIZE, BOARD_SIZE));
        this.setBackground(Color.lightGray); // Można zmienić, jeśli trzeba
        this.setFocusable(true);
        startGame();
    }

    public void startGame() {
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {
            // Rysowanie szachownicy
            for (int i = 0; i < GAME_SIZE; i++) {
                for (int j = 0; j < GAME_SIZE; j++) {
                    if ((i + j) % 2 == 0) {
                        g.setColor(Color.white);
                    } else {
                        g.setColor(Color.gray);
                    }
                    g.fillRect(j * UNIT_SIZE, i * UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
