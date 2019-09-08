package Main;
import java.util.LinkedList;

public class Lazaro extends Aliado{
	//fila 	  --> Entidad;
	//columna --> Entidad;
	//vida 	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	public Lazaro(){
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;
		magias = new LinkedList<Magia>();
	}

	@Override
	public DisparoAliado disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		int n = 0;
		
		DisparoAliado d = new DisparoAliado(n);
		return d;
		
	}
	
	
	
	

}
