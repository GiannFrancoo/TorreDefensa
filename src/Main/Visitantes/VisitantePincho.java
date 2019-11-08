package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EATiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Consumibles.Pincho.Pincho;
import Entidades.Objetos.Magias.Magia;

public class VisitantePincho implements Visitante{

	protected Pincho pincho;
	
	public VisitantePincho(Pincho p) {
		pincho = p;
	}
	
	public void visita(Enemigo e) {
		e.recibirGolpe(pincho.getFuerza());
	}

	public void visita(Aliado a) {}

	public void visita(Consumible c) {}

	public void visita(Disparo d) {}

	public void visita(Magia m) {}

	public void visita(EAVida e) {}

	public void visita(EATiempo e) {}

}
