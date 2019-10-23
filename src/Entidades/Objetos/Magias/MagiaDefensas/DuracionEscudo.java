package Entidades.Objetos.Magias.MagiaDefensas;

import javax.swing.JLabel;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;

public class DuracionEscudo extends Thread {

		
		protected MapaLogico mapaLogico;
		protected JLabel label;
		protected Campeon camp;
		
		public DuracionEscudo(MapaLogico mapaLogico, Campeon camp) {
			this.mapaLogico = mapaLogico;
			this.camp = camp;
			this.label = new JLabel();
			
		}
		
		@SuppressWarnings("deprecation")
		public void run() {
			mapaLogico.getMapaGUI().insertar(label);
			int vidaAnterior = camp.getVidaActual();
			camp.setVidaActual(9999999);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			camp.setVidaActual(vidaAnterior);
			mapaLogico.getMapaGUI().remover(label);
			this.stop();

		}
}
