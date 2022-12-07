
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
		int[] rowSum = new int[array.length];
		int[] columnSum = new int[array.length];
		int diagonalSum1 = 0;
		int diagonalSum2 = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				rowSum[i] += array[i][j]; 
			}
		}
		for(int j = 0; j < array.length; j++) {
			for(int i = 0; i < array.length; i++) {
				columnSum[j] += array[i][j]; 
			}
		}
		for(int i = 0; i < array.length; i++) {
			diagonalSum1 += array[i][i];
		}
//		for(int i = array.length - 1; i >= 0; i--) {
//			for(int j = 0; j < array.length; j++) {
//				diagonalSum2 += array[i][j];
//			}
//		}
		if((diagonalSum1 == diagonalSum2) && rowSum == columnSum) {
			result = true;
		}
		else {
			return result;
		}
		


		
		
		
		
		return result;
	}
	
}

//class Patient {
//	
//	
//}
//
//class Physician {
//	
//	
//}