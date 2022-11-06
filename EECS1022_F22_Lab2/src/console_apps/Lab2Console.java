package console_apps;
import java.util.Scanner;

import model.Lab2;

public class Lab2Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//test collatz()
		System.out.println("Enter an integer:");
		int n = scan.nextInt();
		int num = Lab2.collatz(n);
		System.out.println(num);

		//test yorkAdmit()
		System.out.println("\nEnter an gpa:");
		double gpa = scan.nextDouble();
		System.out.println("\nEnter SAT score:");
		int sat = scan.nextInt();
		String decision = Lab2.yorkAdmit(gpa,sat);
		System.out.println(decision);
		
		//test quadrant()
		System.out.println("\nEnter a point coordinates:");
		//int x = scan.nextInt();       ///***This program must take double values not integers values, there is a mistake here!!
		//int y = scan.nextInt();
		//int qdrt = Lab2.quadrant(x,y);
		//System.out.println(qdrt);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		int qdrt = Lab2.quadrant(x, y);
		System.out.println(qdrt);
		
		
		
		//test enoughLunchTime()
		//write code similar to the previous methods testing code to test this method
		System.out.println("\nEnter the first time as hours and minutes: ");
		int hour1 = scan.nextInt();
		int minute1 = scan.nextInt();
		System.out.println("\nEnter the second time as hours and minutes: ");
		int hour2 = scan.nextInt();
		int minute2 = scan.nextInt();
		boolean result = Lab2.enoughLunchTime(hour1, minute1, hour2, minute2);
		System.out.println(result);
		
		//test computePayment()
		//write code similar to the previous methods testing code to test this method
		System.out.println("\nEnter the previous balance: ");
		double preBalance = scan.nextDouble();
		System.out.println("\nEnter the total amount of additional charges: ");
		double addCharges = scan.nextDouble();
		double minPaymentDue = Lab2.computePayment(preBalance, addCharges);
		System.out.println(minPaymentDue);
		
		scan.close();
		
	
	}
}
