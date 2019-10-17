package Entidades.Campeones.Aliados.AliadosRango.Apollyon;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Aliados.AliadosRango.AliadoRango;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.VisitanteBooleano;

public class Apollyon extends AliadoRango {
	
	protected ApollyonGrafico apollyonGrafico;
	
	public Apollyon(MapaLogico mapaLogico) {
		super(mapaLogico);
		
		this.ancho = 75;
		this.alto = 75;
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;		
		this.monedas = 100;
		

		ApollyonGrafico apollyonGrafico= new ApollyonGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = apollyonGrafico;
	}


	@Override
	public void agregarMagia(Magia m) {
		// TODO Auto-generated method stub

	}

	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
				
	}

	@Override
	public void recibirGolpe(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpear() {
		// TODO Auto-generated method stub
		
	}

}
