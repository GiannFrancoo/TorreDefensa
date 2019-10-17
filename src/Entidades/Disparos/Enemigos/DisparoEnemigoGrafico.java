package Entidades.Disparos.Enemigos;

import Entidades.Entidad;
import Entidades.EntidadGrafica;
import Main.MapaLogico;

public class DisparoEnemigoGrafico extends EntidadGrafica{

	protected DisparoEnemigo disparoEnemigo;
	
	public DisparoEnemigoGrafico(MapaLogico mapaLogico, DisparoEnemigo e) {
		super(mapaLogico);
		disparoEnemigo = e;
	
		//Carga las imagenes;
	}
	
	public void mover() {
		//Cambia la imagen;
		//Mueve para la derecha;
	}
	
	

}
