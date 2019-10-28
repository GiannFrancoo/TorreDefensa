package Main.Tienda;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
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
	public abstract int getPrecio();
	
	
	public class miListener implements ActionListener  {
		public void actionPerformed(ActionEvent e) {
			tienda.comprar(crear());
//	    	Entidad l = crear();
//	    	mapaLogico.setEstado(new Comprando(mapaLogico));	
//	    	tienda.setComprado(l);
	    	
		}
	}
	
}
