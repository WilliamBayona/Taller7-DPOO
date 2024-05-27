package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTablero extends JPanel {

    private int size = 5; // Tamaño inicial del tablero (5x5)

    public PanelTablero() {
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int cellWidth = panelWidth / size;
        int cellHeight = panelHeight / size;

        g2d.setColor(Color.YELLOW);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int x = col * cellWidth;
                int y = row * cellHeight;
                g2d.fillRect(x, y, cellWidth, cellHeight);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(x, y, cellWidth, cellHeight);
                g2d.setColor(Color.YELLOW);
            }
        }
    }

    public void setSize(int size) {
        this.size = size;
        repaint();
    }
}
