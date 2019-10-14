package Main.Tienda;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import Entidades.Entidad;
import Entidades.Objetos.Consumibles.Bomba;
import Main.MapaLogico;
import Main.Tienda.BotonTienda;

public class BotonBomba extends BotonTienda{

	protected BotonBomba(MapaLogico m, Tienda t) {
		super(m, t);			
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		this.setBounds(297, 10, 90, 90);
		
		this.setImagenTienda();			
	}

	public Entidad crear() {
		return new Bomba(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/objetos/bombas.png")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
	}

}
