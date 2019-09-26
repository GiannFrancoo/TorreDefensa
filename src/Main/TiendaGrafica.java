package Main;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidades.Campeones.Aliados.Lazaro;
import Entidades.Campeones.Enemigos.Colmena;

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
		lblMonedas.setBounds(1000, 10, 52, 29);
		lblMonedas.setOpaque(false);
		lblMonedas.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/monedas.gif")).getImage().getScaledInstance(lblMonedas.getWidth(), lblMonedas.getHeight(), Image.SCALE_DEFAULT)));
		
//		
//		/* Codigo nuevo */
//		
//		//Creo el image icon NORMAL
//		ImageIcon monedasGif = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/monedas.gif")); 
//		
//		//Le seteo la imagen, la misma pero re escalada con el BOTON; (NO funca con el SCALE_SMOOTH)
//		monedasGif.setImage(monedasGif.getImage().getScaledInstance(lblMonedas.getWidth(), lblMonedas.getHeight(), Image.SCALE_DEFAULT));
//		
//		//Le seteo en el label;
//		lblMonedas.setIcon(monedasGif);
	
		//Lo termino agregando al panel;
		this.add(lblMonedas);
		
		
		
		lblCantMonedas = new JLabel();
		lblCantMonedas.setBounds(1053, 10, 60, 29);
		lblCantMonedas.setOpaque(true);
		this.add(lblCantMonedas);
		
		inicializarTienda();
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
			
			JButton btnObj1 = new JButton();
			btnObj1.setOpaque(true);
			btnObj1.setContentAreaFilled(false);
			btnObj1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
			btnObj1.setBounds(12, 10, 90, 90);
			this.add(btnObj1);
			btnObj1.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_tienda.png")).getImage().getScaledInstance(btnObj1.getWidth(), btnObj1.getHeight(), Image.SCALE_SMOOTH)));
			btnObj1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mapaLogico.setEstado("comprando");
	            	Lazaro l = new Lazaro(mapaLogico);
	            	tienda.setComprado(l);
	            }
	        });
			
			JButton btnObj2 = new JButton();
			btnObj2.setOpaque(true);
			btnObj2.setContentAreaFilled(false);
			btnObj2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));			
			btnObj2.setBounds(107, 10, 90, 90);
			this.add(btnObj2);
			btnObj2.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_tienda.png")).getImage().getScaledInstance(btnObj1.getWidth(), btnObj1.getHeight(), Image.SCALE_SMOOTH)));
			btnObj2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mapaLogico.setEstado("comprando");
	            	Lazaro l = new Lazaro(mapaLogico);
	            	tienda.setComprado(l);
	            }
	        });
			
			
			JButton btnObj3 = new JButton();
			btnObj3.setOpaque(true);
			btnObj3.setContentAreaFilled(false);
			btnObj3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));		
			btnObj3.setBounds(202, 10, 90, 90);
			this.add(btnObj3);
			btnObj3.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_tienda.png")).getImage().getScaledInstance(btnObj1.getWidth(), btnObj1.getHeight(), Image.SCALE_SMOOTH)));
			btnObj3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	mapaLogico.setEstado("comprando");
	            	Lazaro l = new Lazaro(mapaLogico);
	            	tienda.setComprado(l);
	            }
	        });
			
			JButton btnObj4 = new JButton();	
			btnObj4.setOpaque(true);
			btnObj4.setContentAreaFilled(false);
			btnObj4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));		
			btnObj4.setBounds(297, 10, 90, 90);
			this.add(btnObj4);
			
			JButton btnObj5 = new JButton();	
			btnObj5.setOpaque(true);
			btnObj5.setContentAreaFilled(false);
			btnObj5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));		
			btnObj5.setBounds(392, 10, 90, 90);
			this.add(btnObj5);
			
			JButton btnObj6 = new JButton();
			btnObj6.setOpaque(true);
			btnObj6.setContentAreaFilled(false);
			btnObj6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));		
			btnObj6.setBounds(487, 10, 90, 90);
			this.add(btnObj6);
			
			JButton btnObj7 = new JButton();
			btnObj7.setOpaque(true);
			btnObj7.setContentAreaFilled(false);
			btnObj7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));		
			btnObj7.setBounds(582, 10, 90, 90);
			this.add(btnObj7);
		}
		
	}
