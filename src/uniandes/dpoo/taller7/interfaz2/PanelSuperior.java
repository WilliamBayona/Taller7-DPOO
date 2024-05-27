package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class PanelSuperior extends JPanel {

    public PanelSuperior() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel labelTamano = new JLabel("Tama�o");
        String[] tamanos = {"5x5"};
        JComboBox<String> comboBoxTamano = new JComboBox<>(tamanos);

        JLabel labelDificultad = new JLabel("Dificultad");
        JRadioButton radioFacil = new JRadioButton("F�cil");
        JRadioButton radioMedio = new JRadioButton("Medio");
        JRadioButton radioDificil = new JRadioButton("Dif�cil");

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