package console_apps;

import java.util.Scanner;

/*
 * Calculate the weighted sum of 5 assignments , each may come with a different weight.
 * e.g. Assignment 1 (20%) has 50 marks and Assignment 2 (40%) has 70 marks
 * Weighted sum: 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 */

public class GradeCalculatorApp1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//Stage 1: Prompt user for inputs
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		//Prompt for Assignment 1
		System.out.println(name + " what is the weight of your assignment 1?");
		int weight1 = input.nextInt();
		System.out.println(name + " what is the marks of your assignment 1?");
		int marks1 = input.nextInt();
		
		//Prompt for Assignment 2
		System.out.println(name + " what is the weight of your assignment 2?");
		int weight2 = input.nextInt();
		System.out.println(name + " what is the marks of your assignment 2?");
		int marks2 = input.nextInt();
		
		//Prompt for Assignment 3
		System.out.println(name + " what is the weight of your assignment 3?");
		int weight3 = input.nextInt();
		System.out.println(name + " what is the marks of your assignment 3?");
		int marks3 = input.nextInt();
		
		//Prompt for Assignment 4
		System.out.println(name + " what is the weight of your assignment 4?");
		int weight4 = input.nextInt();
		System.out.println(name + " what is the marks of your assignment 4?");
		int marks4 = input.nextInt();
		
		//Prompt for Assignment 5
		System.out.println(name + " what is the weight of your assignment 5?");
		int weight5 = input.nextInt();
		System.out.println(name + " what is the marks of your assignment 5?");
		int marks5 = input.nextInt();
		
		//Stage 2: Calculate grade
		double weightedSum = 
				marks1 * (weight1 / 100.0) + 
				marks2 * (weight2 / 100.0) + 
				marks3 * (weight3 / 100.0) + 
				marks4 * (weight4 / 100.0) + 
				marks5 * (weight5 / 100.0);

		//Stage 3: output result
		System.out.println("Assignment 1 [" + marks1 + ", " + weight1 + "%]");
		System.out.println("Assignment 2 [" + marks2 + ", " + weight2 + "%]");
		System.out.println("Assignment 3 [" + marks3 + ", " + weight3 + "%]");
		System.out.println("Assignment 4 [" + marks4 + ", " + weight4 + "%]");
		System.out.println("Assignment 5 [" + marks5 + ", " + weight5 + "%]");
		System.out.println("Weighted Sum: " + weightedSum);


		
		
		
		
		input.close();

	}

}
