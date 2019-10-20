package Entidades.Campeones.Aliados.AliadosRango.Lazaro;

import Entidades.Campeones.Aliados.AliadosRango.AliadoRango;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public class Lazaro extends AliadoRango{
		
	protected LazaroGrafico lazaroGrafico;
	
	public Lazaro(MapaLogico mapaLogico){
		super(mapaLogico);
		
		this.ancho = 67; 
		this.alto = 80;
		this.vidaActual = 100;
		this.fuerza = 15;
		this.rango = 5;		
		this.monedas = 100;
		this.dps = 35;
		

		lazaroGrafico = new LazaroGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = lazaroGrafico;
	}

	// Dispara a rango;
	public void golpear() {	
		int n = 25; // Fuerza
		DisparoAliado d = new DisparoAliado(x, y, n, mapaLogico);
		mapaLogico.insertar(d);
		d.setX(this.x);
		d.setY(this.y);
		//lazaroGrafico.golpear();
	}

	// Se agrega una magia a la lista;
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}

}
