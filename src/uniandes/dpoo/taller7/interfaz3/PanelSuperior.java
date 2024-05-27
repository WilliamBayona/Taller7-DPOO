package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uniandes.dpoo.taller7.interfaz3.PanelTablero;

public class PanelSuperior extends JPanel {

    private JComboBox<String> comboBoxTamano;
    private PanelTablero panelTablero;

    public PanelSuperior(PanelTablero panelTablero) {
        this.panelTablero = panelTablero;
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel labelTamano = new JLabel("Tamaño");
        String[] tamanos = {"3x3", "4x4", "5x5", "6x6", "7x7", "8x8"};
        comboBoxTamano = new JComboBox<>(tamanos);
        comboBoxTamano.setSelectedIndex(2); // Dejo la de 5x5 por defecto
        comboBoxTamano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int newSize = Integer.parseInt(comboBoxTamano.getSelectedItem().toString().substring(0, 1));
                panelTablero.setSize(newSize);
            }
        });

        JLabel labelDificultad = new JLabel("Dificultad");
        JRadioButton radioFacil = new JRadioButton("Fácil");
        JRadioButton radioMedio = new JRadioButton("Medio");
        JRadioButton radioDificil = new JRadioButton("Difícil");

        ButtonGroup grupoDificultad = new ButtonGroup();
        grupoDificultad.add(radioFacil);
        grupoDificultad.add(radioMedio);
        grupoDificultad.add(radioDificil);

        add(labelTamano);
        add(comboBoxTamano);
        add(labelDificultad);
        add(radioFacil);
        add(radioMedio);
        add(radioDificil);
    }
}
