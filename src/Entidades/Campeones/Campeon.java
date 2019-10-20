package Entidades.Campeones;

import java.util.LinkedList;
import java.util.List;

import Entidades.Entidad;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public abstract class Campeon extends Entidad{

	protected int vidaActual;
	protected int vidaMaxima;
	protected int dps;
	protected int dpsTiming = dps;
	protected int fuerza;
	protected int rango;
	protected List<Magia> magias;
	protected CampeonGrafica campeonGrafico; // VER
	protected static int monedas;
	
	public Campeon(MapaLogico m) {
		super(m); // Entidad;
		magias = new LinkedList<Magia>();
	}

	public int getMonedas() {
		if (vidaActual == vidaMaxima) {
			return monedas;
		} else {
			return monedas/2;
		}
	}
	
	public int getRango() {
		return this.rango;
	}
	
	public int getFueza() {
		return this.fuerza;
	}
		
	public void intentarGolpear() {
		if (dpsTiming == 0) {
			this.golpear(); // Depende si es Melee o Rango
			dpsTiming = dps;
		}
		else {
			--dpsTiming;
		}
	}
	
	public void recibirGolpe(int d) {
		vidaActual = vidaActual - d;
		if(vidaActual <= 0) {
			this.estaVivo = false;
			mapaLogico.eliminar(this.getPosEnLista());
		}
	}
	
	public abstract void golpear();
	public abstract void agregarMagia(Magia m);
	
}
