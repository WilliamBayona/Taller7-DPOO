package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class PanelSuperior extends JPanel {

    private JComboBox<String> comboBoxTamano;
    private JRadioButton radioFacil;
    private JRadioButton radioMedio;
    private JRadioButton radioDificil;

    public PanelSuperior() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Estilo.BACKGROUND_COLOR);
        setForeground(Estilo.FOREGROUND_COLOR);

        JLabel labelTamano = new JLabel("Tamaño");
        labelTamano.setFont(Estilo.LIGHT_FONT);
        labelTamano.setForeground(Estilo.FOREGROUND_COLOR);

        String[] tamanos = {"3x3", "4x4", "5x5", "6x6", "7x7", "8x8"};
        comboBoxTamano = new JComboBox<>(tamanos);
        comboBoxTamano.setSelectedIndex(2); // Selecciona 5x5 por defecto
        comboBoxTamano.setFont(Estilo.LIGHT_FONT);
        comboBoxTamano.setBackground(Estilo.BACKGROUND_COLOR);
        comboBoxTamano.setForeground(Estilo.FOREGROUND_COLOR);

        JLabel labelDificultad = new JLabel("Dificultad");
        labelDificultad.setFont(Estilo.LIGHT_FONT);
        labelDificultad.setForeground(Estilo.FOREGROUND_COLOR);

        radioFacil = new JRadioButton("Fácil");
        radioMedio = new JRadioButton("Medio");
        radioDificil = new JRadioButton("Difícil");

        radioFacil.setFont(Estilo.LIGHT_FONT);
        radioMedio.setFont(Estilo.LIGHT_FONT);
        radioDificil.setFont(Estilo.LIGHT_FONT);

        radioFacil.setBackground(Estilo.BACKGROUND_COLOR);
        radioFacil.setForeground(Estilo.FOREGROUND_COLOR);
        radioMedio.setBackground(Estilo.BACKGROUND_COLOR);
        radioMedio.setForeground(Estilo.FOREGROUND_COLOR);
        radioDificil.setBackground(Estilo.BACKGROUND_COLOR);
        radioDificil.setForeground(Estilo.FOREGROUND_COLOR);

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

    public int getSelectedSize() {
        return Integer.parseInt(comboBoxTamano.getSelectedItem().toString().substring(0, 1));
    }

    public String getSelectedDifficulty() {
        if (radioFacil.isSelected()) {
            return "Fácil";
        } else if (radioMedio.isSelected()) {
            return "Medio";
        } else {
            return "Difícil";
        }
    }
}
