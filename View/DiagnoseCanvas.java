package View;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DiagnoseCanvas extends JPanel {
    private static final long serialVersionUID = 1L;
    private DiagPanel diagPanel;
    private String diag = "Diagnosis";
    private int w;
    private int h;
    
    public DiagnoseCanvas(DiagPanel diagPanel) {
        this.diagPanel = diagPanel;
        w = DiagPanel.WIDTH / 3 + 100;
        h = DiagPanel.HEIGHT / 2 + 90;
        setPreferredSize(new Dimension(w, h));
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.GREEN);
        g2.drawString(diag, 145, 20);
    }
}

