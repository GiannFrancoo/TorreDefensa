package Entidades.EventosAleatorios.EATiempo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.EntidadGrafica;
import Entidades.Campeones.Aliados.Aliado;
import Main.MapaLogico;

public class EATiempoGrafico extends EntidadGrafica{

	protected EventoAleatorioTiempo EAT;
	
	public EATiempoGrafico(MapaLogico mapaLogico, EventoAleatorioTiempo e, int alto, int ancho) {
		super(mapaLogico);
		
		EAT = e;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_estatico.png")); // Estatico;
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 999999999);
		
	}

	
	public void golpearMelee() {
		
		
	}

	
	public void golpearRango() {
		
		
	}

	
	public void eliminar() {
		
		
	}

	
	public void recibirGolpe() {
		
		
	}


}
