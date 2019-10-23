package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteAplicarMagia implements Visitante{
	protected Magia m;
	
	public VisitanteAplicarMagia(Magia magia) {
		this.m = magia;
	}
	
	public void visita(Enemigo e) {
		//Aca no deberia hacer nada ya que solo se puede aplicar la magia a aliados.
	}

	
	public void visita(Aliado a) {
		a.agregarMagia(this.m);
	}

	
	public void visita(Consumible c) {
		
		
	}

	
	public void visita(Disparo d) {
		
		
	}

	
	public void visita(Magia m) {
	
	}

}
