package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;
import uniandes.dpoo.taller7.interfaz3.PanelTablero;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuraci�n del JFrame
        setTitle("Juego de LightsOut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Configuraci�n de los p�neles
        PanelTablero panelTablero = new PanelTablero();
        PanelSuperior panelSuperior = new PanelSuperior(panelTablero);
        PanelDerecho panelDerecho = new PanelDerecho();
        PanelInferior panelInferior = new PanelInferior();

        // Configuraci�n del layout
        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
        add(panelTablero, BorderLayout.CENTER);
        add(panelDerecho, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal();
            }
        });
    }
}
