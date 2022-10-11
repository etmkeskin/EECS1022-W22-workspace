package console_apps;
import java.util.Scanner;

import model.Lab4;

public class Lab4Console {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//test isPerfect()
		System.out.println("---Finding Perfect Number---");
		System.out.println("\nEnter a positive integer: ");
		int n = input.nextInt();
		boolean result1 = Lab4.isPerfect(n);
		System.out.println(result1);
				
		
		//test getVowels()
		System.out.println("\n---Number of vowels in a sentence---");
		System.out.println("\nType your word or sentence here: ");
		String str1 = input.nextLine();
		int result2 = Lab4.getVowels(str1);
		System.out.println(result2);
		
		
		//test switchLetterCase()
		System.out.println("\n---Switching Letter Case---");
		System.out.println("\nType your word or sentence here: ");
		String str2 = input.nextLine();
		String result3 = Lab4.switchLetterCase(str2);
		System.out.println(result3);
		
		
		//test digitSum()
		System.out.println("\n---Digit Sum Calculator---");
		System.out.println("\nEnter negative or positive integer: ");
		int number = input.nextInt();
		int result4 = Lab4.digitSum(number);
		System.out.println(result4);
		
		
		//test printFactors()
		System.out.println("\n---Printing Factors---");
		System.out.println("\nEnter a positive integer: ");
		int num = input.nextInt();
		String result5 = Lab4.printFactors(num);
		System.out.println(result5);
	
		
		
		input.close();
	}	
}
