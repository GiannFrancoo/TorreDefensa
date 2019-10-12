package Entidades.Campeones;

import java.util.LinkedList;
import java.util.List;

import Entidades.Entidad;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public abstract class Campeon extends Entidad{

	protected int vida;
	protected int fuerza;
	protected int rango;
	protected int monedas;
	protected List<Magia> magias;
	
	public Campeon(MapaLogico m) {
		super(m); // Entidad;
		magias = new LinkedList<Magia>();
	}

	public int getMonedas() {
		return monedas;
	}

	public void recibirGolpe(int d) {
		vida = vida - d;
	}
	
	public abstract void agregarMagia(Magia m);
	
}
