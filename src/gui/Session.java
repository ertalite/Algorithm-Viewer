package gui;

import javax.swing.*;

public class Session {

    // Creating instance of JFrame
    JFrame frame;
    // Creating instance of JButton
    JButton button;

    public Session() {
        frame = new JFrame();
        button = new JButton("Bouton");

        // x axis, y axis, width, height
        button.setBounds(150, 200, 220, 50);

        // adding button in JFrame
        frame.add(button);

        // 400 width and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}