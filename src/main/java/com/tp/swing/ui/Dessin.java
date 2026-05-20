package com.tp.swing.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Dessin extends JPanel {
    private String figure = "Carre";
    private Color couleur = Color.BLUE;
    private String text = "Hello World";

    public Dessin() {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        setPreferredSize(new Dimension(360, 260));
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCouleur(String coul) {
        if ("Rouge".equals(coul)) {
            couleur = Color.RED;
        } else if ("Vert".equals(coul)) {
            couleur = Color.GREEN;
        } else {
            couleur = Color.BLUE;
        }
    }

    public void setFigure(String fig) {
        figure = fig;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        Graphics2D g = (Graphics2D) graphics.create();
        try {
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(Color.BLACK);
            g.drawString(text, 18, 28);

            g.setColor(couleur);
            int size = Math.min(getWidth(), getHeight()) / 2;
            int x = (getWidth() - size) / 2;
            int y = (getHeight() - size) / 2 + 10;

            if ("Carre".equals(figure)) {
                g.drawRect(x, y, size, size);
            } else if ("Cercle".equals(figure)) {
                g.drawOval(x, y, size, size);
            } else {
                int[] xPoints = {x + size / 2, x, x + size};
                int[] yPoints = {y, y + size, y + size};
                g.drawPolygon(xPoints, yPoints, 3);
            }
        } finally {
            g.dispose();
        }
    }
}
