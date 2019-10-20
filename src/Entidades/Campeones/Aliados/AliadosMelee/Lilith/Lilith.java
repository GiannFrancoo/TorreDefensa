package Entidades.Campeones.Aliados.AliadosMelee.Lilith;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public class Lilith extends Aliado{

	protected LilithGrafico lilithGrafico;
	
	public Lilith(MapaLogico mapaLogico){
		super(mapaLogico);
		
		this.ancho = 75;
		this.alto = 75;
		this.vidaActual = 100;
		this.fuerza = 15;	
		this.monedas = 100;
		

		LilithGrafico lilithGrafico= new LilithGrafico(mapaLogico, this, ancho, alto);
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
	
	// Recibe un golpe de un enemigo;
	public void recibirGolpe(int d) {
		vidaActual = vidaActual - d;
		lilithGrafico.recibirGolpe();
	}
	


}
