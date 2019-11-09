package Main.Estados;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteCompra;
import Utilidad.Lista.DoubleLinkedList;
import Utilidad.Lista.PositionList;


public class Comprando extends EstadoJuego{
	protected Entidad entidadComprada;
	
	public Comprando(MapaLogico mapaLogico) {
		super(mapaLogico);
	}
	
	public void actua(int x, int y) {
		
		//42 + 487 --> El alto de toda la grilla;
		
		// ACA HABRIA QUE CAMBIAR LA IMAGEN DEL MAPA!!!
		
		if((x > 223 && x < 553)) { // Para que sea un cuadrado;		
		
			mapaLogico.getTienda().setCompraValida(true);
			Visitante visitanteCompra = new VisitanteCompra(mapaLogico.getTienda());
			
			// Obtengo las coordenas en forma de grilla;
			int xx = (((x - 233) * 10)/ 841);
			int yy = (((y - 42) * 6)/ 487); 
			
			// La obtengo en la esquina de cada celda;
			int xNormalizada = ((xx * 841) / 10 ) + 233;
			int yNormalizada = ((yy * 487) / 6) + 42;
			
		
			if(mapaLogico.getTienda().getComprado().getAlto() > 90) { // Es de 2 casillas; (EL alto es alrededor de 85);
				int dondeQuiereInsertarlo = mapaLogico.getTienda().getComprado().getAlto() + yNormalizada;
				
				if(dondeQuiereInsertarlo < (42+487)) { // Si no es la ultima casilla;
	
					PositionList<Entidad> listaArriba = mapaLogico.colisioneRango(xNormalizada, xNormalizada + 80, yNormalizada, yNormalizada+80);
					PositionList<Entidad> listaAbajo = mapaLogico.colisioneRango(xNormalizada, xNormalizada + 80, yNormalizada + 80, yNormalizada+80+80);
	//				PositionList<Entidad> listaArriba = mapaLogico.colisioneRango(xNormalizada, xNormalizada + 80, yNormalizada);
	//				PositionList<Entidad> listaAbajo = mapaLogico.colisioneRango(xNormalizada, xNormalizada + 80, yNormalizada + 85);
					PositionList<Entidad> listaColisionados = new DoubleLinkedList<Entidad>();
					
					for(Entidad e : listaArriba) { // Junto la lista de arriba;
						listaColisionados.addLast(e);
					}
					
					for(Entidad e : listaAbajo) { // Junto la lista de abajo;
						listaColisionados.addLast(e);
					}
					
					for(Entidad e : listaColisionados) { // Se modifica la compra valida si es que hay un enemigo o aliado;
						e.visitar(visitanteCompra);	
						if(!(mapaLogico.getTienda().getCompraValida()))
							break;
					}
				}
				else { // Ya que clickeo en la ultima casilla o en cualquier lado no valido.
					mapaLogico.getTienda().setCompraValida(false);
				}
			}
			else { // 1 Casilla;
							
				PositionList<Entidad> listaColisionados = mapaLogico.colisioneRango(xNormalizada, xNormalizada + 80, yNormalizada, yNormalizada+80);
				
				for(Entidad e : listaColisionados) { // Se modifica la compra valida si es que hay un enemigo o aliado;
					e.visitar(visitanteCompra);	
					if(!(mapaLogico.getTienda().getCompraValida()))
						break;
				}		
			}
			
			if(mapaLogico.getTienda().getCompraValida()) {//Si es valida donde quiere colocar la entidad, lo meto.
				Entidad e = mapaLogico.getTienda().getComprado();
				e.setX(xNormalizada);
				e.setY(yNormalizada);
				mapaLogico.getJugador().disminuirMonedas(e.getMonedas());
				mapaLogico.getTienda().actualizarMonedas();
				mapaLogico.getTienda().actualizarTienda();
				mapaLogico.insertar(e);
			}		
			
			
			mapaLogico.getMapaGUI().ocultarIndicacion();
			
			
			mapaLogico.setEstado(new Jugando(mapaLogico));
		}	
		
	}


}
