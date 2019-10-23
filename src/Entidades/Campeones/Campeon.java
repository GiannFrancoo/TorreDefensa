package Entidades.Campeones;


import Entidades.Entidad;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Utilidad.Lista.DoubleLinkedList;
import Utilidad.Lista.PositionList;

public abstract class Campeon extends Entidad{

	protected int dps;
	protected int dpsTiming = dps;
	protected int fuerza;
	protected int rango;
	protected PositionList<Magia> magias;
	protected static int monedas;
	
	protected Visitante visitanteAlcance;

	
	public Campeon(MapaLogico m) {
		super(m); // Entidad;
		magias = new DoubleLinkedList<Magia>();
	}

	public int getMonedas() {
		if (this.vidaActual == this.vidaMaxima) {
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
	
	public void recibirGolpe(int d) {
		vidaActual -= d;
		if(vidaActual <= 0) {
			mapaLogico.eliminar(this.getPosEnLista());
		}
		this.entidadGrafica.recibirGolpe();
	}
	
	public abstract void golpearRango();
	public abstract void golpearMelee();
	public abstract void agregarMagia(Magia m);
	
}
