package Main;
import Utilidad.Pair;

public abstract class Entidad {
	
	protected int fila;
	protected int columna;
	
	public void setPos(Pair<Integer,Integer> pos){
			this.fila = pos.getKey();
			this.columna = pos.getValue();
	}
	
	public Pair<Integer,Integer> getPos(){
		return new Pair<Integer,Integer>(fila,columna);
	}

}

