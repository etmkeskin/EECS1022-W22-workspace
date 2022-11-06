
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
		
		
		
		
		
		
		
		
		
		return result + "}";
	}
	
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		return "";
		
	}
}
