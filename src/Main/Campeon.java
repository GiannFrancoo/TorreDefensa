package Main;
import java.util.List;

public abstract class Campeon extends Entidad{
	//fila 	  --> Entidad;
	//columna --> Entidad;
	
	
	protected int vida;
	protected int fuerza;
	protected int rango;
	protected List<Magia> magias;
	
	public void restarVida(Disparo d) {
		vida = vida - d.getFuerza();
	}
	
}
