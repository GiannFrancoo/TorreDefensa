package Main.Tienda;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Lazaro.Lazaro;
import Entidades.Objetos.Consumibles.Bomba;
import Main.MapaLogico;

public class BotonLazaro extends BotonTienda{

	protected BotonLazaro(MapaLogico m, Tienda t) {
		super(m, t);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(null);
		this.setBounds(12, 10, 90, 90);	
		
		this.setImagenTienda();
	}

	public Entidad crear() {
		return new Lazaro(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_tienda.png")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
	}

	public int getPrecio() {
		return crear().getMonedas();
	}
	
}
