
package view;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


public class SoundClass {

	public SoundClass(String fileName) {
		try {		
			AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(fileName));
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			clip.start();	
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Sound File", JOptionPane.ERROR_MESSAGE);
		}

	}
}
