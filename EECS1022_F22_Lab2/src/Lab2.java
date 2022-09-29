
/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 * @author May Haidar
 *
 */
public class Lab2 {
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematica
	 * sequence
	 */
	public static int collatz(int n) {
		
		int result = 0;
		
		 if((n % 2) == 0) { 
			 result = n / 2;
		 }
		 if((n % 2) == 1) {	 
			 result = (3 * n) + 1;
		 }
		 if (n < 0){
			 result = -1;
		 }
		 return result;
				 
	}
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		
	}
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static int quadrant (double x, double y) {
		
	}
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (int x, int y) {
		
	}
	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		
	}		
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		
	}
}
