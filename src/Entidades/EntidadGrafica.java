package Entidades;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Main.MapaLogico;

public abstract class EntidadGrafica {
	
	//Atributos grafica;
	protected JLabel grafica; // Estado actual de la imagen
	protected ImageIcon imagenes[]; // Conjunto de imagenes;
	protected MapaLogico mapaLogico;
	protected Entidad entidad;
	protected JLabel magia;

	
	public EntidadGrafica(MapaLogico mapaLogico) {
		grafica = new JLabel();
		imagenes = new ImageIcon[10];
		this.mapaLogico = mapaLogico;
	}
	
	public JLabel getLabel(){
		return grafica;
	}
	
	public void moverMagia(int x, int y) {
		if (magia != null) {
			magia.setLocation(x-37, y-30);
		}
	}
	
	public void agregarMagiaVisual(ImageIcon efectoVisual) {
		magia = new JLabel();
		magia.setBounds(new Rectangle(130, 130));
		magia.setIcon(new ImageIcon(efectoVisual.getImage().getScaledInstance(magia.getWidth(), magia.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		magia.setLocation(entidad.getX(), entidad.getY());
		mapaLogico.getMapaGUI().insertar(magia);
	}
	
	public void eliminarMagiaVisual() {
		if (magia != null) {
			mapaLogico.getMapaGUI().remover(magia);
			magia = null;
		}
	}
	
	public abstract void golpearMelee();
	public abstract void golpearRango();
	public abstract void eliminar();
	public abstract void recibirGolpe();
	
	/*
		xGrafica = ((pos.getKey() + 233) * 10) / 841;
		yGrafica = ((pos.getValue() + 42) * 6) / 487;
	
		public void cambiarGrafica(int i) {
			grafica.setIcon(imagenes[i]);
		}
	*/

}
