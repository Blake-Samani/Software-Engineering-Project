package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class DiagPanel {
    
    private JFrame window;

    private JTextField patientID = new JTextField(20); 
    private JTextField clumpThickness = new JTextField(20); 
    private JTextField cellSize = new JTextField(20); 
    private JTextField cellShape = new JTextField(20); 
    private JTextField margAdhesion = new JTextField(20); 
    private JTextField singEpCellSize = new JTextField(20); 
    private JTextField bareNuclei = new JTextField(20); 
    private JTextField blandChromatin = new JTextField(20); 
    private JTextField normalNucleoli = new JTextField(20); 
    private JTextField mitosis = new JTextField(20); 
     
    
    

    public DiagPanel(JFrame window){
        this.window = window;
    }

    public void init(){
        Container cp = window.getContentPane();

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,800));
        panel.setLayout(new GridLayout(10,1));
        

        JButton submitButton = new JButton("Submit");
        
        panel.add(patientID);
        panel.add(clumpThickness);
        panel.add(cellSize);
        panel.add(cellShape);
        panel.add(margAdhesion);
        panel.add(singEpCellSize);
        panel.add(bareNuclei);
        panel.add(blandChromatin);
        panel.add(normalNucleoli);
        panel.add(mitosis);
        panel.add(submitButton);

      
        cp.add(BorderLayout.CENTER, panel);
        
        
        
        
        
    }
}
