package Entidades.Campeones.Aliados;

import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;

public class Lazaro extends Aliado{
	//pos	  --> Entidad
	//vida 	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	protected LazaroGrafico lazaroGrafico;
	
	
	public Lazaro(int x, int y){
		super(x,y); // Campeon;
		
		lazaroGrafico = new LazaroGrafico(this);
				
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

	
	 
	
	
	
	
	
	
	
	

}
