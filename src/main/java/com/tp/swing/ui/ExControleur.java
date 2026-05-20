package com.tp.swing.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExControleur extends ExInterface implements ListSelectionListener, ActionListener {
    public ExControleur() {
        super();

        addWindowListener(new WindowControleur());

        ChoiceController controller = new ChoiceController(dessin);
        button1.addItemListener(controller);
        button2.addItemListener(controller);
        button3.addItemListener(controller);
        couleur.addItemListener(controller);

        textList.addListSelectionListener(this);
        text.addActionListener(this);
        ajout.addActionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        if (event.getValueIsAdjusting()) {
            return;
        }

        String selected = textList.getSelectedValue();
        if (selected != null) {
            dessin.setText(selected);
        } else {
            dessin.setText("");
        }
        dessin.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String newText = text.getText().trim();
        if (newText.isEmpty()) {
            return;
        }

        listData.addElement(newText);
        text.setText("");
        textList.setSelectedIndex(listData.size() - 1);
        textList.ensureIndexIsVisible(listData.size() - 1);
    }
}
