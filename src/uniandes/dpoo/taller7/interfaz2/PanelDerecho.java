package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {

    public PanelDerecho() {
    
    	
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnNuevo = new JButton("NUEVO");
        JButton btnReiniciar = new JButton("REINICIAR");
        JButton btnTop10 = new JButton("TOP-10");
        JButton btnCambiarJugador = new JButton("CAMBIAR JUGADOR");

        add(btnNuevo);
        add(btnReiniciar);
        add(btnTop10);
        add(btnCambiarJugador);
    }
}

