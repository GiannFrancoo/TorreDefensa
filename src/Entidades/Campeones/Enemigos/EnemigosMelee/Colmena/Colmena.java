package Entidades.Campeones.Enemigos.EnemigosMelee.Colmena;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Campeones.Enemigos.EnemigosMelee.EnemigoMelee;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Utilidad.Lista.Position;

public class Colmena extends EnemigoMelee {
	
	protected ColmenaGrafico colmenaGrafico;
	protected Position<Entidad> posEnLista;
	
	public Colmena(MapaLogico mapaLogico) {
		super(mapaLogico);
		
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.vida = 100;
		this.fuerza = 100;
		this.monedas = 30;
		
		colmenaGrafico = new ColmenaGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = colmenaGrafico;
	}

	@Override
	public void golpear() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		int n = 0;
		
		DisparoEnemigo d = new DisparoEnemigo(x, y, n, mapaLogico);
		
		
		//Grafica
		colmenaGrafico.golpear(); //Disparando
	
	}

	// Agregar magia a la lista;
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}


}
