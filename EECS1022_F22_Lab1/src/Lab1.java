
/**
 * Objective: practice input/output, Strings, expressions, variables cs. constants 
 * @author May Haidar
 *
 */
public class Lab1 {
	/**
	 * @return returns the quotation in the lab document as a string including
	 * all the escape characters
	 */
	public static String printQuotation(){
		String quote = "";
		//code goes here
		return quote;

	}
	/**
	 * Takes an integer as input and calculates the inverse of its square (x^-2)
	 * and returns the result as a double
	 */
	public static double inverseSquare(int x){
		double invSq = 0.0;
		//compute the inverse of the integer's square
		//return the result

	}	
	/**
	 * Takes the time in hours, minutes, and seconds and convert it all to seocnds
	 * and returns the result as an integer
	 */
	public static int timeToHawaii(int hours, int mins, int secs){
		int totalSeconds = 0;
		//convert the time to seconds
		return totalSeconds;

	}
	/**
	 * Takes the dimensions of a room as parameters: length, width, and height as integers
	 * and compute the amount of paint needed in gallons
	 * @return returns the number of gallons of paint as integer
	 */
	public static double paintMyRoom(int length, int width, int height) {
		
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		
		//declare double totalSqFt;
		//declare double paintNeeded;

		//Compute the total square feet to be painted--think
		//about the dimensions of each wall (of course you don’t paint the floor neither the ceiling)
		//Compute the amount of paint needed

		//return the number of gallons of paint 

	}
	/**
	 * Converts base 10 numbers to another base
	 * (at most 4 digits in the other base). 
	 * The base 10 number and the base are input.
	 */
	public static String baseConvert(int baseB,int base10Num) {
	
		int place0;	// digit in the 1's (base^0) place 
		int place1;	// digit in the base^1 place
		int place2;	// digit in the base^2 place 
		int place3;	// digit in the base^3 place
	
		String baseBNum = new String (""); // the number in the new base 
		
		// First compute place0 -- the units place. Remember this comes
		// from the first division so it is the remainder when the
		// base 10 number is divided by the base (HINT use %).
		
		// Then compute the quotient (integer division / will do it!) -
		// You can either store the result back in base10Num or declare a
		// new variable for the quotient
	
		// Now compute place1 -- this is the remainder when the quotient
		// from the preceding step is divided by the base.
		// Then compute the new quotient
	
		// Repeat the idea from above to compute place2 and the next quotient
	
		// Repeat again to compute place3
		
		//concatenate the resulting integers into a single string baseBNum
		//return the string
	}

}



