package Entidades.Disparos.Aliados;

import Entidades.EntidadGrafica;
import Main.MapaLogico;

public abstract class DisparoAliadoGrafico extends EntidadGrafica {

	public DisparoAliadoGrafico(MapaLogico mapaLogico, DisparoAliado e, int ancho, int alto) {
		super(mapaLogico);
		
//		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_estatico.png")); // Estatico;
//		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/disparos/lagrima.png")); // Estatico;
//		
//		grafica.setBounds(new Rectangle(ancho, alto));
//		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
//		grafica.setLocation(99999999, 9999999);
	}

	@Override
	public void golpearMelee() {
	}

	@Override
	public void golpearRango() {
	}


	
	
}
