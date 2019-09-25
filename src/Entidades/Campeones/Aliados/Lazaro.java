package Entidades.Campeones.Aliados;

import javax.swing.JLabel;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.VisitanteDisparo;
import Utilidad.Lista.Position;

public class Lazaro extends Aliado{
	
	protected Position<Entidad> posEnLista;
	protected LazaroGrafico lazaroGrafico;
	
	private int ancho = 75;
	private int alto = 75;
	
	public Lazaro(MapaLogico m){
		super(m);
						
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;		
		this.monedas = 100;
		

		LazaroGrafico lazaroGrafico= new LazaroGrafico(this, ancho, alto);
		entidadGrafica = lazaroGrafico;
	}

	@Override
	public DisparoAliado disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		
		int n = 0;
		DisparoAliado d = new DisparoAliado(x, y, n, mapaLogico);
		
		
		lazaroGrafico.disparar();
	
		return d;
	}

	
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	public void restarVida(DisparoEnemigo e) {
		//Parte logica de restar vida;
		lazaroGrafico.restarVida();
	}
	
	public void restarVida(DisparoAliado a) {
		
	}

	public void mover() {
		//Tick de lazaro;
	}
	
	public void recibir(Disparo d) {
		d.disparoAliado(this);		
	}

	
	public void restarVida(int d) {
		this.vida-= d;
		//Si llega la vida a 0 hay q ver como modelar para que desaparezca.
		
	}
	
	public void visitado(VisitanteDisparo v) {
		v.visita(this);
	}

	
	public int getMonedas() {
		return this.monedas;
	}

	public void setPosEnLista(Position<Entidad> pos) {
		this.posEnLista = pos;
	}

	public Position<Entidad> getPosEnLista() {
		return this.posEnLista;
	}
	
	

	
	 
	
	
	
	
	
	
	
	

}
