package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

public class VisitarVenta extends VisitanteTienda{
	//Clase concreta en donde se modela la venta de un personaje
	//es necesario esta clase(y la interface visitanteAliado (visitor))  para saber si lo que clikeo el usuario
	//es un aliado ya que esté es vendible, los enemigos no y los objetos nose jaja.
	
	
	public void visitaVender(Aliado a) {
		//Este es vendible.
		this.jugador.agregarMonedas(a.getMonedas()); //Sumo el precio del campeon actual a las monedas del jugador.
		this.m.eliminarPosta(a.getPosEnLista()); //Lo elimino de la fas de la tierra.
		
	}

	
	public void visitaVender(Enemigo e) {
		//No es vendible entonces no haga nada.
		
	}

	
	public void visitaVender(Objeto o) {
		//ver q hacer con los objetos si son vendibles o no.
		
	}

}
