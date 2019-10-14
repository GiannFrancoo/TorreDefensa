package Entidades.Campeones;

import java.util.LinkedList;
import java.util.List;

import Entidades.Entidad;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public abstract class Campeon extends Entidad{

	protected int dps;
	protected int dpsTiming = dps;
	protected int vida;
	protected int fuerza;
	protected int monedas;
	protected List<Magia> magias;
	protected CampeonGrafica campeonGrafico; // VER
	
	public Campeon(MapaLogico m) {
		super(m); // Entidad;
		magias = new LinkedList<Magia>();
	}

	public int getMonedas() {
		return monedas;
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
		
	public  void recibirGolpe(int d) {
		vida = vida - d;
		if(vida <= 0) {
			mapaLogico.eliminarPosta(this.getPosEnLista());
		}
	}
	
	public abstract void golpear();
	public abstract void agregarMagia(Magia m);
	
}
