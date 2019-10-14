package Entidades.Campeones.Aliados.AliadosRango.Lazaro;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.VisitanteBooleano;

public class Lazaro extends Aliado{
		
	protected LazaroGrafico lazaroGrafico;
	
	public Lazaro(MapaLogico m){
		super(m);
		
		this.ancho = 63; //75
		this.alto = 75;
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;		
		this.monedas = 100;
		

		LazaroGrafico lazaroGrafico= new LazaroGrafico(this, ancho, alto);
		entidadGrafica = lazaroGrafico;
	}

	// Dispara a rango;
	public void golpear() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		
		int n = 0;
		DisparoAliado d = new DisparoAliado(x, y, n, mapaLogico);
		
		
		lazaroGrafico.golpear();
	
	}

	// Se agrega una magia a la lista;
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	// Recibe un golpe de un enemigo;
	public void recibirGolpe(int d) {
		vida = vida - d;
		lazaroGrafico.recibirGolpe();
	}

	// Para las colisiones;
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
	}

}
