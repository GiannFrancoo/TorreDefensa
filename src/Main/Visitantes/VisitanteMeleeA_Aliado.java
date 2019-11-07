package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida.EventoAleatorioVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteMeleeA_Aliado implements Visitante {

	private Enemigo enemigo;
	
	public VisitanteMeleeA_Aliado(Enemigo e) {
		this.enemigo = e;
	}
	
	public void visita(Enemigo e) {
	}

	public void visita(Aliado a) {
		a.recibirGolpe(enemigo.getFueza());
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}
	
	public void visita(EventoAleatorioVida e) { //EventoAleatorioVida tmb es un aliado.
		e.recibirGolpe(enemigo.getFueza());
	}
	
	public void visita(EventoAleatorioTiempo e) {//EventoAleatorioTiempo tmb es un aliado.
		//Aqui no se hace nada.
	}

}
