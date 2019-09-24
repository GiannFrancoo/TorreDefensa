package Entidades.Disparos.Aliados;

import Entidades.Entidad;
import Entidades.EntidadGrafica;

public class DisparoAliadoGrafico extends EntidadGrafica {

	protected DisparoAliado disparoAliado;
	
	public DisparoAliadoGrafico(DisparoAliado e, int x, int y) {
		super(e, x, y);
		disparoAliado = e;
		
		//cargar imagenes;
		
	}
	
	public void mover() {
		//Cambia la imagen;
		//Mueve para la izquierda;
	}

	
	
}
