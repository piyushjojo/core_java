package tester;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("Upper cased strings : ");
		//Create fixed size list of strings --covert it to upper case n display the same
		Arrays.asList("one","two","three","four")
		.stream() //Stream<String> : orig string
		//map : for transforming (converting) orig string ---> upper cased strings
		.map(String :: toUpperCase) //Stream<String> : upper cased
		.forEach(System.out::println);
		
	}

}
