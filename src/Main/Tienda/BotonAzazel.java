package Main.Tienda;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Aliados.Azazel.Azazel;
import Main.MapaLogico;

public class BotonAzazel extends BotonTienda {

	protected BotonAzazel(MapaLogico m, Tienda t) {
		super(m, t);
		
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		this.setBounds(487, 10, 90, 90);
		
		
		this.setImagenTienda();	
	}

	public Entidad crear() {
		return new Azazel(mapaLogico);
	}

	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Azazel/azazelTienda.gif")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT)));
	}
	
	public int getPrecio() {
		return crear().getMonedas();
	}

}

