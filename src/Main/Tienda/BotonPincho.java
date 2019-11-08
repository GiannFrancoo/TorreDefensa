package Main.Tienda;

import java.awt.Image;
import javax.swing.ImageIcon;
import Entidades.Entidad;
import Entidades.Objetos.Consumibles.Pincho.Pincho;
import Main.MapaLogico;

public class BotonPincho extends BotonTienda {
	
	protected BotonPincho(MapaLogico m, Tienda t) {
		super(m, t);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(null);
		this.setBounds(806, 10, 90, 90);
		
		this.setImagenTienda();
	}

	public Entidad crear() {
		return new Pincho(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/objetos/pincho/pincho.gif")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT)));
	}

	public int getPrecio() {
		return crear().getMonedas();
	}
}
