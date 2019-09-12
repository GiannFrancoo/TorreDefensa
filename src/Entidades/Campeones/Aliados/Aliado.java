package Entidades.Campeones.Aliados;

import Entidades.Campeones.Campeon;
import Entidades.Disparos.Aliados.DisparoAliado;

public abstract class Aliado extends Campeon{
	
	//fila    --> Entidad;
	//columna --> Entidad;
	//vida	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	public Aliado(int x, int y) {
		super(x,y);
	}
	
	public abstract DisparoAliado disparar();
}
