package learning.java;

import javax.swing.*;

public class GraphicApp {
    public static void main(String[] args) {
        // Створюємо вікно
        JFrame frame = new JFrame("Графік функції");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(GraphicBuilder.createChartPanel());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
