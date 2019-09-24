package Entidades.Campeones.Enemigos;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.Visitante;
import Utilidad.Lista.Position;

public class Colmena extends Enemigo {

	
	//fila    --> Entidad;
	//columna --> Entidad;
	//vida	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;

	//velocidad --> Enemigo;
	//cantMonedas --> Enemigo;
	protected final int monedas = 10;
	protected ColmenaGrafico colmenaGrafico;
	protected Position<Entidad> posEnLista;
	
	public Colmena(int x, int y) {
		super(x,y);
		this.velocidad = 4;
		this.vida = 100;
		this.fuerza = 100;
		this.rango = 3;
		this.cantMonedas = 30; // Random puede ser;
		
		colmenaGrafico = new ColmenaGrafico(this);
	}

	@Override
	public DisparoEnemigo disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		int n = 0;
		
		DisparoEnemigo d = new DisparoEnemigo(posicion.getKey(), posicion.getValue(), n);
		
		
		//Grafica
		colmenaGrafico.disparar(); //Disparando
	
		return d;
	}

	@Override
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	public void restarVida(DisparoAliado a) {
		colmenaGrafico.restarVida();
	}
	
	public void restarVida(DisparoEnemigo e) {}

	public void mover() {
		colmenaGrafico.correr();
	}

	public void restarVida(int d) {
		this.vida-= d;
		//Chequear cuando la vida llega a 0.
		
	}

	public void recibir(Disparo d) {
		d.disparoEnemigo(this);
	}

	
	public void visitado(Visitante v) {
		v.visita(this);
	}

	
	public int getMonedas() {
		return this.monedas;
	}

	
	public Position<Entidad> getPosEnLista() {
		return this.posEnLista;
	}

	
	public void setPosEnLista(Position<Entidad> pos) {
		this.posEnLista = pos;
	}

}
