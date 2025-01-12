package testpurpose;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class VowelsFinder {
	
	public static  String inputString = "Hello,Java 8 Vowels Example";
	
	public static void main(String[] args) {
		String upperCase = inputString.toLowerCase();
		List<Character> vowels = Arrays.asList('a','e','i','o','u');
		IntStream intStream = upperCase.chars();
		System.out.println(intStream.iterator());
		long count = upperCase.chars().mapToObj(c->(char)c).filter(vowels::contains).count();
		System.out.println(count);
		
	}

}
