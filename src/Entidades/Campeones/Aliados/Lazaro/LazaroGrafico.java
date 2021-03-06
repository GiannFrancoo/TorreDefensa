package Entidades.Campeones.Aliados.Lazaro;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;
import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class LazaroGrafico extends CampeonGrafica{
	
	protected Lazaro lazaro;

	public LazaroGrafico(MapaLogico mapaLogico, Lazaro l, int ancho, int alto) {
		super(mapaLogico);
		lazaro = l;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_estatico.png")); // Estatico;
//		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_disparando.png")); // Disparando;
//		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_sufriendo.png")); // Sufriendo;
		
		//this.imagenes[9] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png")); // Tienda;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;
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

