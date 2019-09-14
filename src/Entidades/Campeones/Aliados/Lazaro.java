package Entidades.Campeones.Aliados;

import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
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
	
	public Lazaro(int x, int y){
		super(x,y); // Campeon;
		
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;

		//System.out.println("Lazaro:: constructor, inicialize imagenes[0]");
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/Aliados/lazarus_estatico.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/Aliados/lazarus_disparando.png")); // Disparando;
		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/Aliados/lazarus_sufriendo.png")); // Sufriendo;
		
		grafica.setIcon(imagenes[0]); // Arranca estatico;
		
	}

	@Override
	public DisparoAliado disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		
		int n = 0;
		DisparoAliado d = new DisparoAliado(posicion.getKey(), posicion.getValue(),n);
		
		
		//Grafica
		cambiarGrafica(1); //Disparando;
	
		return d;
	}

	
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	public void restarVida(DisparoEnemigo e) {
		
	}
	
	public void restarVida(DisparoAliado a) {
		
	}
	
	 
	
	
	
	
	
	
	
	

}
