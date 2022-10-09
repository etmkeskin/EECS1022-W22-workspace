package concole_apps;
import java.util.Scanner;

import model.Lab3;

public class Lab3Console {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//test getCalories()
		System.out.println("---Welcome to daily calorie calculator---");
		System.out.println("\nEnter your gender(1 for Male / 2 for Female): ");
		int gender = input.nextInt();
		System.out.println("\nEnter your age: ");
		int age = input.nextInt();
		System.out.println("\nEnter your weight in kg: ");
		double weight = input.nextDouble();
		System.out.println("\nEnter your height in cm: ");
		double height = input.nextDouble();
		System.out.println("\nAre you an athlete(true/false)?: ");
		boolean isAthlete = input.nextBoolean();
		
		double result = Lab3.getCalories(gender, age, weight, height, isAthlete);
		System.out.println(result);
		
		
		//test computeTax()
		System.out.println("\n---Welcome to income tax calculator---");
		System.out.println("\nEnter your salary to calculate your income tax: ");
		double salary = input.nextDouble();
		double incomeTax = Lab3.computeTax(salary);
		System.out.println(incomeTax);
		
		
		
		//test validDate()
		System.out.println("\n---Welcome to valid date calculator---");
		System.out.println("\nEnter the day: ");
		int day = input.nextInt();
		System.out.println("\nEnter the month: ");
		int month = input.nextInt();
		System.out.println("\nEnter the year: ");
		int year = input.nextInt();
		
		boolean date = Lab3.validDate(day, month, year);
		System.out.println(date);
		
		
		
		
		
		input.close();
	
	}	
}
