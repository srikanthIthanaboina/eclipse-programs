package in.ashokit;

import java.util.HashMap;

public class Main1 {

	public static void main(String[] args) {
		
		String name = "ramanareddy";
		
		int count;
		
		char ch;
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			if(map.containsKey(ch)) {
				count=map.get(ch);
				count++;
				map.replace(ch,count);
			}else {
				map.put(ch, 1);
			}
		}
		for(Character key:map.keySet()) {
			if(key=='a'||key=='e'||key=='i'||key=='o'||key=='u') {
				System.out.print(key+"__"+map.get(key));
			}
		}
		
	}
	
}
