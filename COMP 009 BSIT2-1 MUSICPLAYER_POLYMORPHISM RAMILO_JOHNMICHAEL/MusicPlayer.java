package Assignmert;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class MusicPlayer {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Softcore ");
        System.out.println("2 - Save your Tears");
        System.out.println("3 - Apocalypse");
        System.out.print("Enter music choice: ");
        int choice = scan.nextInt();

        Music music = null;

        switch (choice) {
            case 1:
                music = new Song1();
                break;
            case 2:
                music = new Song2();
                break;
            case 3:
                music = new Song3();
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        music.loadClip();
        music.control();
    }
}

