package Entidades.Campeones.Aliados;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.Visitante;
import Utilidad.Lista.Position;

public class Lazaro extends Aliado{
	//pos	  --> Entidad
	//vida 	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	protected LazaroGrafico lazaroGrafico;
	protected final int monedas = 100;
	protected Position<Entidad> posEnLista;
	
	public Lazaro(int x, int y){
		super(x,y); // Campeon;
		
		lazaroGrafico = new LazaroGrafico(this, posicion.getKey(), posicion.getValue());
				
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;		

	}

	@Override
	public DisparoAliado disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		
		int n = 0;
		DisparoAliado d = new DisparoAliado(posicion.getKey(), posicion.getValue(),n);
		
		
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
	
	public LazaroGrafico getGrafica() {
		return lazaroGrafico;
	}

	
	public void recibir(Disparo d) {
		d.disparoAliado(this);		
	}

	
	public void restarVida(int d) {
		this.vida-= d;
		//Si llega la vida a 0 hay q ver como modelar para que desaparezca.
		
	}
	
	public void visitado(Visitante v) {
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
