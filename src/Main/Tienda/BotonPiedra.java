package Main.Tienda;

import java.awt.Image;

import javax.swing.ImageIcon;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Piedra.Piedra;
import Main.MapaLogico;

public class BotonPiedra extends BotonTienda{

	protected BotonPiedra(MapaLogico m, Tienda t) {
		super(m, t);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(null);
		this.setBounds(693, 10, 90, 90);	
		
		this.setImagenTienda();
	}

	public Entidad crear() {
		return new Piedra(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/objetos/piedra/piedraTienda.png")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
	}

	public int getPrecio() {
		return crear().getMonedas();
	}

}
