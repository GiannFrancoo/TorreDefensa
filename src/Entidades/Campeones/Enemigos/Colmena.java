package Entidades.Campeones.Enemigos;

import javax.swing.JLabel;
import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.VisitanteDisparo;
import Utilidad.Lista.Position;

public class Colmena extends Enemigo {
	
	protected ColmenaGrafico colmenaGrafico;
	protected Position<Entidad> posEnLista;
	
	public Colmena(MapaLogico m) {
		super(m);
		
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.vida = 100;
		this.fuerza = 100;
		this.rango = 3;
		this.monedas = 30;
		
		colmenaGrafico = new ColmenaGrafico(this, ancho, alto);
		entidadGrafica = colmenaGrafico;
	}

	@Override
	public DisparoEnemigo disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		int n = 0;
		
		DisparoEnemigo d = new DisparoEnemigo(x, y, n, mapaLogico);
		
		
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
		
		if (mapaLogico.colisione(x-velocidad, y) ){
			//Colisiono!
			//colmena.disparar();
		}
		else {
			//if si esta a rango, disparar;
			x = x - velocidad; //Se mueve;
			colmenaGrafico.mover(); //Cambio el label;
		}
	}

	public void restarVida(int d) {
		this.vida-= d;
		//Chequear cuando la vida llega a 0.
		
	}

	public void recibir(Disparo d) {
		d.disparoEnemigo(this);
	}

	
	public void visitado(VisitanteDisparo v) {
		v.visita(this);
	}

	
	public int getMonedas() {
		return this.monedas;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}

	
	public Position<Entidad> getPosEnLista() {
		return this.posEnLista;
	}

	
	public void setPosEnLista(Position<Entidad> pos) {
		this.posEnLista = pos;
	}

}
