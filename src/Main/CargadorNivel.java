package Main;

import java.util.Random;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Utilidad.Lista.EmptyListException;
import Utilidad.Lista.InvalidPositionException;
import Utilidad.Lista.PositionList;

public class CargadorNivel extends Thread {
	
	protected MapaLogico mapaLogico;
	protected PositionList<Entidad> nivel;
	
	public CargadorNivel(MapaLogico mapaLogico, PositionList<Entidad> nivel) {
		this.mapaLogico = mapaLogico;
		this.nivel = nivel;		
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		
		Entidad aInsertar = null;
		
		while(!nivel.isEmpty()) {
			
			try {
				
				aInsertar = nivel.remove(nivel.first());
			
				if(aInsertar == null){ // Si termino la oleada
					Thread.sleep(5000); // 30000
				}
				else {
					mapaLogico.insertar(aInsertar);
					setearleCoordenadas(aInsertar);
					Thread.sleep(300); // Entre enemigo y enemigo; 1000
				}
				
				
			}
			catch (EmptyListException | InterruptedException | InvalidPositionException e) {
				e.printStackTrace();
			}	
			
		}

		this.stop();

	}
	
	private void setearleCoordenadas(Entidad aInsertar) {
		int y = 0;
		Random r  = new Random();			
		y = r.nextInt(6);

		aInsertar.setX(((9 * 841) / 10 ) + 233);
		aInsertar.setY(((y * 487) / 6) + 42);

	}
	
	
}

