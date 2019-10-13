package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import Entidades.Campeones.Aliados.Lazaro.Lazaro;
import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Main.Tienda.Tienda;
import Main.Tienda.TiendaGrafica;

public class MapaGUI extends JFrame {

	private MapaLogico mapaLogico;
	private Tienda tienda;
	private Jugador jugador;
	private JLayeredPane panel;
	private ClickeablePanel contentPane;
	private TiendaGrafica tiendaGrafica;

	/**
	 * Create the frame.
	 */
	public MapaGUI(MapaLogico mapaLogico, Tienda tienda, Jugador jugador) {
		
		this.mapaLogico = mapaLogico;
		this.tienda = tienda;
		this.jugador = jugador;
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
		
		
		tiendaGrafica = tienda.getGrafica();
		tiendaGrafica.setLocation(0, 548);
		panel.add(tiendaGrafica, 10, 2);
//		tiendaGrafica.setBounds(0, 548, 1130, 162);
		
//		///////////////////////////////////////////////////////////////////////////////////
//		//BOTON PARA ELIMINAR
//		JButton btnEliminar = new JButton("Eliminar Enemigo");
//		btnEliminar.setBounds(10, 10, 150, 20);
//		btnEliminar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            	mapaLogico.setEstado("vendiendo");
//            }
//        });
//		panel.add(btnEliminar, 10, 2);
//		///////////////////////////////////////////////////////////////////////////////////
//						
	}
		
	
	public void insertar(JLabel lbl) {
		panel.add(lbl, 10, 2);
	}
	
	public void remover(JLabel lbl) {
		panel.remove(lbl);
		this.repaint();
	}
	
}
