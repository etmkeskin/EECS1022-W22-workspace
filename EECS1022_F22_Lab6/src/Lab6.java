
public class Lab6 {

	public static int longestSeq (int[] array) {
		int result = 0;
		
		if(array.length == 0) {
			return result;
		}
		else {
			for(int i = 0; i < array.length; i++) {
				for(int j = i + 1; j < array.length; j++) {
					int num = 0;
					if(array[i] > array[j]) {
						num = array[i];
						array[i] = array[j];
						array[j] = num;
					}
				}
			}
			int longSeq = 1;
			int current = 1;
			for(int k = 1; k < array.length; k++) {
				if(array[k] != array[k - 1]) {
					if(array[k] == array[k - 1] + 1) {
						current += 1;
					}
					else {
						longSeq = Math.max(longSeq, current);
						current = 1;
					}
				}
			}
			result = Math.max(longSeq, current);
		}
		
		
		
		return result;
	}
	
	
	public static String getArrayStats (int[] array) {
		String result = "";
		
		int len = array.length;
		double average = 0;
		int range = 0;
		if(len == 0) {
			result = "Array: [] ";
		}
		else {
			result = "Array: [";
			for(int i = 0; i < len; i++) {
				if(i < len - 1){
					result += array[i] + ", ";
				}
				else{
					result += array[i] + "], ";
				} 
				
			}
			
			//Finding average
			for(int j = 0; j < len; j++) {
				average += array[j];
			}
			average = Math.round(average /= len);
			
			//Finding range
			int max = array[0];
			int min = array[0];
			for(int k = 0; k < len; k++) {
				if(array[k] > max) {
					max = array[k];
				}
				else if(array[k] < min) {
					min = array[k];
				}
			}
			range = max - min;
			
			
		}
		
	
		return result  + "Average: " + (int)average + ", Range: " + range;
	}
	
	
	public static String countArray (int[] array) {
		String result = "";
		
		int len = array.length;
		int count = 0;
		if(len == 0) {
			return result;
		}
		else {
			for(int i = 0; i < len; i++) {
				if((array[i] % 2 == 0) && (array[i] >= 2 && array[i] < 100)) {
					for(int j = 0; j < len; j++) {
						if(array[i] == array[j]) {
							count += 1;
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		return result + count;
	}
	
	
	public static void swapElements (int [] array) {
		
	}
	
	
	public static boolean validString (String str1, String str2) {
	
			return false;
	}
	
}
