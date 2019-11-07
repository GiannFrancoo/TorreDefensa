package Main.Tienda;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Lilith.Lilith;
import Entidades.Objetos.Consumibles.Bomba;
import Main.MapaLogico;

public class BotonLilith extends BotonTienda{

	protected BotonLilith(MapaLogico m, Tienda t) {
		super(m, t); //Aca se le setea el listener;
	
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(null);
		this.setBounds(107, 10, 90, 90);
		
		this.setImagenTienda();
	}
	
	public Entidad crear() {
		return new Lilith(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_tienda.png")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
	}

	public int getPrecio() {
		return crear().getMonedas();
	}

}
