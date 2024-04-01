package Assignmert;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    	Food fd = new Food(); // Creating an instance of Consumable class
        
        System.out.println("Choose on how you gonna display Foods");
        System.out.println("1 - Display in Tree Form");
        System.out.println("2 - Display in Bullet Form");
        System.out.println("3 - Exit");
        System.out.print("Enter choice: ");

        int choice = read.nextInt();
        
        switch(choice) {
        
        case 1:
            System.out.println();
        	fd.printTree();
        	break;
        case 2:
            System.out.println();
        	fd.PrintBullet();
        	break;
        }
    }
    
}
