package com.tp.swing.ui;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Application Java Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(createContentPane());
    }

    private JPanel createContentPane() {
        JPanel panel = new JPanel(new BorderLayout(16, 16));
        panel.setBorder(new EmptyBorder(24, 24, 24, 24));

        JLabel title = new JLabel("Bienvenue dans ton application Swing", SwingConstants.CENTER);
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        JButton button = new JButton("Tester");
        button.addActionListener(event -> JOptionPane.showMessageDialog(
                this,
                "Le projet Java Swing fonctionne.",
                "Test",
                JOptionPane.INFORMATION_MESSAGE));

        panel.add(title, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        return panel;
    }
}
