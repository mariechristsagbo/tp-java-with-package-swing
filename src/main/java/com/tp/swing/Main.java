package com.tp.swing;

import com.tp.swing.ui.ExControleur;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExControleur frame = new ExControleur();
            frame.setVisible(true);
        });
    }
}
