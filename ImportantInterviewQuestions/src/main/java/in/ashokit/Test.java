package in.ashokit;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // Define an array of numbers
       /* int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Using parallel stream to process array elements in parallel
        Arrays.stream(numbers)
              .parallel() // Switch to parallel stream
              .forEach(num -> System.out.println(Thread.currentThread().getName() + ": " + num));
        A.i=9;
        System.out.println(A.i);*/
    	/*List<List<Integer>> list=new ArrayList<>();
		list.add(Arrays.asList(1,2));
		list.add(Arrays.asList(3,4));
		list.add(Arrays.asList(5,6));
		list.add(Arrays.asList(5,6));
		list.add(Arrays.asList(7,8));
		System.out.println(list);	
		System.out.println("--------------------------------------------");
		list.stream().flatMap(a->a.stream()).distinct().forEach(System.out::println);
		list.stream().flatMap(a->a.stream()).distinct().collect(Collectors.toList());
		Integer i=list.stream().collect(Collectors.toList()).size();
		System.out.println(i);
		System.out.println("--------------------------------------------");
		list.stream().flatMap(a->a.stream()).forEach(System.out::println);*/
    	Example.m1();
	
    }
}

