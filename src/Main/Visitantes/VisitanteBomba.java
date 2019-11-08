package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EATiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Consumibles.Bomba;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteBomba implements Visitante {
	
	private Bomba bomba;
	
	public VisitanteBomba(Bomba bomba) {
		this.bomba = bomba;
	}

	public void visita(Enemigo e) {
		e.recibirGolpe(bomba.getFuerza());
	}

	public void visita(Aliado a) {
		a.recibirGolpe(bomba.getFuerza());
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
	public void visita(EATiempo e) {
		// TODO Auto-generated method stub
		
	}



}
