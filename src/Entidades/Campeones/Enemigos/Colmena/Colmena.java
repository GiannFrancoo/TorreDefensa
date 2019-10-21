package Entidades.Campeones.Enemigos.Colmena;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Utilidad.Lista.Position;

public class Colmena extends Enemigo {
	
	protected ColmenaGrafico colmenaGrafico;
	protected Position<Entidad> posEnLista;
	
	public Colmena(MapaLogico mapaLogico) {
		super(mapaLogico);
		
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.vidaActual = 100;
		this.fuerza = 100;
		monedas = 30;
		
		colmenaGrafico = new ColmenaGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = colmenaGrafico;
	}

	// Agregar magia a la lista;
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}

	public void golpearRango() {
	}


}
