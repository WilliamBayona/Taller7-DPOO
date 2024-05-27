package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uniandes.dpoo.taller7.interfaz4.PanelTablero;
import uniandes.dpoo.taller7.modelo.Tablero;
import uniandes.dpoo.taller7.modelo.RegistroTop10;
import uniandes.dpoo.taller7.modelo.Top10;

public class PanelDerecho extends JPanel implements ActionListener {

    private JButton btnNuevo;
    private JButton btnReiniciar;
    private JButton btnTop10;
    private JButton btnCambiarJugador;
    private PanelTablero panelTablero;
    private PanelSuperior panelSuperior;
    private PanelInferior panelInferior;
    private Tablero tableroActual;
    private int jugadas;
    private Top10 top10;

    public PanelDerecho(PanelTablero panelTablero, PanelSuperior panelSuperior, PanelInferior panelInferior) {
        this.panelTablero = panelTablero;
        this.panelSuperior = panelSuperior;
        this.panelInferior = panelInferior;
        this.top10 = new Top10();
        setLayout(new GridBagLayout());
        setBackground(Estilo.BACKGROUND_COLOR);
        setForeground(Estilo.FOREGROUND_COLOR);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        Dimension buttonSize = new Dimension(120, 30); // Ajusta el tamaño preferido de los botones

        btnNuevo = new JButton("NUEVO");
        btnNuevo.setPreferredSize(buttonSize);
        btnNuevo.setFont(Estilo.LIGHT_FONT);
        btnNuevo.setBackground(Estilo.BUTTON_COLOR);
        btnNuevo.setForeground(Estilo.FOREGROUND_COLOR);
        btnNuevo.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(btnNuevo, gbc);

        btnReiniciar = new JButton("REINICIAR");
        btnReiniciar.setPreferredSize(buttonSize);
        btnReiniciar.setFont(Estilo.LIGHT_FONT);
        btnReiniciar.setBackground(Estilo.BUTTON_COLOR);
        btnReiniciar.setForeground(Estilo.FOREGROUND_COLOR);
        btnReiniciar.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(btnReiniciar, gbc);

        btnTop10 = new JButton("TOP-10");
        btnTop10.setPreferredSize(buttonSize);
        btnTop10.setFont(Estilo.LIGHT_FONT);
        btnTop10.setBackground(Estilo.BUTTON_COLOR);
        btnTop10.setForeground(Estilo.FOREGROUND_COLOR);
        btnTop10.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(btnTop10, gbc);

        btnCambiarJugador = new JButton("CAMBIAR JUGADOR");
        btnCambiarJugador.setPreferredSize(buttonSize);
        btnCambiarJugador.setFont(Estilo.LIGHT_FONT);
        btnCambiarJugador.setBackground(Estilo.BUTTON_COLOR);
        btnCambiarJugador.setForeground(Estilo.FOREGROUND_COLOR);
        btnCambiarJugador.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(btnCambiarJugador, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNuevo) {
            int size = panelSuperior.getSelectedSize();
            String dificultad = panelSuperior.getSelectedDifficulty();
            tableroActual = new Tablero(size);
            tableroActual.desordenar(convertirDificultad(dificultad));
            panelTablero.setTablero(tableroActual, size);
            jugadas = 0;
            panelInferior.setJugadas(jugadas);
        } else if (e.getSource() == btnReiniciar) {
        	
            if (tableroActual != null) {
            	int size = panelSuperior.getSelectedSize();
                tableroActual.reiniciar();
                panelTablero.setTablero(tableroActual, jugadas);
                jugadas = 0;
                panelInferior.setJugadas(jugadas);
            }
        } else if (e.getSource() == btnTop10) {
            // Acción para mostrar los 10 mejores
            JDialog dialog = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Top 10 Puntajes", true);
            dialog.setSize(300, 200);
            dialog.setLocationRelativeTo(this);
            JTextArea textArea = new JTextArea();
            for (RegistroTop10 registro : top10.darRegistros()) {
                textArea.append(registro.toString() + "\n");
            }
            textArea.setEditable(false);
            dialog.add(new JScrollPane(textArea));
            dialog.setVisible(true);
        } else if (e.getSource() == btnCambiarJugador) {
            // Acción para cambiar de jugador
            String jugador = JOptionPane.showInputDialog(this, "Ingrese el nombre del nuevo jugador:");
            if (jugador != null && !jugador.isEmpty()) {
                panelInferior.setJugador(jugador);
            }
        }
    }

    private int convertirDificultad(String dificultad) {
        switch (dificultad) {
            case "Fácil":
                return 10;
            case "Medio":
                return 20;
            case "Difícil":
                return 30;
            default:
                return 10;
        }
    }
}
