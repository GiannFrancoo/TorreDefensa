package Main.Tienda;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import Entidades.Entidad;
import Main.MapaLogico;
import Main.Estados.Comprando;
import Main.Estados.EstadoJuego;

public abstract class BotonTienda extends JButton{
	
	protected MapaLogico mapaLogico;
	protected Tienda tienda;
	protected EstadoJuego estadoJuego;
	
	protected BotonTienda(MapaLogico m, Tienda t){
		mapaLogico = m;
		tienda = t;
		this.addActionListener(new miListener());
	}

	public abstract Entidad crear();
	public abstract void setImagenTienda();
	
	
	public class miListener implements ActionListener  {
		public void actionPerformed(ActionEvent e) {
	    	mapaLogico.setEstado(new Comprando());	
	    	Entidad l = crear();
	    	tienda.setComprado(l);
	    	
		}
	}
	
}
