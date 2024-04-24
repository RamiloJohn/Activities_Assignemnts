package Assignmert;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class Song2 extends Music {
	 
	public void loadClip() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
	        File file = new File("The Weeknd Save Your Tears Lyrics.wav");
	        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
	        clip = AudioSystem.getClip();
	        clip.open(audioStream);
	 }
}
