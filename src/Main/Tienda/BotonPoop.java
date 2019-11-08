package Main.Tienda;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Aliados.Poop.Poop;
import Entidades.Objetos.Consumibles.Bomba;
import Main.MapaLogico;

public class BotonPoop extends BotonTienda{

	protected BotonPoop(MapaLogico m, Tienda t) {
		super(m, t);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		//this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		this.setBorder(null);
		this.setBounds(392, 10, 90, 90);
		
		this.setImagenTienda();
	}

	public Entidad crear() {
		return new Poop(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/objetos/poop/poop_tienda.png")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
	}

	public int getPrecio() {
		return crear().getMonedas();
	}
	
}
