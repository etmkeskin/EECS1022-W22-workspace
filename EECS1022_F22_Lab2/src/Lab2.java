
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
		
		String result = "";
		
		if(gpa <= 1.5 && sat <= 700) {
			result = "ScoresTooLow";	
		}
		else if(gpa > 1.8 && sat > 900) {
			result = "Accept";
		}
		else {
			result = "Reject";
		}
		
		return result;
	}
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow" (THERE IS A MISTAKE HERE)
	 */
	/*
	 * THIS METHOD CALCULATES QUADRANT VALUE OF COORDINATES.
	 */
	public static int quadrant (double x, double y) {
		
		int result = 0;
		
		if(x > 0 && y > 0) {
			result = 1;
		}
		if(x < 0 && y > 0) {
			result = 2;
		}
		if(x < 0 && y < 0) {
			result = 3;
		}
		if(x > 0 && y < 0) {
			result = 4;
		}
		
		return result;
		
	}
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	/*
	 * THIS METHOD MUST TAKE DOUBLE VALUES AS COORDINATES NOT INTEGER VALUES. THERE IS A MISTAKE HERE.
	 */
//	public static int quadrant (int x, int y) {
//		
//		int result = 0;
//		
//		if(x > 0 && y > 0) {
//			result = 1;
//		}
//		if(x < 0 && y > 0) {
//			result = 2;
//		}
//		if(x < 0 && y < 0) {
//			result = 3;
//		}
//		if(x > 0 && y < 0) {
//			result = 4;
//		}
//		
//		return result;
//		
//	}
	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		
		boolean result = true;
		
		if(((hour1 > 24) || (hour2 > 24)) || ((min1 > 59) || (min2 > 59))) {
			result = false;
		}
		else if(hour1 > hour2){
			result = false;
		}
		else {
			if((hour2 - hour1) >= 2) {
				result = true;
			}
			else if(hour1 < hour2) {
				if((min2 + min1) >= 45) {
					result = true;
				}
				else {
					result = false;
				}
			}
			if(hour1 == hour2) {
				if((min2 + min1) >= 45) {
					result = true;
				}
				else {
					result = false;
				}
			}
		}
		
		
		return result;
		
	}		
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		double interest = 0.0;
		double minPayment = 0.0;
		double totalCharges = oldBalance + charges;
		
		if(oldBalance == 0) {
			interest = 0.0;
			
			if(totalCharges < 50.00) {
				minPayment = totalCharges;
			}
			else if((totalCharges > 50.00) && (totalCharges < 300.00)) {
				minPayment = 50.00;
			}
			else {
				minPayment = 20 * totalCharges / 100;
			}
		}
		else if(oldBalance > 0) {
			interest = 0.02 * totalCharges;
			totalCharges = totalCharges + interest;
			
			if(totalCharges < 50.00) {
				minPayment = totalCharges;
			}
			else if((totalCharges > 50.00) && (totalCharges < 300.00)) {
				minPayment = 50.00;
			}
			else {
				minPayment = 20 * totalCharges / 100;
			}
		}
		
		
		return minPayment;
		
	}
}
