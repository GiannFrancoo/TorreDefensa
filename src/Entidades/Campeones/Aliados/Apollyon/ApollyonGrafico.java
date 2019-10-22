package Entidades.Campeones.Aliados.Apollyon;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;
import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class ApollyonGrafico extends CampeonGrafica {


	public ApollyonGrafico(MapaLogico mapaLogico, Apollyon a, int ancho, int alto) {
		super(mapaLogico);
		entidad = a;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_estatico.png")); // Estatico;
//		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_sufriendo.png")); // Disparando;
//		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_sufriendo.png")); // Sufriendo;
		
		//this.imagenes[9] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png")); // Tienda;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
		
	}
	
	public void golpearMelee() {
	}

	public void golpearRango() {
	}

	public void golpear() {
	}

	public void recibirGolpe() {
	}

	public void eliminar() {
	}
	
}
