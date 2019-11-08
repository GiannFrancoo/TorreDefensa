package Entidades.EventosAleatorios.EAVida;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.EntidadGrafica;
import Main.MapaLogico;

public class EAVidaGrafico extends EntidadGrafica{

	protected EAVida EAVida;
	
	public EAVidaGrafico(MapaLogico mapaLogico, EAVida e, int ancho, int alto) {
		super(mapaLogico);
		
		EAVida = e;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/eventoAleatorio/gusano/gusano1.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/eventoAleatorio/gusano/gusano2.png")); // Estatico;
		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/eventoAleatorio/gusano/gusano3.png")); // Estatico;

		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[2].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 999999999);
	}

	
	public void golpearMelee() { }

	
	public void golpearRango() { }

	
	public void eliminar() { }

	
	public void recibirGolpe() {
		
		float n = entidad.getVidaMaxima() / 3;
		int vida = entidad.getVidaActual();
		
		if(vida <= 2 * n && vida > n) {
			grafica.setIcon(new ImageIcon(imagenes[1].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH)));
		}
		
		if(vida <= n) {
			grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH)));
		}
	}

}
