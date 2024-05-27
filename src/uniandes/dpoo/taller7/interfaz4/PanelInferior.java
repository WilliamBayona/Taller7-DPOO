package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {

    private JLabel labelJugadas;
    private JTextField textJugadas;
    private JLabel labelJugador;
    private JTextField textJugador;

    public PanelInferior() {
        setLayout(new GridLayout(1, 4, 10, 10));
        setBackground(Estilo.BACKGROUND_COLOR);
        setForeground(Estilo.FOREGROUND_COLOR);

        labelJugadas = new JLabel("Jugadas:");
        labelJugadas.setFont(Estilo.LIGHT_FONT);
        labelJugadas.setForeground(Estilo.FOREGROUND_COLOR);
        textJugadas = new JTextField("0");
        textJugadas.setFont(Estilo.LIGHT_FONT);
        textJugadas.setBackground(Estilo.BUTTON_COLOR);
        textJugadas.setForeground(Estilo.FOREGROUND_COLOR);
        textJugadas.setEditable(false);

        labelJugador = new JLabel("Jugador:");
        labelJugador.setFont(Estilo.LIGHT_FONT);
        labelJugador.setForeground(Estilo.FOREGROUND_COLOR);
        textJugador = new JTextField("");
        textJugador.setFont(Estilo.LIGHT_FONT);
        textJugador.setBackground(Estilo.BUTTON_COLOR);
        textJugador.setForeground(Estilo.FOREGROUND_COLOR);
        textJugador.setEditable(false);

        add(labelJugadas);
        add(textJugadas);
        add(labelJugador);
        add(textJugador);
    }

    public void setJugadas(int jugadas) {
        textJugadas.setText(String.valueOf(jugadas));
    }

    public void setJugador(String jugador) {
        textJugador.setText(jugador);
    }
}
