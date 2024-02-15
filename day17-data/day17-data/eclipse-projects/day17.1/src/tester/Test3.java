package tester;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// Create Stream<Integer> from a fixed size list (un sorted ) of integers , sort in asc order n display it.
	System.out.println("Sorted nums displayed using lambda expr");
		Arrays.asList(10,2,-20,23,34,100,45,56,10) //un sorted fixed size list
		.stream() // Stream<Integer>
		.sorted()
		.forEach(i -> System.out.println(i));
		//Can u replace lambda expr by a method ref in above eg ? YES 
		System.out.println("Sorted nums displayed using method ref.");
		Arrays.asList(10,2,-20,23,34,100,45,56,10) //un sorted fixed size list
		.stream() // Stream<Integer>
		.sorted()
		.forEach(System.out::println);

	}

}
