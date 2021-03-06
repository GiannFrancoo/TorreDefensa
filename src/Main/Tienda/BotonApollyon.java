package Main.Tienda;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Aliados.Apollyon.Apollyon;
import Main.MapaLogico;

public class BotonApollyon extends BotonTienda {

	protected BotonApollyon(MapaLogico m, Tienda t) {
		super(m, t);
		
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(null);		
		this.setBounds(202, 10, 90, 90);
		
		this.setImagenTienda();	
	}

	public Entidad crear() {
		return new Apollyon(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_tienda.png")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
	}

	public int getPrecio() {
		return crear().getMonedas();
	}

}
