package Main;
import java.util.List;
import java.util.LinkedList;
import Utilidad.Pair;

public class MapaLogico {
	
	//Atributos de instancia ndeahh re IPOO.
	protected List<Entidad> entidades [][];
	protected List<Aliado> aliados;
	protected List<Enemigo> enemigos;
	protected Tienda tienda;
	protected Jugador jugador;

	
	

	
	
	public MapaLogico(int f, int c) {
		
		entidades = (List<Entidad>[][]) new List[f][c];
		
		for(int i = 0; f < entidades.length; i++) {
			for(int j = 0; c < entidades[0].length; j++) {
				entidades[i][j] = new LinkedList<Entidad>(); 
			}
		}
	}
	
//	public boolean Disponible(Pair<Integer,Integer> pos) {}
	
//	public void Recibir(Pair<Integer,Integer> p) {}
	
//	public void Recibir(PPair<Integer,Integer> p) {}
	
//	public void Insertar(Pair<Integer,Integer> pos, Entidad e) {}
	
//	public void Eliminar(Pair<Integer,Integer>  pos) {}
	
// 	public void mover() {}
	
	
}
