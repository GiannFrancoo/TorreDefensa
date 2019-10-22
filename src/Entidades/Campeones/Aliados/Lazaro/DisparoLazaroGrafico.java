package Entidades.Campeones.Aliados.Lazaro;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Aliados.DisparoAliadoGrafico;
import Main.MapaLogico;
import Main.Animaciones.LagrimaNormal;

public class DisparoLazaroGrafico extends DisparoAliadoGrafico {
	
	
	public DisparoLazaroGrafico(MapaLogico mapaLogico, DisparoLazaro e, int ancho, int alto) {
		super(mapaLogico, e, ancho, alto);
		
		entidad = e;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/disparos/lagrima.png")); // Estatico;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 9999999);
	}


	@Override
	public void eliminar() {
		LagrimaNormal l = new LagrimaNormal(mapaLogico, entidad.getX(), entidad.getY());
		l.start();
	}


	public void recibirGolpe() {
	}
}
