package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {

    public PanelInferior() {
        setLayout(new GridLayout(1, 4, 10, 10));

        JLabel labelJugadas = new JLabel("Jugadas:");
        JTextField textJugadas = new JTextField("0");
        JLabel labelJugador = new JLabel("Jugador:");
        JTextField textJugador = new JTextField("");

        add(labelJugadas);
        add(textJugadas);
        add(labelJugador);
        add(textJugador);
    }
}

