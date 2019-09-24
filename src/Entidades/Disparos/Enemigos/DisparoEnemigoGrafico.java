package Entidades.Disparos.Enemigos;

import Entidades.Entidad;
import Entidades.EntidadGrafica;

public class DisparoEnemigoGrafico extends EntidadGrafica{

	protected DisparoEnemigo disparoEnemigo;
	
	public DisparoEnemigoGrafico(DisparoEnemigo e, int x, int y) {
		super(e, x, y);
		disparoEnemigo = e;
	
		//Carga las imagenes;
	}
	
	public void mover() {
		//Cambia la imagen;
		//Mueve para la derecha;
	}
	
	

}
