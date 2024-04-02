package Assignmert;

import java.util.Scanner;

public class FibNumbers extends FibWords {
	void FibnumDisplay() {
		int firstElement = 1, secondElement = 0, fSequence = 0, counter = 0, NumElement;
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter How Many Element: ");
		NumElement = Input.nextInt();
		while(counter < NumElement){
            fSequence = firstElement+secondElement;
            System.out.print(fSequence + ", ");
            firstElement = secondElement;
            secondElement = fSequence;
            counter++;
		}
	}
}	
