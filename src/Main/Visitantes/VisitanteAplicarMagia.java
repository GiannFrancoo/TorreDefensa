package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EATiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteAplicarMagia implements Visitante{
	protected Magia m;
	
	public VisitanteAplicarMagia(Magia magia) {
		this.m = magia;
	}
	
	public void visita(Enemigo e) {}

	public void visita(Aliado a) {
		a.agregarMagia(this.m);
	}

	public void visita(Consumible c) {}

	
	public void visita(Disparo d) {}

	
	public void visita(Magia m) {}

	@Override
	public void visita(EAVida e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visita(EATiempo e) {
		// TODO Auto-generated method stub
		
	}


}
