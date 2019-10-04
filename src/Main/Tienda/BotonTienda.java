package Main.Tienda;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import Entidades.Entidad;
import Main.MapaLogico;

public abstract class BotonTienda extends JButton{
	
	protected MapaLogico mapaLogico;
	protected Tienda tienda;
	
	protected BotonTienda(MapaLogico m, Tienda t){
		mapaLogico = m;
		tienda = t;
		this.addActionListener(new miListener());
	}

	public abstract Entidad crear();
	public abstract void setImagenTienda();
	
	
	public class miListener implements ActionListener  {
		public void actionPerformed(ActionEvent e) {
	    	mapaLogico.setEstado("comprando");
	    	Entidad l = crear();
	    	tienda.setComprado(l);
		}
	}
	
}
