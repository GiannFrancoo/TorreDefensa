package Main.Tienda;

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

import Entidades.Campeones.Aliados.Lazaro.Lazaro;
import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Main.MapaLogico;

public class TiendaGrafica extends JPanel {
	
	private MapaLogico mapaLogico;
	private Tienda tienda;
	private JLabel lblCantMonedas;
	private BotonTienda []botones;
	

	public TiendaGrafica(MapaLogico mapaLogico, Tienda tienda) {
		this.mapaLogico = mapaLogico;
		this.tienda = tienda;
		botones = new BotonTienda[4];
		
		this.setBounds(new Rectangle(1130, 162));
		this.setBackground(Color.MAGENTA);
		this.setOpaque(false);
		this.setLayout(null);
		
		JLabel lblMonedas = new JLabel();
		lblMonedas.setBounds(1000, 10, 52, 29);
		lblMonedas.setOpaque(false);
		lblMonedas.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/utilidades/monedas.gif")).getImage().getScaledInstance(lblMonedas.getWidth(), lblMonedas.getHeight(), Image.SCALE_DEFAULT)));
		
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
		
		botones[0] = new BotonLazaro(mapaLogico, tienda);
		botones[1] = new BotonLilith(mapaLogico, tienda);
		botones[2] = new BotonApollyon(mapaLogico, tienda);
		botones[3] = new BotonBomba(mapaLogico, tienda);
		
		//Agrego los botones
		for(int i = 0; i < botones.length; ++i) {
			this.add(botones[i]);
		}
		
	}
	
}
	
	
	/*	 CODIGO DE FAUSTO;
	
	
	
	//		JLabel fondoTienda = new JLabel();
	//		fondoTienda.setOpaque(true);
	//		fondoTienda.setBackground(Color.CYAN);
	//		fondoTienda.setBounds(7, 588, 1266, 100);
	//		contentPane.add(fondoTienda, 5, 1);
			
			
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
		
	*/
