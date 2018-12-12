package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelActividad extends JPanel{
    private JLabel lblActividad, lblEnunciado;
    private JTextField txtRespuesta;
    public JButton btnVolver, btnSiguiente;
    private ImageIcon imgVolver = new ImageIcon("src/main/java/imagenPanel/Volver.png");
    private ImageIcon imgSgte = new ImageIcon("src/main/java/imagenPanel/Siguiente.png");
    private ImageIcon imgIngresar = new ImageIcon("src/main/java/imagenPanel/Ingresar.png");
    
    public PanelActividad() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){ 
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        
        this.lblActividad = new JLabel("CAMA"); //aqui va el archivo
        this.lblActividad.setBounds(630,150,150,30);
        add(this.lblActividad);
        
        this.lblEnunciado= new JLabel();
        this.lblEnunciado.setBounds(570,300,200,30);
        this.lblEnunciado.setIcon(imgIngresar);
        add(this.lblEnunciado);        
        
        this.txtRespuesta = new JTextField();
        this.txtRespuesta.setBounds(640,335,20,20);
        add(this.txtRespuesta);
        
        this.btnSiguiente=new JButton();
        this.btnSiguiente.setBounds(600,365,100,20);
      
        this.btnSiguiente.setBorderPainted(false);
        this.btnSiguiente.setIcon(imgSgte);  
        add(this.btnSiguiente);
        
        this.btnVolver=new JButton();
        this.btnVolver.setBounds(1,1,150,20);
        
        this.btnVolver.setBorderPainted(false);
        this.btnVolver.setIcon(imgVolver);   
        add(this.btnVolver);
    }

//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        VentanaActividad va = (VentanaActividad) SwingUtilities.getWindowAncestor(this);
//        if(this.btnVolver == ae.getSource()){
//            VentanaInicial vi = new VentanaInicial();
//            vi.setVisible(true);
//            va.setVisible(false);
//        }
//    }
}