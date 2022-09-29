package console_apps;

import java.util.Scanner;

import model.Sequence;

public class SequenceApps2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user and read input
		System.out.println("Enter the (FT) of an arithmetic sequence of size 5: ");
		int ft = input.nextInt();
		
		System.out.println("Enter the common difference (d): ");
		int d = input.nextInt();
		
		// compute result
		
		String seq = Sequence.getSequence2(ft, d);
		int sum = Sequence.getSum2(ft, d);
		
		
		// out put the result to console
		System.out.println("Sequence " + seq + " has sum " + sum); // sum is integer but + operation can be used for string concatenation.
		
		
		input.close();
	}

}
