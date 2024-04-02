package Assignmert;
import java.util.Scanner;
import java.io.PrintStream;

public class FibonacciOutput {

	public static void main(String[] args) {
	int choice;
	FibNumbers fnum = new FibNumbers();
	
	Scanner in = new Scanner(System.in);
	System.out.println("1 - Numbers ");
	System.out.println("2 - Words ");
	System.out.print("Enter choice how would you like to print your fibonacci series: ");
	choice = in.nextInt();
	
	if (choice==1) {
		fnum.FibnumDisplay();
	}
	else
		fnum.FibwordDisplay();
	}

}
