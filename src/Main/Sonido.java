package Main;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sonido {
	

	
	public static void play(String AudioName) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Sonido.class.getClassLoader().getResource(AudioName));
			Clip clip = AudioSystem.getClip();
		    clip.open(audioInputStream);	
		    audioInputStream.close();
		    
		    FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			double gain = 0.05;   
			float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
			gainControl.setValue(dB);
			
			clip.start();
			
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}
    
	
	// If you want the sound to loop infinitely, then put: clip.loop(Clip.LOOP_CONTINUOUSLY); 
    // If you want to stop the sound, then use clip.stop();

////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////  JUEGO  //////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////	
	
	public static final String BACK_MENU = ("sonidos/.wav");
	public static final String BACK_LVL1 = ("sonidos/juego/basement.wav");
	public static final String GAMEOVER = ("sonidos/.wav");

	

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////  DISPAROS  ////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String BOMBA = ("sonidos/bomba.wav");
	public static final String DISPARO_FEMUR1 = ("sonidos/disparo/femur1.wav");
	public static final String DISPARO_FEMUR2 = ("sonidos/disparo/femur2.wav");

	
////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////  DAÑO  ///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	
	public static final String RECIBIRGOLPE_COLMENA = ("sonidos/recibirgolpe/hurt_2.wav");

	
////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////  MUERTE  /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
		
}
