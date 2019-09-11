package Entidades.Campeones.Aliados;

import java.util.LinkedList;
import javax.swing.ImageIcon;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.Magias.Magia;

public class Lazaro extends Aliado{
	//fila 	     --> Entidad;
	//columna    --> Entidad;
	//grafico 	 --> Entidad;
	//imagenes[] --> Entidad;
	//alto --> Entidad;
	//ancho --> Entidad;
	//vida 	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	public Lazaro(){
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;
		this.magias = new LinkedList<Magia>();
		

		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/BattleCity/down.png")); // Disparando;
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/BattleCity/left.png")); // Sufriendo;
		//this.imagenes[3] = new ImageIcon(this.getClass().getResource("/BattleCity/right.png"));
		
		
	}

	@Override
	public DisparoAliado disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		int n = 0;
		
		DisparoAliado d = new DisparoAliado(n);
		
		
		//Grafica
		cambiarGrafica(1); //Disparando
	
		return d;
	}
	
	
	
	 
	
	
	
	
	
	
	
	

}
