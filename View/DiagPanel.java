package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.JButtonListener;

public class DiagPanel {

    private Color background = new Color(10, 40, 50);
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    private JFrame window;    
    private JButton connectButton;
    private JButton diagnoseButton;
    private JButton deliverResultsButton;
    private JButton quitButton;
    private Dimension buttonDimension = new Dimension(200, 30);
    private JButtonListener jButtonListener;

    public DiagPanel(JFrame window) {
        this.window = window;
        connectButton = new JButton("Connect");
        diagnoseButton = new JButton("Diagnose");
        deliverResultsButton = new JButton("Deliver Results");
        quitButton = new JButton("Quit");
        jButtonListener = new JButtonListener(this);
        connectButton.addActionListener(jButtonListener);
        diagnoseButton.addActionListener(jButtonListener);
        deliverResultsButton.addActionListener(jButtonListener);
        quitButton.addActionListener(jButtonListener);
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel northPanel = new JPanel();
        northPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT / 10));
        northPanel.setBackground(background);
        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(WIDTH / 3 + 200, HEIGHT / 2 + 100));
        eastPanel.setBackground(background);
        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(WIDTH / 3 + 200, HEIGHT / 2 + 100));
        westPanel.setBackground(background);
        JPanel southPanel = new JPanel();
        southPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT / 8));
        southPanel.setBackground(background);
        JPanel spacer = new JPanel();
        spacer.setPreferredSize(new Dimension(WIDTH, 50));
        spacer.setBackground(background);
        southPanel.add(BorderLayout.NORTH, spacer);

        connectButton.setPreferredSize(buttonDimension);
        southPanel.add(connectButton);
        diagnoseButton.setPreferredSize(buttonDimension);
        southPanel.add(diagnoseButton);
        deliverResultsButton.setPreferredSize(buttonDimension);
        southPanel.add(deliverResultsButton);
        quitButton.setPreferredSize(buttonDimension);
        southPanel.add(quitButton);

        westPanel.add(new DiagnoseCanvas(this));
        eastPanel.add(new UploadCanvas(this));

        cp.add(BorderLayout.NORTH, northPanel);
        cp.add(BorderLayout.EAST, eastPanel);
        cp.add(BorderLayout.WEST, westPanel);
        cp.add(BorderLayout.SOUTH, southPanel);
    }

    public JButton getConnectButton() {
        return connectButton;
    }

    public JButton getDeliverResultsButton() {
        return deliverResultsButton;
    }

    public JButton getDiagnoseButton() {
        return diagnoseButton;
    }

    public JButton getQuitButton() {
        return quitButton;
    }
}