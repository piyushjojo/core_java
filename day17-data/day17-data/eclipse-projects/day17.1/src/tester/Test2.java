package tester;

import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		// Create stream of ints between 1-100 & display all even elements
		System.out.println("Even elems in 1-100");
		IntStream.range(1, 101) //ints between 1--100
		.filter(i -> i % 2 == 0) //even ints 
		.forEach(i -> System.out.println(i));

	}

}
