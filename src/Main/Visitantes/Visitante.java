package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida1.EAVida1;
import Entidades.EventosAleatorios.EAVida2.EAVida2;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public interface Visitante {
	
	public void visita(Enemigo e);
	public void visita(Aliado a);
	public void visita(Consumible c);
	public void visita(Disparo d);
	public void visita(Magia m);
	public void visita(EAVida1 e);
	public void visita(EAVida2 e);
	public void visita(EventoAleatorioTiempo e);
}
