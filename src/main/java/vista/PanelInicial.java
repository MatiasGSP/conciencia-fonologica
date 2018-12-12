package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelInicial extends JPanel{
    public JButton btnEntrar, btnSalir, btnJugar;
    private JLabel lblUsuario, lblClave;
    public JTextField tfUsuario;
    public JPasswordField pfClave;
    private final ImageIcon imgEntrar = new ImageIcon("src/main/java/imagenPanel/Entrar.png");
    private final ImageIcon imgSalir = new ImageIcon("src/main/java/imagenPanel/Salir.png");
    private final ImageIcon imgJugar = new ImageIcon("src/main/java/imagenPanel/Jugar.png");
    private final ImageIcon imgUsuario= new ImageIcon("src/main/java/imagenPanel/Usuario.png");
    private final ImageIcon imgClave = new ImageIcon("src/main/java/imagenPanel/Clave.png");

    public PanelInicial() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){ 
        this.setLayout(null);
        this.setBackground(Color.WHITE);            
        
        this.lblUsuario= new JLabel();
        this.lblUsuario.setBounds(560,300,50,20);
        this.lblUsuario.setIcon(imgUsuario);
        add(this.lblUsuario);
        this.tfUsuario = new JTextField();
        this.tfUsuario.setBounds(610,300,150,20);
        add(this.tfUsuario);
        
        this.lblClave= new JLabel();
        this.lblClave.setBounds(560,350,50,20);
        this.lblClave.setIcon(imgClave);
        add(this.lblClave);
        this.pfClave = new JPasswordField();
        this.pfClave.setBounds(610,350,150,20);
        add(this.pfClave);
        
        this.btnEntrar = new JButton();   
        this.btnEntrar.setBounds(570, 400, 80, 20);
        this.btnEntrar.setBorderPainted(false);
        this.btnEntrar.setIcon(imgEntrar);       
        this.add(this.btnEntrar);       
        
        this.btnSalir = new JButton();
        this.btnSalir.setBounds(670, 400, 80, 20);
        this.btnSalir.setBorderPainted(false);
        this.btnSalir.setIcon(imgSalir);       
        this.add(this.btnSalir);
        
        this.btnJugar = new JButton();
        this.btnJugar.setBounds(560, 20, 200, 200);
        this.btnJugar.setBorderPainted(false);
        this.btnJugar.setIcon(imgJugar);       
        this.add(this.btnJugar);   
    }

     
}