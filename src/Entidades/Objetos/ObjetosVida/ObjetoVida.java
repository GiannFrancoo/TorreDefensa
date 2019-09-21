package Entidades.Objetos.ObjetosVida;

import Entidades.Disparos.Disparo;
import Entidades.Objetos.Objeto;

public abstract class ObjetoVida extends Objeto{
	
	//fila 	  --> Entidad;
	//columna --> Entidad;

	protected int vida;
	
	public ObjetoVida(int x, int y) {
		super(x, y);
	}

	public void restarVida(int n) {
		vida-= n;
	}

	public abstract void recibir(Disparo d);

}




