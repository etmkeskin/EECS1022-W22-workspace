import java.util.Arrays;

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
		int[] freq = new int[len];
		int visited = -1;
		
		if(len == 0) {
			return result;
		}
		else {
			//Finding frequencies of each element
			for(int i = 0; i < len; i++) {
				int count = 1;
				for(int j = i + 1; j < len; j++) {
					if(array[i] == array[j]) {
						count ++;
						freq[j] = visited;
					}
				}
				if(freq[i] != visited) {
					freq[i] = count;
				}
			}
			//Finding max according to the given condition of being even and less than 100
			int max = array[0];
			for(int m = 0; m < len; m++) {
				if((array[m] > max) && ((array[m] % 2 == 0)&&(array[m] < 100))) {
					max = array[m];
				}
			}
			//Creating result, using \n according to last element in freq[] array
			for(int k = 0; k < len; k++) {
				if((freq[k] != visited) && (array[k] % 2 == 0) && (array[k] >= 2 && array[k] < 100)) {
					if(array[k] < max) {
						result += array[k] + ": " + freq[k] + "\n";
					}
					else if(array[k] == max){
						result += array[k] + ": " + freq[k];
					}
					
				}
			}
		}
		
		return result;
	}
	
	
	public static void swapElements (int [] array) {
		
		int len = array.length;
		int evenNum = array[0];
		if(len % 2 == 0) {
			for(int i = 0; i < len; i += 2) {
				for(int j = i; j < len; ) {
					
					evenNum = array[i + 1];
					array[i + 1] = array[j];
					array[j] = evenNum;
					break;
				}
			}
		}
		else if(len % 2 == 1) {
			for(int i = 0; i < len / 2; i++) {
				evenNum = array[i];
				array[i] = array[len - i - 1];
				array[len - i - 1] = evenNum;
				
			}
		}
		
	}
	
	
	public static boolean validString (String str1, String str2) {
		boolean result = true;
		
		int len1 = str1.length();
		int len2 = str2.length();
		char[] str1Arr = new char[len1];
		char[] str2Arr = new char[len2];
		char[] arrResult = new char[len2];
		
		for(int i = 0; i < len1; i++) {
			str1Arr[i] = str1.charAt(i);
		}	
		for(int j = 0; j < len2; j++) {
			str2Arr[j] = str2.charAt(j);
		}
		for(int k = 0; k < len2; k++) {
			for(int m = k; m < len1; m++) {
				if((str1Arr[m] == str2Arr[k]) && (str1Arr[1] == str2Arr[1])) {
					arrResult[k] = str1Arr[m];
				}
			}
		}
		for(int i = 0; i < len2; i++) {
			if(str2Arr[i] != arrResult[i]) {
				result = false;
			}
		}
		
		
		
		
		
		
		
		return result;
	}
	
}
