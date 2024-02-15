package tester;

import java.util.stream.IntStream;

public class Test7 {

	public static void main(String[] args) {
		//Display sum of square of all even nos between 1-100 .
		System.out.println("sum="+IntStream.rangeClosed(1, 100) //1---100
		.filter(i -> i % 2 == 0) //even nos
		.map(i -> i * i)// Intstream : sq of evens
		.sum());
		
	}

}
