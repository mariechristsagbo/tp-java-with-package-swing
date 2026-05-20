package com.tp.swing.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowControleur extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }
}
