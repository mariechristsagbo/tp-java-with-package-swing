package com.tp.swing.ui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class ChoiceController implements ItemListener {
    private final Dessin dessin;

    public ChoiceController(Dessin dessin) {
        this.dessin = dessin;
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        if (event.getStateChange() != ItemEvent.SELECTED) {
            return;
        }

        Object source = event.getSource();
        if (source instanceof JRadioButton) {
            JRadioButton button = (JRadioButton) source;
            dessin.setFigure(button.getText());
        } else if (source instanceof JComboBox) {
            JComboBox<?> comboBox = (JComboBox<?>) source;
            dessin.setCouleur((String) comboBox.getSelectedItem());
        } else {
            System.err.println("Erreur - composant non valide");
        }

        dessin.repaint();
    }
}
