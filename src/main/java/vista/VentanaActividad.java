package vista;

import ejecucion.GestorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class VentanaActividad extends JFrame implements ActionListener{
    public PanelActividad panelAct;

    public VentanaActividad() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        this.panelAct = new PanelActividad();
        this.add(this.panelAct);
        this.panelAct.btnVolver.addActionListener(this);
        
        this.setSize(800, 500);
        this.setTitle("Fonoaudiologia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(VentanaActividad.this);
        this.setResizable(false);
        this.setVisible(true);
    } 
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(this.panelAct.btnVolver == ae.getSource()){
            this.setVisible(false);
            GestorFrame gf = new GestorFrame();
        }
    }
}