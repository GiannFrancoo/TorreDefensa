package Main;

import java.util.Random;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Entidades.Objetos.Magias.Escudos.MagiaEscudo;
import Utilidad.Lista.EmptyListException;
import Utilidad.Lista.InvalidPositionException;
import Utilidad.Lista.PositionList;

public class CargadorNivel extends Thread {
	
	protected MapaLogico mapaLogico;
	protected PositionList<Enemigo> nivel;
	
	public CargadorNivel(MapaLogico mapaLogico, PositionList<Enemigo> nivel) {
		this.mapaLogico = mapaLogico;
		this.nivel = nivel;		
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		
		Enemigo aInsertar = null;
			
		while(!nivel.isEmpty()) {
			
			try {
				
				aInsertar = nivel.remove(nivel.first());
			
				if(aInsertar == null){ // Si termino la oleada
					Thread.sleep(20000); // 30000
				}
				else {
					mapaLogico.insertar(aInsertar);
					setearleCoordenadas(aInsertar);
					aplicarEscudoRandom(aInsertar);
					Thread.sleep(3000); // Entre enemigo y enemigo; 1000
				}
				
				
			}
			catch (EmptyListException | InterruptedException | InvalidPositionException e) {
				e.printStackTrace();
			}	
			
		}

		this.stop();

	}
	
	private void setearleCoordenadas(Enemigo aInsertar) {
		int y = 0;
		Random r  = new Random();			
		y = r.nextInt(6);

		aInsertar.setX(((9 * 841) / 10 ) + 233);
		aInsertar.setY(((y * 487) / 6) + 42);

	}
	
	private void aplicarEscudoRandom(Enemigo e) {
		Random rnd = new Random();
		if (rnd.nextInt(6) == 0) {
			MagiaEscudo magia = new MagiaEscudo(mapaLogico);
			mapaLogico.insertar(magia);
			e.agregarMagia(magia);
		}
	}
	
	
}

