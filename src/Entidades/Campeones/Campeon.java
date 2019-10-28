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
	
	
	protected Magia drop; // Para dropear magia;
	
	protected Visitante visitanteAlcance;

	
	public Campeon(MapaLogico m) {
		super(m); // Entidad;
		magias = new DoubleLinkedList<Magia>();
	}
	
	public int getRango() {
		return this.rango;
	}
	
	public int getFueza() {
		return this.fuerza;
	}
	
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
	public void recibirGolpe(int d) {
		vidaActual -= d;
		if(vidaActual <= 0) {
			mapaLogico.eliminar(this.getPosEnLista()); // Se elimina;
			if(drop != null) {
				//int xNueva = (((this.x * 841) / 10 ) + 233);
				//int yNueva =(((this.y * 487) / 6) + 42 ); 
				mapaLogico.insertar(drop);
				drop.setX(this.x);
				drop.setY(this.y);
				drop.contadorDespawn();
				//mapaLogico.getMapaGUI().insertar(drop.getEntidadGrafica().getLabel()); // Inserto el drop;
			}
		}
		this.entidadGrafica.recibirGolpe();
	}
	
	public void agregarMagia(Magia m) {
		m.comenzarMagia(this);
	}
	
	public Magia getDrop() {
		return drop;
	}
	
	public abstract void golpearRango();
	public abstract void golpearMelee();
	
}
