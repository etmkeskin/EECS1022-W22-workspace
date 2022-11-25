
public class Lab7 {
	
	public static String arrayResult(int[][] array) {
		String result = "";
		int evenSum = 0;
		int oddProduct = 1;
		if(array.length == 0) {
			return result;
		}
		else {
			if(array.length == 1) {
				oddProduct = 0;
			}
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					if((i + j) % 2 == 0) {
						evenSum += array[i][j]; 
					}
					else if((i + j) % 2 == 1) {
						oddProduct *= array[i][j];
					}
				}
			}
		}
		result = "Sum:" + evenSum + ", Product:" + oddProduct;
		
		return result;
	}
	
	
	public static boolean magicSquare(int[][] array) {
		boolean result = false;
		int sumRows = 0;
		int sumCols = 0;
		for(int i = 0; i < array.length; i++) {
			
		}
		
		
		
		
		
		return result;
	}
	
}

class Patient {
	
	
}

class Physician {
	
	
}