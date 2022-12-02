import java.util.ArrayList;

public class Lab8 {
	
	public static void switchPairs(ArrayList<String> list) {
		
		if(list.size() % 2 == 0) {
			for(int i = 1; i < list.size(); i += 2) {
				list.add(i - 1, list.get(i));
				list.remove(i + 1);
			}
		}
		else {
			for(int i = 1; i < list.size() - 1; i += 2) {
				list.add(i - 1, list.get(i));
				list.remove(i + 1);
			}
		}
	}
	
	
	public static String acronym(ArrayList<String> words) {
		String result = "";
		for(int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			char firstChar = word.charAt(0);
			result += Character.toUpperCase(firstChar);
		}
	    return result;
	}
}
//
//
//class Patient {
//	
//	
//}
//
//
//class Physician {
//
//	
//}