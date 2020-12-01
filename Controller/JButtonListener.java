package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import View.DiagPanel;

public class JButtonListener implements ActionListener {

    private DiagPanel diagPanel;

    public JButtonListener(DiagPanel diagPanel) {
        this.diagPanel = diagPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton b = (JButton) e.getSource();
        
        if (b == diagPanel.getConnectButton()) {

        } else if (b == diagPanel.getDiagnoseButton()) {

        } else if (b == diagPanel.getDeliverResultsButton()) {
            
        } else if (b == diagPanel.getQuitButton()) {
            System.exit(0);
        }
    }
    
}
