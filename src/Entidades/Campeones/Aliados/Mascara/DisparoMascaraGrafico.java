package Entidades.Campeones.Aliados.Mascara;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Aliados.DisparoAliadoGrafico;
import Main.MapaLogico;
import Main.Textura;
import Main.Animaciones.LagrimaNormal;

public class DisparoMascaraGrafico extends DisparoAliadoGrafico{

	public DisparoMascaraGrafico(MapaLogico mapaLogico, DisparoAliado e, int ancho, int alto) {
		super(mapaLogico, e);
		
		entidad = e;
		
		this.imagenes[0] = new ImageIcon(Textura.class.getClassLoader().getResource("texturas/disparos/lagrima.png"));
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 9999999);
		
	}

	public void eliminar() {
		LagrimaNormal l = new LagrimaNormal(mapaLogico, entidad.getX(), entidad.getY());
		l.start();
	}

	
	public void recibirGolpe() {
		
	}

}
