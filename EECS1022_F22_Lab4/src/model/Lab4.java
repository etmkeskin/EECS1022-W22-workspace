package model;

public class Lab4 {

	public static boolean isPerfect (int n) {
		
		boolean result = true;
		int sum = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				sum += n / i;
			}
		}
		if(sum == n) {
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	
	public static int getVowels (String str) {
		int result = 0;
		int count = str.length();
		for(int i = 0; i < count; i++) {
			char ch = str.charAt(i);
			if(ch == ('a') || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				result++;
			}
			else if(ch == ('A') || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				result++;
			}
			
		}
		
		
		return result;
	}
	
	
	public static String switchLetterCase (String str) {
		String result = "";
		int count = str.length();
		int i = 0;
		while(i < count) {
			char ch = str.charAt(i);
			boolean b1 = Character.isLowerCase(ch);
			boolean b2 = Character.isUpperCase(ch);
			if(b1 == true) {
				result += Character.toUpperCase(ch);
			}
			else if(b2 == true) {
				result += Character.toLowerCase(ch);
			}
			else if(b1 || b2 == false){
				if(ch == ' ') {
					result += " ";
				}
				else {
					result += ch;
				}
			}
			i++;
		}
		
		return result;
	}
	
	
	public static int digitSum (int number) {
		
		int sum = 0;
		if(number == 0 ) {
			sum = 0;
		}
		else {
			for(sum = 0; number > 0; sum += number % 10, number /= 10) {
				
			}			
		}
		
		return sum;
	}
	
	
	public static String printFactors (int number) {
		
		String result = "";
		int i = 1;
		
		for(; i <= number; i++) {
			String factor = String.valueOf(i);
			if(number % i == 0) {
				if(i < number) {
					result += factor + "-";
				}
				else if(i == number) {
					result += factor;
				}
				 
			}
		}
		
		return result;
		
	}
}
