package Entidades.Campeones.Enemigos.Colmena;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;
import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class ColmenaGrafico extends CampeonGrafica {
	
	public ColmenaGrafico(MapaLogico mapaLogico, Colmena c, int ancho, int alto) {
		super(mapaLogico);
		entidad = c;

//		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/colmena/colmena_estatico.png")); // Estatico;
//		this.imagenes[1] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/colmena/colmena_disparando.png")); // Disparando;
		this.imagenes[3] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/colmena/colmena_caminando.gif")); // Corriendo (GIF);
		
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[3].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;		
		grafica.setLocation(99999999, 999999999);

	}
	
	
	public void golpear() {
	}

	public void recibirGolpe() {
	}

	public void golpearMelee() {	
	}

	public void golpearRango() {	
	}

	public void eliminar() {		
	}

	
}
