package vista;

import javax.swing.JFrame;

public class VentanaIndicadores extends JFrame{
    public PanelIndicadores panelInd;
    
    public VentanaIndicadores() {
        inicializarComponentes();
    }      

    private void inicializarComponentes() {
        this.panelInd = new PanelIndicadores();
        this.add(this.panelInd);
        
        this.setSize(500, 500);
        this.setTitle("Fonoaudiologia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(VentanaIndicadores.this);
        this.setResizable(false);
        this.setVisible(true); 
    }
}
