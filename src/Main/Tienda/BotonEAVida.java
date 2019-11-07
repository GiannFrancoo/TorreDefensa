package Main.Tienda;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import Entidades.Entidad;
import Entidades.EventosAleatorios.EAVida.EventoAleatorioVida;
import Main.MapaLogico;

public class BotonEAVida extends BotonTienda{

	protected BotonEAVida(MapaLogico m, Tienda t) {
		super(m, t);
		
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		this.setBounds(580, 10, 90, 90);	
		
		this.setImagenTienda();
	}

	
	public Entidad crear() {
		return new EventoAleatorioVida(mapaLogico);
	}

	
	public void setImagenTienda() {
		this.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/aliados/Mascara/mascara.png")).getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));

	}

	public int getPrecio() {
		return crear().getMonedas();
	}

}
