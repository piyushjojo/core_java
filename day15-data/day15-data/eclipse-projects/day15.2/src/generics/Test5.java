package generics;

import static generics.GenericUtils.sumIt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		// add a static method to return sum of set of ints/long/float ...
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2));
		System.out.println("Sum " + sumIt(hs));

		LinkedHashSet<Double> lhs = new LinkedHashSet<>(Arrays.asList(1.9, 2.0, 3.6, 4.8, 5.1));
		System.out.println("Sum " + sumIt(lhs));
		// Create TreeSet<String> n invoke sumIt : javac err .: Lab work
		Set<Double> doubles = new HashSet<>();
		doubles.add(123.45);
	//	doubles.add(12345);
	}

}
