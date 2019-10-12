package Entidades.Campeones.Aliados;

import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.VisitanteBooleano;
import Main.VisitanteDisparo;

public class Lilith extends Aliado{

	protected LilithGrafico lilithGrafico;
	
	public Lilith(MapaLogico m){
		super(m);
		
		this.ancho = 75;
		this.alto = 75;
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;		
		this.monedas = 100;
		

		LilithGrafico lilithGrafico= new LilithGrafico(this, ancho, alto);
		entidadGrafica = lilithGrafico;
	}

	@Override
	public DisparoAliado disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		
		int n = 0;
		DisparoAliado d = new DisparoAliado(x, y, n, mapaLogico);
		
		
		lilithGrafico.disparar();
	
		return d;
	}

	
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	public void restarVida(DisparoEnemigo e) {
		//Parte logica de restar vida;
		lilithGrafico.restarVida();
	}
	
	public void restarVida(DisparoAliado a) {
		
	}

	public void accionar() {
		//Tick de lazaro;
	}
		
	// Para el manejo de colisiones;
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
				
	}

	
	// Para el manejo de disparos;
	public boolean visitadoDisparo(VisitanteDisparo d) {
		return d.visita(this);
	}


}
