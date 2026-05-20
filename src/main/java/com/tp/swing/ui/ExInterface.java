package com.tp.swing.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class ExInterface extends JFrame {
    protected JRadioButton button1;
    protected JRadioButton button2;
    protected JRadioButton button3;
    protected JComboBox<String> couleur;
    protected JTextField text;
    protected JButton ajout;
    protected JList<String> textList;
    protected DefaultListModel<String> listData;
    protected Dessin dessin;

    public ExInterface() {
        super("Un exemple de fenetre");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        mainPanel.add(createTopPanel(), BorderLayout.CENTER);
        mainPanel.add(createBottomPanel(), BorderLayout.SOUTH);

        setContentPane(mainPanel);
        setMinimumSize(new Dimension(620, 520));
        pack();
        setLocationRelativeTo(null);
    }

    private JPanel createTopPanel() {
        JPanel topPanel = new JPanel(new BorderLayout(20, 0));
        dessin = new Dessin();
        topPanel.add(createLeftPanel(), BorderLayout.WEST);
        topPanel.add(dessin, BorderLayout.CENTER);
        return topPanel;
    }

    private JPanel createLeftPanel() {
        JPanel gauche = new JPanel(new GridLayout(6, 1, 0, 5));

        button1 = new JRadioButton("Carre", true);
        button2 = new JRadioButton("Cercle", false);
        button3 = new JRadioButton("Triangle", false);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);

        couleur = new JComboBox<>(new String[] {"Bleu", "Rouge", "Vert"});

        gauche.add(new JLabel("Forme:"));
        gauche.add(button1);
        gauche.add(button2);
        gauche.add(button3);
        gauche.add(new JLabel("Couleur:"));
        gauche.add(couleur);

        return gauche;
    }

    private JPanel createBottomPanel() {
        JPanel bas = new JPanel(new BorderLayout(0, 15));
        bas.add(createTextList(), BorderLayout.CENTER);
        bas.add(createAddTextPanel(), BorderLayout.SOUTH);
        return bas;
    }

    private JScrollPane createTextList() {
        listData = new DefaultListModel<>();
        listData.addElement("Hello World");
        listData.addElement("Une belle figure");
        listData.addElement("Champions du monde !");
        listData.addElement("A ciao, bonsoir...");
        listData.addElement("Changez la couleur");
        listData.addElement("J'adore Java");
        listData.addElement("Allez les verts !");
        listData.addElement("Ca marche");
        listData.addElement("blablabla");

        textList = new JList<>(listData);
        textList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        textList.setSelectedIndex(0);

        JScrollPane scrollPane = new JScrollPane(textList);
        scrollPane.setPreferredSize(new Dimension(560, 110));
        return scrollPane;
    }

    private JPanel createAddTextPanel() {
        JPanel textPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0, 0, 8, 0);
        textPanel.add(new JLabel("Ajouter un texte possible:"), constraints);

        text = new JTextField(16);
        constraints.gridy = 1;
        textPanel.add(text, constraints);

        ajout = new JButton("Ajouter");
        constraints.gridy = 2;
        constraints.insets = new Insets(8, 0, 0, 0);
        textPanel.add(ajout, constraints);

        return textPanel;
    }
}
