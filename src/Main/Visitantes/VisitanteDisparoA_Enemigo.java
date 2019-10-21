package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.ObjetosVida.ObjetoVida;
import Main.Sonido;

public class VisitanteDisparoA_Enemigo implements Visitante {

private Disparo disparo;
	
	public VisitanteDisparoA_Enemigo(Disparo disparo) {
		this.disparo = disparo;
	}
	
	public void visita(Enemigo e) {
		e.recibirGolpe(disparo.getFuerza());
		//Sonido.playSound(disparo.getSonido());
		disparo.getEntidadGrafica().eliminar();
		disparo.eliminar();
	}

	public void visita(Aliado a) {
	}

	public void visita(ObjetoVida o) {
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

}
