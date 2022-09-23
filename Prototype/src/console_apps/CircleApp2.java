/*
 * This is version one of a console application
 * We will prompt user of radius values of two circle.
 * The application will output the areas of the two input circles.
 * This version 2 improves version 1 by calling re-usable utility method.
 */
package console_apps;

import java.util.Scanner;

import model.Circle;

public class CircleApp2 {

	public static void main(String[] args) {
		// Starting the execution of the application
		//System.in denotes the standard input(i.e., keyboard)
		
		Scanner input = new Scanner(System.in);
		
		//Start the actual application code here.
		//Step 1: Prompt the user for the radius of the 1st circle.
		System.out.println("Enter the radius of the first circle:");
		
		double radius1 = input.nextDouble();
		
		/*
		 * Change: reuse formula calculation by calling the utility method.
		 */
		
		double area1 = Circle.getArea(radius1);
		String area1s = String.format("%.2f", area1);
		System.out.println("Area of circle is:" + area1s);
		
		
		System.out.println("Enter the radius of the second circle:");
		
		double radius2 = input.nextDouble();
		
		/*
		 * Change: reuse formula calculation by calling the utility method.
		 */
		
		double area2 = Circle.getArea(radius2);
		String area2s = String.format("%.2f", area2);
		System.out.println("Area of circle is:" + area2s);
		
		//end of the application.
		
		input.close();

	}

}
