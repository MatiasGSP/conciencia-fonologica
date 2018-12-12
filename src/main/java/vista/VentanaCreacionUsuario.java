package vista;

import javax.swing.JFrame;

public class VentanaCreacionUsuario extends JFrame{
    public PanelCreacionUsuario panelUsu;
    
    public VentanaCreacionUsuario() {
        inicializarComponentes();
    }      

    private void inicializarComponentes() {
        
        this.panelUsu = new PanelCreacionUsuario();
        this.add(this.panelUsu);
        
        this.setSize(800, 500);
        this.setTitle("Fonoaudiologia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(VentanaCreacionUsuario.this);
        this.setResizable(false);
        this.setVisible(true); 
    }
}
