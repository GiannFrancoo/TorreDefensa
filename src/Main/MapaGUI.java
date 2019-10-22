package Main;

import java.awt.*;
import javax.swing.*;
import Main.Tienda.Tienda;
import Main.Tienda.TiendaGrafica;

public class MapaGUI extends JFrame {

	private JLayeredPane panel;
	private ClickeablePanel contentPane;
	private TiendaGrafica tiendaGrafica;

	/**
	 * Create the frame.
	 */
	public MapaGUI(MapaLogico mapaLogico, Tienda tienda, Jugador jugador) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1130, 710);
		this.setResizable(false);
		contentPane = new ClickeablePanel(mapaLogico, tienda);
		contentPane.setSize(this.getSize());
		contentPane.setOpaque(false);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		panel = new JLayeredPane();
		panel.setSize(contentPane.getSize());
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setSize(panel.getSize());
		lblFondo.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/fondo_nivel1.png")).getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(lblFondo, 1, 0); 
		
		
		JLabel lblIsaac = new JLabel();
		lblIsaac.setBounds(45, 220, 150, 150);
		lblIsaac.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/utilidades/isaac.gif")).getImage().getScaledInstance(lblIsaac.getWidth(), lblIsaac.getHeight(), Image.SCALE_DEFAULT)));
		panel.add(lblIsaac, 10, 2); 
		
		
		tiendaGrafica = tienda.getGrafica();
		tiendaGrafica.setLocation(0, 548);
		panel.add(tiendaGrafica, 10, 2);
//		tiendaGrafica.setBounds(0, 548, 1130, 162);
	
		
		
	}
		
	
	public void insertar(JLabel lbl) {
		panel.add(lbl, 10, 2);
		this.repaint();
	}
	
	public void remover(JLabel lbl) {
		panel.remove(lbl);
		this.repaint();
	}
	
}
