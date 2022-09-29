import java.util.Scanner;

public class Lab2Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//test collatz()
		System.out.println("Enter an integer:");
		int n = scan.nextInt();
		int num = Lab2.collatz(n);
		System.out.println(num);

		//test yorkAdmit()
		System.out.println("Enter an gpa:");
		double gpa = scan.nextDouble();
		int sat = scan.nextInt();
		String decision = Lab2.yorkAdmit(gpa,sat);
		System.out.println(decision);
		
		//test quadrant()
		System.out.println("Enter a point coordinates:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int qdrt = Lab2.quadrant(x,y);
		System.out.println(qdrt);
		
		//test enoughLunchTime()
		//write code similar to the previous methods testing code to test this method
		
		//test computePayment()
		//write code similar to the previous methods testing code to test this method
	
	}
}
