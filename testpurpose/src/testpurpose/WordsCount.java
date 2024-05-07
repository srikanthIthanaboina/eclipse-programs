package testpurpose;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {
	
	public static String str = "apple is good for health and health";
	
	public static void main(String[] args) {
		String[] split = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(int i =0;i<split.length;i++) {
			if(map.containsKey(split[i])) {
				Integer integer = map.get(split[i]);
				map.replace(split[i], ++integer);
			}else {
				map.put(split[i], 1);
			}
		}
		for(String word:map.keySet()) {
		System.out.println(word+"---"+map.get(word));
		}
	}

}
