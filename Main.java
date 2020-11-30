import javax.swing.JFrame;


import View.DiagPanel;

public class Main{
    public static void main(String [] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Cancer Diagnosis Program");
        window.setLocation(500, 200);

        var DiagPanel = new DiagPanel(window);
        DiagPanel.init();

        window.setResizable(false);
        window.pack();
        window.setVisible(true);
        
    }
}