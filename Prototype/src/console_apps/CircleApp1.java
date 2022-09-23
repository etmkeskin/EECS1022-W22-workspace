/*
 * This is version one of a console application
 * We will prompt user of radius values of two circle.
 * The application will output the areas of the two input circles.
 */
package console_apps;

import java.util.Scanner;

public class CircleApp1 {

	public static void main(String[] args) {
		// Starting the execution of the application
		//System.in denotes the standard input(i.e., keyboard)
		
		Scanner input = new Scanner(System.in);
		
		//Start the actual application code here.
		//Step 1: Prompt the user for the radius of the 1st circle.
		System.out.println("Enter the radius of the first circle:");
		
		//Declare a variable to store the user input.
		//Step 2: read a floating point number from user.
		
		double radius1 = input.nextDouble();
		double area1 = 3.14 * radius1 * radius1;
		String area1s = String.format("%.2f", area1);
		System.out.println("Area of circle is:" + area1s);
		
		
		System.out.println("Enter the radius of the second circle:");
		double radius2 = input.nextDouble();
		double area2 = 3.14 * radius2 * radius2;
		String area2s = String.format("%.2f", area2);
		System.out.println("Area of circle is:" + area2s);
		
		//end of the application.
		
		input.close();

	}

}
