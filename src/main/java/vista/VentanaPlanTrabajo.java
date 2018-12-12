package vista;

import datosUsuario.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class VentanaPlanTrabajo extends JFrame implements ActionListener{
    public PanelPlanTrabajo panelPlanTrabajo;
    private Usuario usuario;
    
    public VentanaPlanTrabajo(Usuario usuario) {
        this.usuario = usuario;
        inicializarComponentes();
    }      

    private void inicializarComponentes() {
        this.panelPlanTrabajo = new PanelPlanTrabajo();
        add(this.panelPlanTrabajo);
        
        this.setSize(700, 500);
        this.setTitle("Plan de Trabajo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(VentanaPlanTrabajo.this);
        this.setResizable(false);
        this.setVisible(true); 
        
        this.panelPlanTrabajo.btnAgregarTipo1.addActionListener(this);
        this.panelPlanTrabajo.btnAgregarTipo2.addActionListener(this);
        this.panelPlanTrabajo.btnAgregarTipo3.addActionListener(this);
        this.panelPlanTrabajo.btnEliminar.addActionListener(this);
        this.panelPlanTrabajo.btnVolver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.panelPlanTrabajo.btnAgregarTipo1 == ae.getSource()){
            //agregar actividad tipo1
        }else if(this.panelPlanTrabajo.btnAgregarTipo2  == ae.getSource()){
            //agregar actividad tipo2
        }else if(this.panelPlanTrabajo.btnAgregarTipo3 == ae.getSource()){ 
            //agregar actividad tipo3
        }else if(this.panelPlanTrabajo.btnEliminar == ae.getSource()){
            //eliminar actividad para el plan de trabajo
        }else if(this.panelPlanTrabajo.btnVolver == ae.getSource()){
            //volver
        }
    }
}
