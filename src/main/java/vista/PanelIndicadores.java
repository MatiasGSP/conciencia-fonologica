package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class PanelIndicadores extends JPanel implements ActionListener{
    private JLabel lblIndicador;
    private JButton btnVolver;
    private final ImageIcon imgVolver = new ImageIcon("src/main/java/imagenPanel/Volver_3.png");   
    private final ImageIcon imgIndicador = new ImageIcon("src/main/java/imagenPanel/Indicadores.png");   
    public JTable tabla;       
    public DefaultTableModel modelo;
    
    public PanelIndicadores() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){        
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        
        this.lblIndicador= new JLabel();
        this.lblIndicador.setBounds(200,20,100,20);
        this.lblIndicador.setIcon(imgIndicador);
        add(this.lblIndicador);
        
        this.btnVolver = new JButton();
        this.btnVolver.addActionListener(this);
        this.btnVolver.setBounds(440, 20, 100, 30);
        this.btnVolver.setBorderPainted(false);
        this.btnVolver.setIcon(imgVolver); 
        this.add(this.btnVolver);   
        
        this.modelo = new DefaultTableModel();
        this.modelo.addColumn("ALUMNO");
        this.modelo.addColumn("TIPO 1 (B / M)");
        this.modelo.addColumn("TIPO 2 (B / M)");
        this.modelo.addColumn("TIPO 3 (B / M)");
        this.tabla = new JTable(modelo);
        this.tabla.getTableHeader().setReorderingAllowed(false);
        JScrollPane scroll = new JScrollPane(this.tabla);
        scroll.setBounds(10, 60, 480, 400);
        scroll.setBackground(Color.WHITE);
        this.add(scroll);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        VentanaIndicadores vi = (VentanaIndicadores) SwingUtilities.getWindowAncestor(this);
        if(this.btnVolver == ae.getSource()){
            VentanaProfesor vp = new VentanaProfesor();
            vp.setVisible(true);
            vi.setVisible(false);   
        }    
    }
}
