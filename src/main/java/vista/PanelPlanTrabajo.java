package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPlanTrabajo extends JPanel{
    public JButton btnAgregarTipo1, btnAgregarTipo2, btnAgregarTipo3, btnVolver, btnEliminar;
    private final ImageIcon imgAgregar = new ImageIcon("src/main/java/imagenPanel/Agregar_1.png");
    private final ImageIcon imgVolver = new ImageIcon("src/main/java/imagenPanel/Volver_3.png");    
    private final ImageIcon imgEliminar = new ImageIcon("src/main/java/imagenPanel/Eliminar.png");    
    private JComboBox cboxAlumno, cboxActividad, cboxTipo1, cboxTipo2, cboxTipo3;
    private JLabel lblAlumno, lblTipo1, lblTipo2, lblTipo3, lblActividad;

    public PanelPlanTrabajo() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        
        
        this.lblAlumno = new JLabel("Alumno:");
        this.lblAlumno.setBounds(225, 40, 50, 30);
        add(this.lblAlumno);        
        this.cboxAlumno = new JComboBox(); //por modificar de los archivos de los alumnos
        this.cboxAlumno.addItem("Andy");
        this.cboxAlumno.addItem("Araceli");
        this.cboxAlumno.addItem("Max");
        this.cboxAlumno.setBounds(280, 40, 200, 30);
        add(this.cboxAlumno);
        
        this.lblTipo1 = new JLabel("Tipo 1");
        this.lblTipo1.setBounds(90, 110, 50, 30);
        add(this.lblTipo1);
        this.cboxTipo1 = new JComboBox(); //por modificar de los archivos de actividades tipo1
        this.cboxTipo1.addItem("");
        this.cboxTipo1.addItem("");
        this.cboxTipo1.setBounds(65, 145, 100, 30);
        add(this.cboxTipo1);
        this.btnAgregarTipo1= new JButton();
        this.btnAgregarTipo1.setBounds(65,195,100,20);
        this.btnAgregarTipo1.setBorderPainted(false);
        this.btnAgregarTipo1.setIcon(imgAgregar);    
        add(this.btnAgregarTipo1);
        
        this.lblTipo2 = new JLabel("Tipo 2");
        this.lblTipo2.setBounds(325, 110, 50, 30);
        add(this.lblTipo2);
        this.cboxTipo2 = new JComboBox(); //por modificar de los archivos de actividades tipo2
        this.cboxTipo2.addItem("");
        this.cboxTipo2.addItem("");
        this.cboxTipo2.setBounds(300, 145, 100, 30);
        add(this.cboxTipo2);
        this.btnAgregarTipo2= new JButton();
        this.btnAgregarTipo2.setBounds(300,195,100,20);
        this.btnAgregarTipo2.setBorderPainted(false);
        this.btnAgregarTipo2.setIcon(imgAgregar);    
        add(this.btnAgregarTipo2);
        
        this.lblTipo3 = new JLabel("Tipo 3");
        this.lblTipo3.setBounds(550, 110, 50, 30);
        add(this.lblTipo3);
        this.cboxTipo3 = new JComboBox(); //por modificar de los archivos de actividades tipo3
        this.cboxTipo3.addItem("");
        this.cboxTipo3.addItem("");
        this.cboxTipo3.setBounds(525, 145, 100, 30);
        add(this.cboxTipo3);
        this.btnAgregarTipo3= new JButton();
        this.btnAgregarTipo3.setBounds(525,195,100,20);
        this.btnAgregarTipo3.setBorderPainted(false);
        this.btnAgregarTipo3.setIcon(imgAgregar);    
        add(this.btnAgregarTipo3);
        
        String texto = "<html><body>Actividades de <br>alumno </body></html>";
        this.lblActividad = new JLabel(texto);
        this.lblActividad.setBounds(180, 300, 100, 40);
        add(this.lblActividad);
        this.cboxActividad = new JComboBox();
        this.cboxActividad.addItem("");
        this.cboxActividad.addItem("");
        this.cboxActividad.setBounds(285, 305, 150, 30);
        add(this.cboxActividad);
        this.btnEliminar= new JButton();
        this.btnEliminar.setBounds(485,305,100,30);
        this.btnEliminar.setBorderPainted(false);
        this.btnEliminar.setIcon(imgEliminar);    
        add(this.btnEliminar);
        
        this.btnVolver= new JButton();
        this.btnVolver.setBounds(310,430,100,30);
        this.btnVolver.setBorderPainted(false);
        this.btnVolver.setIcon(imgVolver);    
        add(this.btnVolver);
    }
}
