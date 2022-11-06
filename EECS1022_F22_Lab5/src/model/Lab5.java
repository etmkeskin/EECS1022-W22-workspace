package model;

public class Lab5 {

	public static String printStars(int n) {
		String result = "";
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				result += "-";
			}
			for(int k = n; k >= i; k--) {
				result += "*";
			}
			if(i < n) {
				result += "\n";
			}
			else if(i == n) {
				return result;
			}
			
		}
		
		return result;
	}
	
	
	public static String expand (int num, int d) {
		String result = "";
		
		if(num < 0 || d < 0) {
			result = "Invalid";
		}
		else {
			int digit = d;
			for(int i = 0 ; i < d ; i++) {
				
				int output = 0;
				output = (int) (num / (Math.pow(10, digit-1)));
				num = (int) (num % (Math.pow(10, digit-1)));
				if(Math.pow(10, digit - 1) != 1) {
					result += output + "*" + (int)(Math.pow(10, digit-1)) + " + ";
				}
				else {
					result += output;

				}
				digit--;
			}
	
		}

		return result;
	}
	
	
	public static String getSeqStat(int ft, int d, int n) {
		String result = "{";
		int term = ft;
		int sum = 0;
		int product = 1;
		int j = 1;
		String seq = "<";
		
		for(int i = 1; i <= n; i++, term += d) {
			sum += term;
			product *= term;
			if(i > 1) {
				seq += ", " + term;
			}
			else if(i == 1 || i == n){
				seq += term;
			}
			
			for(; j <= i; j++) {
				if(j < n) {
					result += "[" + seq + ">" + ": " + sum + ", " + product + "]" + "; ";
				}
				else if(j == n) {
					result += "[" + seq + ">" + ": " + sum + ", " + product + "]";
				}
				
			}
			
		}

		return result + "}";
	}
	
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "<";
		
		int term1 = ft1;
		int term2 = ft2;
		int j = 1;
		for(int i = 1; i <= n1; i++, term1 += d1) {
			result += term1 + ", ";
			while(j <= i) {
				result += term2 + ", ";
				term2 += d2;
				j++;
			}
		}
		for(int k = 1; k <= n2 - n1; k++, term2 += d2) {
			if(k < n2 - n1) {
				result += term2 + ", ";
			}
			else {
				result += term2;
			}
			
		}
		return result + ">";
		
	}
}
