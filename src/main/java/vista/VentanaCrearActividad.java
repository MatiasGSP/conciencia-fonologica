package vista;

import javax.swing.JFrame;

public class VentanaCrearActividad extends JFrame{
    public PanelCrearActividad panelCrearAct;
    
    public VentanaCrearActividad() {
        inicializarComponentes();
    }      

    private void inicializarComponentes() {
        this.panelCrearAct = new PanelCrearActividad();
        this.add(this.panelCrearAct);
        
        this.setSize(800, 500);
        this.setTitle("Fonoaudiologia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(VentanaCrearActividad.this);
        this.setResizable(false);
        this.setVisible(true); 
    }
}
