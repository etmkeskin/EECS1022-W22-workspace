package concole_apps;
import java.util.Scanner;

import model.Lab3;

public class Lab3Console {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//test getCalories()
//		System.out.println("Welcome to daily calorie calculator!");
//		System.out.println("Enter your gender(1 for male / 2 for Female): ");
//		int gender = input.nextInt();
//		System.out.println("Enter your age: ");
//		int age = input.nextInt();
//		System.out.println("Enter your weight in kg(ex. 88.0): ");
//		double weight = input.nextDouble();
//		System.out.println("Enter your height in cm(ex. 184.0): ");
//		double height = input.nextDouble();
//		System.out.println("Are you an athlete(true/false)?: ");
//		boolean isAthlete = input.nextBoolean();
//		
//		double result = Lab3.getCalories(gender, age, weight, height, isAthlete);
//		System.out.println(result);
		
		
		//test computeTax()
		System.out.println("Enter your salary to calculate your income tax: ");
		double salary = input.nextDouble();
		double incomeTax = Lab3.computeTax(salary);
		System.out.println(incomeTax);
		
		
		
		//test validDate()
		
		
		
		
		
		input.close();
	
	}	
}
