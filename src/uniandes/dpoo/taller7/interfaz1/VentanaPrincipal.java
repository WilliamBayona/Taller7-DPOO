package uniandes.dpoo.taller7.interfaz1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        super("Juego de LightsOut");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        setSize(1200, 800);
        setLocationRelativeTo(null);
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
