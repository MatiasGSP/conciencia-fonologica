package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PanelProfesorSuperior extends JMenuBar{
    
    private JMenu menuAyuda, menuArchivo;
    public JMenuItem itPlanTrabajo, itIndicadores, itIngresarAlumno, itCrearActividad;
    public JMenuItem itCrearCuenta, itAyuda, itVolver, itSalir;

    public PanelProfesorSuperior() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){       
        this.setBackground(Color.WHITE);
        this.menuArchivo = new JMenu("Archivo");
        this.itPlanTrabajo = new JMenuItem("Crear plan de trabajo");       
        this.itIndicadores = new JMenuItem("Ver indicadores");
        this.itIngresarAlumno = new JMenuItem("Ingresar Alumno");
        this.itCrearActividad = new JMenuItem("Crear Avtividad");
        
        this.menuAyuda = new JMenu("Ayuda");
        this.itCrearCuenta = new JMenuItem("Crear cuenta");
        this.itAyuda = new JMenuItem("Ayuda");
        this.itVolver = new JMenuItem("Cerrar Sesion");
        this.itSalir = new JMenuItem("Salir");
        
        this.menuArchivo.add(this.itPlanTrabajo);
        this.menuArchivo.add(this.itIndicadores);
        this.menuArchivo.add(this.itIngresarAlumno);
        this.menuArchivo.add(this.itCrearActividad);
        this.menuAyuda.add(this.itCrearCuenta);
        this.menuAyuda.add(this.itAyuda);
        this.menuAyuda.add(this.itVolver);
        this.menuAyuda.add(this.itSalir);
        
        this.add(this.menuArchivo);
        this.add(this.menuAyuda);
    }
    
//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        VentanaProfesor vp = (VentanaProfesor) SwingUtilities.getWindowAncestor(this);
//        if (this.itPlanTrabajo == ae.getSource()) {
//            VentanaPlanTrabajo vpt = new VentanaPlanTrabajo();
//            vpt.setVisible(true);
//            vp.setVisible(false);
//        }else if(this.itIndicadores == ae.getSource()){
//            VentanaIndicadores vInd = new VentanaIndicadores();
//            vInd.setVisible(true);
//            vp.setVisible(false);
//        }else if(this.itIngresarAlumno == ae.getSource()){
//            String alumno = JOptionPane.showInputDialog(null, "Nombre del alumno");
//        }else if(this.itCrearActividad == ae.getSource()){
//            VentanaCrearActividad vca = new VentanaCrearActividad();
//            vca.setVisible(true);
//            vp.setVisible(false);
//        }else if(this.itCrearCuenta == ae.getSource()){
//            VentanaCreacionUsuario vcu = new VentanaCreacionUsuario();
//            vcu.setVisible(true);
//            vp.setVisible(false);
//        }else if(this.itAyuda == ae.getSource()){
//            JOptionPane.showMessageDialog(null, "Ayuda");
//        }else if(this.itVolver == ae.getSource()){
//            VentanaInicial vi = new VentanaInicial();
//            vi.setVisible(true);
//            vp.setVisible(false);            
//        }else if(this.itSalir == ae.getSource()){
//            System.exit(0);
//        }
//    }
    
}
