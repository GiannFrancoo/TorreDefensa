package Entidades.Campeones;


import Entidades.Entidad;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public abstract class Campeon extends Entidad{

	protected int dps;
	protected int dpsTiming = dps;
	protected int fuerza;
	protected int rango;
	protected boolean tieneMagia;
		
	protected Visitante visitanteAlcance;

	
	public Campeon(MapaLogico m) {
		super(m); // Entidad;
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
	
	public boolean tieneMagia() {
		return this.tieneMagia;
	}
	
	public void setTieneMagia(boolean b) {
		this.tieneMagia = b;
	}
	
	
	public void agregarMagia(Magia m) {
		if (!tieneMagia) {
			m.comenzarMagia(this);
			this.tieneMagia = true;
		}
	}
	
	public abstract void golpearRango();
	public abstract void golpearMelee();
	
}
