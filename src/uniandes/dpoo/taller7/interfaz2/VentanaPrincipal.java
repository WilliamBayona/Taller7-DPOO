package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        // Configuración del JFrame
        setTitle("Juego de LightsOut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        
        // Configuración de los páneles
        PanelSuperior panelSuperior = new PanelSuperior();
        PanelDerecho panelDerecho = new PanelDerecho();
        PanelInferior panelInferior = new PanelInferior();

        // Configuración del layout
        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
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
