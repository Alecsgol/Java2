package ru.goluzov.se;

import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {

    Frame() {
        setTitle("Chat");
        setSize(new Dimension(300, 300));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        BigTextPanel bigTextPanel = new BigTextPanel();
        SendPanel sendPanel = new SendPanel(bigTextPanel.getTextArea());

        add(bigTextPanel, BorderLayout.CENTER);
        add(sendPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
