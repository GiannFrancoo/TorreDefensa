package Main;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidades.Campeones.Aliados.Lazaro;

public class TiendaGrafica extends JPanel {
	
	private MapaLogico mapaLogico;
	private Tienda tienda;
	private JLabel lblCantMonedas;

	public TiendaGrafica(MapaLogico mapaLogico, Tienda tienda) {
		this.mapaLogico = mapaLogico;
		this.tienda = tienda;
		
		this.setBounds(new Rectangle(1130, 162));
		this.setBackground(Color.MAGENTA);
		this.setOpaque(false);
		this.setLayout(null);
		
		JLabel lblMonedas = new JLabel();
		lblMonedas.setBounds(1000, 10, 51, 29);
		lblMonedas.setOpaque(false);
		lblMonedas.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/Aliados/coin1.png")).getImage().getScaledInstance(lblMonedas.getWidth(), lblMonedas.getHeight(), Image.SCALE_SMOOTH)));
		this.add(lblMonedas);
		
		lblCantMonedas = new JLabel();
		lblCantMonedas.setBounds(1053, 10, 60, 29);
		lblCantMonedas.setOpaque(true);
		this.add(lblCantMonedas);
	}
	
	public void actualizarMonedas(int m) {
		lblCantMonedas.setText("" + m);
	}
	
	public void inicializarTienda() {
			
	//		JLabel fondoTienda = new JLabel();
	//		fondoTienda.setOpaque(true);
	//		fondoTienda.setBackground(Color.CYAN);
	//		fondoTienda.setBounds(7, 588, 1266, 100);
	//		contentPane.add(fondoTienda, 5, 1);
			
			JButton lblObj1 = new JButton();
			lblObj1.setOpaque(true);
			lblObj1.setBackground(Color.ORANGE);
			lblObj1.setBounds(12, 10, 90, 90);
			this.add(lblObj1);
			lblObj1.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/Aliados/Lazaro/lazaro_tienda.png")).getImage().getScaledInstance(lblObj1.getWidth(), lblObj1.getHeight(), Image.SCALE_SMOOTH)));
			lblObj1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mapaLogico.setEstado("comprando");
	            	Lazaro l = new Lazaro();
	            	tienda.setComprado(l);
	            }
	        });
			
			JLabel lblObj2 = new JLabel();
			lblObj2.setOpaque(true);
			lblObj2.setBackground(Color.ORANGE);
			lblObj2.setBounds(107, 10, 90, 90);
			this.add(lblObj2);
			
			JLabel lblObj3 = new JLabel();
			lblObj3.setOpaque(true);
			lblObj3.setBackground(Color.ORANGE);
			lblObj3.setBounds(202, 10, 90, 90);
			this.add(lblObj3);
			
			JLabel lblObj4 = new JLabel();
			lblObj4.setOpaque(true);
			lblObj4.setBackground(Color.ORANGE);
			lblObj4.setBounds(297, 10, 90, 90);
			this.add(lblObj4);
			
			JLabel lblObj5 = new JLabel();
			lblObj5.setOpaque(true);
			lblObj5.setBackground(Color.ORANGE);
			lblObj5.setBounds(392, 10, 90, 90);
			this.add(lblObj5);
			
			JLabel lblObj6 = new JLabel();
			lblObj6.setOpaque(true);
			lblObj6.setBackground(Color.ORANGE);
			lblObj6.setBounds(487, 10, 90, 90);
			this.add(lblObj6);
			
			JLabel lblObj7 = new JLabel();
			lblObj7.setOpaque(true);
			lblObj7.setBackground(Color.ORANGE);
			lblObj7.setBounds(582, 10, 90, 90);
			this.add(lblObj7);
		}
		
	}
