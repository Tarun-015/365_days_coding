// Example 1: Simple JFrame Window

// This will show a simple window with a text label.

import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, Welcome to Java GUI!", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}
