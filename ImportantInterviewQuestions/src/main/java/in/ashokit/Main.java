package in.ashokit;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";

        char mostRepeatedChar = findMostRepeatedChar(str);
        System.out.println("Most repeated character: " + mostRepeatedChar);
    }

    public static char findMostRepeatedChar(String str) {
        Map<Character, Long> charFrequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return charFrequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalStateException("String is empty"));
    }
}
