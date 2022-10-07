package model;

/**
 * Objective: practice  If statements, nested If statements, Demorgan's Law, Data Comparison 
 * @author May Haidar
 *
 */
public class Lab3 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, 
	 * double height, and a boolean athlete 
	 * and calculates the needed daily calories for that person as a double.
	 */
	//include the code for getCalories()
	public static double getCalories(int gender, int age, double kg, double cm, boolean isAthlete) {
		
		double calorie = 0.0;
		if((gender == 1 && age > 0) && (kg >0 && cm > 0)) {
			if(isAthlete == true) {
				calorie = 10 * kg + 6.25 * cm - 5 * age + 5;
				calorie = (calorie * 20) / 100 + calorie; 
			}
			else {
				calorie = 10 * kg + 6.25 * cm - 5 * age + 5;
			}
		}
		else if((gender == 2 && age > 0) && (kg >0 && cm > 0)) {
			if(isAthlete == true) {
				calorie = 10 * kg + 6.25 * cm - 5 * age - 161;
				calorie = (calorie * 20) / 100 + calorie;
			}
			else {
				calorie = 10 * kg + 6.25 * cm - 5 * age - 161;
			}
		}
		else {
			calorie = -1;
		}
		
		
		
		return calorie;
		
	}
		
	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. 
	 * if the salary is an invalid amount it returns -1.
	 */
	//include the code for computeTax()
	public static double computeTax(double salary) {
		
		double tax = 0.0;
		if(salary < 0) {
			tax = -1.0;
		}
		else {
			if(salary > 0 && salary <= 7150) {
				tax = 0 + (salary - 0) * 10 / 100;
			}
			else if(salary > 7150 && salary <= 29050) {
				tax = 715 + (salary - 7150) * 15 / 100;
			}
			else if(salary > 29050 && salary <= 70350) {
				tax = 4000 + (salary - 29050) * 25 / 100;
			}
			else {
				tax = 14325 + (salary - 70350) * 28 /100;
			}
		}
			
		
		return tax;
	}
	
	/**
	 * Takes a date as three integers:day, month, and year.
	 * The method returns a true if he date is valid and false otherwise.
	 * The method checks if the month is valid, and the year is after the year 1000.
	 * It checks if the day is valid according to the month. If the month is February, 
	 * it checks if the year is a leap year
	 */
	//include the code for validDate()
		
}