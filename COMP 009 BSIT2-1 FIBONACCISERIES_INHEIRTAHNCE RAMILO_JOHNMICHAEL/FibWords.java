package Assignmert;

import java.util.Scanner;

public class FibWords extends NumberWords {
	void FibwordDisplay() {
			int firstElement = 1, secondElement = 0, fSequence = 1, counter = 0, NumElement;
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter How Many Element: ");
		NumElement = Input.nextInt();
		while(counter < NumElement){
        fSequence = firstElement+secondElement;
        System.out.print(NumberWords.convertToWords(fSequence) + ", ");
        firstElement = secondElement;
        secondElement = fSequence;
        counter++;
		}
	}
}

	

