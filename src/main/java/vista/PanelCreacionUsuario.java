package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelCreacionUsuario extends JPanel implements ActionListener{
    private JLabel lblUsuario, lblClave;
    private JTextField usuario, clave;
    private JButton crear, volver;
    private ImageIcon imgCrear = new ImageIcon("src/main/java/imagenPanel/Crear.png");
    private ImageIcon imgVolver = new ImageIcon("src/main/java/imagenPanel/Volver_1.png");
    private ImageIcon imgNombre= new ImageIcon("src/main/java/imagenPanel/Nombre.png");
    private ImageIcon imgClave = new ImageIcon("src/main/java/imagenPanel/Clave.png");

    public PanelCreacionUsuario() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){        
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        
        this.lblUsuario= new JLabel();
        this.lblUsuario.setBounds(270,100,100,20);
        this.lblUsuario.setIcon(imgNombre);
        add(this.lblUsuario);
        this.usuario = new JTextField();
        this.usuario.setBounds(380,100,150,20);
        add(this.usuario);        
        
        this.lblClave= new JLabel();
        this.lblClave.setBounds(270,150,50,20);
        this.lblClave.setIcon(imgClave);
        add(this.lblClave);
        this.clave = new JTextField();
        this.clave.setBounds(380,150,150,20);
        add(this.clave);
        
        this.crear = new JButton();
        this.crear.addActionListener(this);
        this.crear.setBounds(275, 200, 250, 30);
        this.crear.setBorderPainted(false);
        this.crear.setIcon(imgCrear);  
        this.add(this.crear);
        
        this.volver = new JButton();
        this.volver.addActionListener(this);
        this.volver.setBounds(275, 400, 250, 30);
        this.volver.setBorderPainted(false);
        this.volver.setIcon(imgVolver);  
        this.add(this.volver);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        VentanaCreacionUsuario vcu = (VentanaCreacionUsuario) SwingUtilities.getWindowAncestor(this);
        if(this.crear == ae.getSource()){
            JOptionPane.showMessageDialog(null, "Cuenta creada");
            this.usuario.setText("");
            this.clave.setText("");
        }else if(this.volver == ae.getSource()){
            VentanaProfesor vp = new VentanaProfesor();
            vp.setVisible(true);
            vcu.setVisible(false);
        }
    }
}
