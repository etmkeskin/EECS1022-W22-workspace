package concole_apps;

import java.util.Scanner;

import model.Grade;

public class GreatApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a raw mark score (from 0 to 100): ");
		int marks = input.nextInt();
		
		/* 
		 * In principle, we only call one utility method from console application.
		 */
		String report = Grade.getGradeReport(marks);
		
		System.out.println(report);
		
		
		input.close();

	}

}
