package Entidades.Objetos.Magias;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Objeto;
import Main.Cronometro;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public abstract class Magia extends Objeto {
	
	protected Campeon camp;
	private Cronometro crono;
	protected EfectoMagia efecto;

	public Magia(int x, int y, MapaLogico m) {
		super(m);
		crono = new Cronometro(5000);
		crono.start();
	}
	
	//Comprueba si el cronometro terminó o el efecto de la magia ya fue aplicado a un campeón, si es así elimina la entidad.
	public void accionar() {
		if (this.estaVivo) {
			if (!crono.isAlive() || camp != null) {
				this.eliminar();
			}
		}
	}
	

	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}
	
	public abstract void setCampeon(Campeon camp);

}
