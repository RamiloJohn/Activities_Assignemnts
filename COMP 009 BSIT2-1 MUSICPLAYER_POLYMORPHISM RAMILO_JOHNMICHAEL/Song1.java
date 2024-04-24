package Assignmert;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Song1 extends Music{
	 
	public void loadClip() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
	        File file = new File("The Neighbourhood Softcore Lyrics Im too consumed with my own life.wav");
	        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
	        clip = AudioSystem.getClip();
	        clip.open(audioStream);
	}
	

}
