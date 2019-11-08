package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteAlcanceGolpeA_Aliado implements Visitante {
	
	protected Enemigo enemigo;
	
	public VisitanteAlcanceGolpeA_Aliado(Enemigo e) {
		this.enemigo = e;
	}

	public void visita(Enemigo e) {
	}

	public void visita(Aliado a) {
		if(enemigo.getRango() >= 30)
			enemigo.golpearRango();
		else
			enemigo.golpearMelee();
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

	@Override
	public void visita(EAVida e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visita(EventoAleatorioTiempo e) {
		// TODO Auto-generated method stub
		
	}



}
