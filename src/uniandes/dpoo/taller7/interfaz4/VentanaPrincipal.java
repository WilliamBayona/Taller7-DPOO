package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import uniandes.dpoo.taller7.interfaz4.PanelTablero;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración del JFrame
        setTitle("Juego de LightsOut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Configuración de los páneles
        PanelTablero panelTablero = new PanelTablero();
        PanelSuperior panelSuperior = new PanelSuperior();
        PanelInferior panelInferior = new PanelInferior();
        PanelDerecho panelDerecho = new PanelDerecho(panelTablero, panelSuperior, panelInferior);

        // Configuración del layout
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
