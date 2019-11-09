package Main;

import java.util.Random;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Campeones.Enemigos.Arrastre.Arrastre;
import Entidades.Campeones.Enemigos.Casper.Casper;
import Entidades.Campeones.Enemigos.Cerebro.Cerebro;
import Entidades.Campeones.Enemigos.Cerebro_Demonio.CerebroDemonio;
import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Entidades.Campeones.Enemigos.Isaac_Cerebro.IsaacCerebro;
import Utilidad.Lista.DoubleLinkedList;
import Utilidad.Lista.PositionList;

public class GeneradorDeNiveles {
	
	MapaLogico mapaLogico;
	
	protected int cantEnemigos = 20;
	
	public GeneradorDeNiveles(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
	}
	
	//Genera 3 oleadas, con +2 enemigos en cada una.
	public PositionList<Enemigo> generarNivel() {
		
		PositionList<Enemigo> nivel = new DoubleLinkedList<Enemigo>();
		
		for(int i = 0; i < 3; i++) {
			generarOleada(nivel);
			nivel.addLast(null); // Esta la bandera
			cantEnemigos = cantEnemigos + 2;
		}
		
		return nivel;
			
	}
	
	private void generarOleada(PositionList<Enemigo> nivel) {
		
		Random r = new Random();	
			
		for(int i = 0; i < cantEnemigos; i++) {
				
			switch(r.nextInt(6)) {
			
				case(0):{
					nivel.addLast(new Casper(mapaLogico));
					break;
				}
				case(1):{
					nivel.addLast(new Cerebro(mapaLogico));
					break;
				}
				case(2):{
					nivel.addLast(new Colmena(mapaLogico));
					break;
				}
				case(3):{
					nivel.addLast(new IsaacCerebro(mapaLogico));
					break;
				}
				case(4):{
					nivel.addLast(new CerebroDemonio(mapaLogico));
					break;
				}
				case(5):{
					nivel.addLast(new Arrastre(mapaLogico));
					break;
				}
			}
					
		}	
	}
}
