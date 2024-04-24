package Assignmert;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
abstract class Music {
    protected Clip clip;

    public void play() {
        clip.start();
    }

    public void stop() {
        clip.stop();
    }

    public void reset() {
        clip.setMicrosecondPosition(0);
    }

    public void close() {
        clip.close();
    }

    public abstract void loadClip() throws IOException, UnsupportedAudioFileException, LineUnavailableException;

    public void control() {
        Scanner scan = new Scanner(System.in);
        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play");
            System.out.println("S = Stop");
            System.out.println("R = Reset");
            System.out.println("Q = Quit");
            System.out.println("Enter choice: ");

            response = scan.next().toUpperCase();
            switch (response) {
                case "P":
                    play();
                    break;
                case "S":
                    stop();
                    break;
                case "R":
                    reset();
                    break;
                case "Q":
                    close();
                    break;
            }
        }
    }
}