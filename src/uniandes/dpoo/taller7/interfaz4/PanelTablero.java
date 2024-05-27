package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import uniandes.dpoo.taller7.interfaz4.Estilo;
import uniandes.dpoo.taller7.modelo.Tablero;

public class PanelTablero extends JPanel {

    private Tablero tablero;
    private int size;

    public PanelTablero() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Estilo.BACKGROUND_COLOR);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (tablero != null) {
                    int panelWidth = getWidth();
                    int panelHeight = getHeight();
                    int cellWidth = panelWidth / size;
                    int cellHeight = panelHeight / size;

                    int col = e.getX() / cellWidth;
                    int row = e.getY() / cellHeight;

                    tablero.jugar(row, col);
                    repaint();
                }
            }
        });
    }

    public void setTablero(Tablero tablero, int size) {
        this.tablero = tablero;
        this.size = size;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (tablero != null) {
            Graphics2D g2d = (Graphics2D) g;

            int panelWidth = getWidth();
            int panelHeight = getHeight();
            int cellWidth = panelWidth / size;
            int cellHeight = panelHeight / size;

            boolean[][] board = tablero.darTablero();

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    int x = col * cellWidth;
                    int y = row * cellHeight;
                    if (board[row][col]) {
                        g2d.setColor(Color.YELLOW);
                    } else {
                        g2d.setColor(Estilo.BACKGROUND_COLOR);
                    }
                    g2d.fillRect(x, y, cellWidth, cellHeight);
                    g2d.setColor(Estilo.FOREGROUND_COLOR);
                    g2d.drawRect(x, y, cellWidth, cellHeight);
                }
            }
        }
    }
}
