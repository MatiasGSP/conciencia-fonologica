package vista;

import datosUsuario.Alumno;
import datosUsuario.Usuario;
import escrituraArchivos.EscritorJson;
import escrituraArchivos.GestorDeCarpeta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelProfesorInferior extends JPanel{
    
    private JLabel lblAlumnos;
    private final ImageIcon imgAlumnos = new ImageIcon("src/main/java/imagenPanel/Alumnos.png");  
    public JTable tabla;    
    public DefaultTableModel modelo;
    private EscritorJson json;
    private String ruta;
    private Usuario usuario;
    
    public PanelProfesorInferior(Usuario usuario) throws IOException {
//        json = new EscritorJson(usuario);
        this.usuario=usuario;
//        this.ruta = GestorDeCarpeta.ruta+GestorDeCarpeta.separador+"datos"+GestorDeCarpeta.separador+this.usuario.getNombre()+".json";
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){   
        this.setBackground(Color.WHITE);
        this.lblAlumnos= new JLabel();
        this.lblAlumnos.setBounds(200,20,100,20);
        this.lblAlumnos.setIcon(imgAlumnos);
        add(this.lblAlumnos);
        
        this.modelo = new DefaultTableModel();
        this.modelo.addColumn("ALUMNO");
        this.modelo.addColumn("ESTADO DEL PLAN DE TRABAJO");
        this.tabla = new JTable(modelo);
        
//        for(int i=0;i<usuario.alumnos.size();i++){
//            if(this.usuario.alumnos.get(i).comprobarPlanTrabajo()){
//                Object[] fila = {this.usuario.alumnos.get(i).getNombre() , "Actividades pendientes"};
//                this.modelo.addRow(fila);
//            }else{
//                Object[] fila = {this.usuario.alumnos.get(i).getNombre() , "Sin actividades pendientes"};
//                this.modelo.addRow(fila);
//            }
//        }
        JScrollPane scroll = new JScrollPane(this.tabla);
        this.add(scroll);
        
                
    }
    
}


