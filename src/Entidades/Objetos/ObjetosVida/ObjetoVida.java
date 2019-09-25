package Entidades.Objetos.ObjetosVida;

import Entidades.Disparos.Disparo;
import Entidades.Objetos.Objeto;
import Main.MapaLogico;

public abstract class ObjetoVida extends Objeto{
	
	//fila 	  --> Entidad;
	//columna --> Entidad;
	

	protected int vida;
	protected int cantMonedas;
	
	public ObjetoVida(int x, int y, MapaLogico m) {
		super(m);
	}

	public void restarVida(int n) {
		vida-= n;
	}
	
	public int getMonedas() {
		return cantMonedas;
	}

	public abstract void recibir(Disparo d);

}




