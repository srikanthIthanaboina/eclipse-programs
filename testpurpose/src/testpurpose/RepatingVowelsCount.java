package testpurpose;

import java.util.HashMap;
import java.util.Map;

public class RepatingVowelsCount {
	
	public static String name = "ramanareddy";
	
	public static int  count = 0;

	
	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			
			char c = name.charAt(i);
			if(map.containsKey(c)) {
				Integer integer = map.get(c);
				integer++;
				map.replace(c,integer);
			}else {
				map.put(c, 1);
			}
			
		}
		for(Character c:map.keySet()) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c+"--"+map.get(c));
		}
		}
		
		
		
	  
		
	}

}
