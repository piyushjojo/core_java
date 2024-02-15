package tester;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {

		// Create fixed size list of strings --filter the strings with length > 5
		// --upper case n display
		Arrays.asList("one", "two", "three", "four", "dsfasd", "tyty756746","one", "three","gfh", "657648").stream() // Stream<String>
																										// : orig string
				.filter(s -> s.length() > 5) //// Stream<String> : str len > 5
				// map : for transforming (converting) orig string ---> upper cased strings
				.map(String::toUpperCase) // Stream<String> : upper cased
				.forEach(System.out::println);

		long num = Arrays.asList("one", "two", "three", "four", "dsfasd", "tyty756746", "gfh", "657648").stream()
				.filter(s -> s.length() > 5).map(String::length) // Stream<Integer>
				.count();// terminal op.

		System.out.println("O/p ????????");
		Arrays.asList("one", "two", "three", "four", "dsfasd", "tyty756746", "gfh", "657648").stream()
				.filter(s -> s.length() > 5).map(String::length) // Stream<Integer>
				.forEach(System.out::println);

		// Create fixed size list of strings --filter the strings with length < 6 --
		// remove the dups if any --collect it into a suitable collection
		Set<String> strings=Arrays.asList("one", "two", "three", "four", "dsfasd", "tyty756746","one", "three","gfh", "657648")
		.stream() // Stream<String>
		.filter(s -> s.length()<6) //filtered Stream<String> : dup strings
		.collect(Collectors.toSet());//Set<String>, stream ---> collection
		System.out.println(strings);
		
		
	}

}
