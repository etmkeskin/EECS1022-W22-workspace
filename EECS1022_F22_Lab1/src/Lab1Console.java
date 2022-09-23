import java.util.Scanner;

public class Lab1Console {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//test printQuotation()
		String quote = Lab1.printQuotation();
		System.out.println(quote);

		//test inverseSquare()
		System.out.println("Enter an integer:");
		int x = scan.nextInt();
		double inverse = Lab1.inverseSquare(x);
		System.out.println(x + "^-2 = " + inverse);
		
		//test paintMyRoom()
		//declare integers length, width, and height;
		int length = 0; int width = 0; int height = 0;
		//Prompt for and read in the length of the room
		System.out.print("\nEnter the length of the room: ");
		length = scan.nextInt();
		//Prompt for and read in the width of the room
		System.out.print("Enter the width of the room: ");
		width = scan.nextInt();
		//Prompt for and read in the height of the room
		System.out.print("Enter the height of the room: ");
		height = scan.nextInt();
		//Call the method paintMyRoom(length, width, height)
		double paintAmount = Lab1.paintMyRoom(length, width, height);
		int IntValue = (int)paintAmount;
		//Print the result to the console
		System.out.println("To print your room, you need: " + IntValue + " gallons");

		
		//test timeToHawaii(hours, mins, secs)
		//declare integers hours, mins and secs;
		
		int hours = 0; int mins = 0; int secs = 0;
		//Prompt for and read in the hours in integer
		System.out.print("\nPlease enter the number of hours:");
		hours = scan.nextInt();
		//Prompt for and read in the minutes in integer
		System.out.print("Please enter the number of minutes:");
		mins = scan.nextInt();
		//Prompt for and read in the seconds in integer
		System.out.print("Please enter the number of seconds:");
		secs = scan.nextInt();
		
		//Call the method timeToHawaii(hours, mins, secs)
		int total = Lab1.timeToHawaii(hours, mins, secs);
	
		//Print the result to the console
		System.out.println(hours + " Hour(s) " + mins + " Minute(s) " + secs + " Second(s) is equivalent to " + total + " Second(s).");
		
		//test baseConvert(number, base)
		int base;	// the new base
		int base10Num;  // the number in base 10
		int maxNumber;  // the maximum number that will fit
		// in 4 digits in the new base

		// read in the base 10 number and the base 
		System.out.println ("\nBase Conversion Program"); 
		System.out.println() ;
		System.out.print ("Please enter a base (2-9): "); 
		base = scan.nextInt();

		// Compute the maximum base 10 number that will fit in 4 digits
		// in the new base and and store it in maxNumber 
		// tell the user what range the number they
		// want to convert must be in, using a println statement

		System.out.print ("Please enter a base 10 number to convert: "); 
		base10Num = scan.nextInt();
		
		//call the method baseConvert(base, base10Num)
		//print the result to the console

	}

}
