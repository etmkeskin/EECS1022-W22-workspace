
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
		return "";
	}
	
	
	public static String getSeqStat(int ft, int d, int n) {
		return "";
	}
	
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		return "";
		
	}
}
