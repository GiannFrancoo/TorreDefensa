package Entidades.Campeones.Enemigos.Arrastre;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Disparos.Enemigos.DisparoEnemigoGrafico;
import Main.MapaLogico;
import Main.Textura;
import Main.Animaciones.LagrimaNormal;

public class DisparoArrastreGrafico extends DisparoEnemigoGrafico{
	
	public DisparoArrastreGrafico(MapaLogico mapaLogico, DisparoArrastre e, int ancho, int alto) {
		super(mapaLogico, e);
	
		entidad = e;
		
		//this.imagenes[0] = new ImageIcon(Textura.class.getClassLoader().getResource("texturas/disparos/lagrima.png"));
		
		//grafica.setBounds(new Rectangle(ancho, alto));
		//grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		//grafica.setLocation(99999999, 9999999);
	}

	
	public void eliminar() {
		//LagrimaNormal l = new LagrimaNormal(mapaLogico, entidad.getX(), entidad.getY());
		//l.start();
	}

	
	public void recibirGolpe() {
		
	}

}
