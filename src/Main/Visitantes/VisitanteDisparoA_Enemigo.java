package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida1.EAVida1;
import Entidades.EventosAleatorios.EAVida2.EAVida2;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteDisparoA_Enemigo implements Visitante {

private Disparo disparo;
	
	public VisitanteDisparoA_Enemigo(Disparo disparo) {
		this.disparo = disparo;
	}
	
	public void visita(Enemigo e) {
		e.recibirGolpe(disparo.getFuerza());
		disparo.getSonido().play();
		disparo.eliminar();
		disparo.getEntidadGrafica().eliminar();
	}

	public void visita(Aliado a) {
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

	@Override
	public void visita(EAVida1 e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visita(EventoAleatorioTiempo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visita(EAVida2 e) {
		// TODO Auto-generated method stub
		
	}

}
