package Entidades.Campeones.Aliados.AliadosMelee.Lilith;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.VisitanteBooleano;

public class Lilith extends Aliado{

	protected LilithGrafico lilithGrafico;
	
	public Lilith(MapaLogico m){
		super(m);
		
		this.ancho = 75;
		this.alto = 75;
		this.vida = 100;
		this.fuerza = 15;	
		this.monedas = 100;
		

		LilithGrafico lilithGrafico= new LilithGrafico(this, ancho, alto);
		entidadGrafica = lilithGrafico;
	}

	@Override
	public void golpear() { // GOlpea melee
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		
		int n = 0;
		DisparoAliado d = new DisparoAliado(x, y, n, mapaLogico);
		mapaLogico.insertar(d);
		
		lilithGrafico.golpear();
	
	}

	
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	public void accionar() {
		//Tick de lazaro;
	}
		
	// Para el manejo de colisiones;
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);			
	}

	
	// Recibe un golpe de un enemigo;
	public void recibirGolpe(int d) {
		vida = vida - d;
		lilithGrafico.recibirGolpe();
	}
	


}
