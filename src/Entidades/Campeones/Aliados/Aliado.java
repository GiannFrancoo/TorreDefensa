package Entidades.Campeones.Aliados;

import Entidades.Campeones.Campeon;
import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;

public abstract class Aliado extends Campeon{
	
	//fila    --> Entidad;
	//columna --> Entidad;
	//vida	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	public Aliado(int x, int y, MapaLogico m) {
		super(x, y, m);
	}
	
	public abstract DisparoAliado disparar();
}
