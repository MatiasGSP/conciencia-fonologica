package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelCrearActividad extends JPanel implements ActionListener{
    private JButton tipo1,tipo2,tipo3, btnAgregar, btnLimpiar, btnVolver;
    private final ImageIcon ImgTipo1 = new ImageIcon("src/main/java/imagenPanel/Tipo1.png");
    private final ImageIcon ImgTipo2 = new ImageIcon("src/main/java/imagenPanel/Tipo2.png");
    private final ImageIcon ImgTipo3 = new ImageIcon("src/main/java/imagenPanel/Tipo3.png");
    private final ImageIcon ImgAgregar = new ImageIcon("src/main/java/imagenPanel/Agregar.png");
    private final ImageIcon ImgLimpiar = new ImageIcon("src/main/java/imagenPanel/Limpiar.png");
    private final ImageIcon ImgVolver = new ImageIcon("src/main/java/imagenPanel/Volver_2.png");
    private final ImageIcon ImgTipo = new ImageIcon("src/main/java/imagenPanel/Tipo.png");
    private final ImageIcon ImgEnunciado = new ImageIcon("src/main/java/imagenPanel/Enunciado.png");
    private final ImageIcon ImgRespuesta = new ImageIcon("src/main/java/imagenPanel/Respuesta.png");
    private JLabel tipo, lblEnunciado, lblRespuesta;
    private JTextField txtEnunciado, txtRespuesta;
    
    public PanelCrearActividad() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){        
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        
        this.tipo = new JLabel();
        this.tipo.setBounds(325,20,150,30);
        this.tipo.setIcon(ImgTipo);
        add(this.tipo);
        
        this.tipo1=new JButton();
        this.tipo1.setBounds(235,65,100,30);
        this.tipo1.addActionListener(this);
        this.tipo1.setBorderPainted(false);
        this.tipo1.setIcon(ImgTipo1);  
        add(this.tipo1);
        
        this.tipo2=new JButton();
        this.tipo2.setBounds(345,65,100,30);
        this.tipo2.addActionListener(this);
        this.tipo2.setBorderPainted(false);
        this.tipo2.setIcon(ImgTipo2);
        add(this.tipo2);
        
        this.tipo3=new JButton();
        this.tipo3.setBounds(455,65,100,30);
        this.tipo3.addActionListener(this);
        this.tipo3.setBorderPainted(false);
        this.tipo3.setIcon(ImgTipo3);
        add(this.tipo3);
        
        this.lblEnunciado = new JLabel();
        this.lblEnunciado.setBounds(250,160,70,20);
        this.lblEnunciado.setIcon(ImgEnunciado);
        add(this.lblEnunciado);
        this.txtEnunciado = new JTextField("por ejemplo: SILLON");
        this.txtEnunciado.setBounds(330,160,200,20);
        add(this.txtEnunciado);
        
        this.lblRespuesta = new JLabel();
        this.lblRespuesta.setBounds(250,190,70,20);
        this.lblRespuesta.setIcon(ImgRespuesta);
        add(this.lblRespuesta);
        this.txtRespuesta = new JTextField("por ejemplo: 2");
        this.txtRespuesta.setBounds(330,190,200,20);
        add(this.txtRespuesta);
        
        this.btnAgregar=new JButton();
        this.btnAgregar.setBounds(290,250,100,30);
        this.btnAgregar.addActionListener(this);
        this.btnAgregar.setBorderPainted(false);
        this.btnAgregar.setIcon(ImgAgregar);
        add(this.btnAgregar);
        
        this.btnLimpiar=new JButton();
        this.btnLimpiar.setBounds(395,250,100,30);
        this.btnLimpiar.addActionListener(this);
        this.btnLimpiar.setBorderPainted(false);
        this.btnLimpiar.setIcon(ImgLimpiar);
        add(this.btnLimpiar);
        
        this.btnVolver=new JButton();
        this.btnVolver.setBounds(345,400,100,30);
        this.btnVolver.addActionListener(this);
        this.btnVolver.setBorderPainted(false);
        this.btnVolver.setIcon(ImgVolver);
        add(this.btnVolver);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        VentanaCrearActividad vca = (VentanaCrearActividad) SwingUtilities.getWindowAncestor(this);
        if(this.tipo1 == ae.getSource()){
            JOptionPane.showMessageDialog(null, "Eligio tipo 1");
        }else if(this.tipo2 == ae.getSource()){
            JOptionPane.showMessageDialog(null, "Eligio tipo 2");
        }else if(this.tipo3 == ae.getSource()){
            JOptionPane.showMessageDialog(null, "Eligio tipo 3");
        }else if(this.btnAgregar == ae.getSource()){
            JOptionPane.showMessageDialog(null, "Actividad agregada");
        }else if(this.btnLimpiar == ae.getSource()){
            this.txtEnunciado.setText("");
            this.txtRespuesta.setText("");
        }else if(this.btnVolver == ae.getSource()){
            VentanaProfesor vp = new VentanaProfesor();
            vp.setVisible(true);
            vca.setVisible(false);
        }
    }
}
