package utils;

import java.util.Arrays;
import java.util.LinkedList;

public class StreamUtils {
	
	public  long countStrings(String... strings) {
		// Growable List
		LinkedList<String> list = new LinkedList<>(Arrays.asList(strings));
		// list.add("something");
		return list.stream().filter(s -> s.length() > 4).count();
	}

	// non static default method
	public  String findMax(String... strings) {
		// Growable List
		LinkedList<String> list = new LinkedList<>(Arrays.asList(strings));
		return list.stream().max((s1,s2) -> s1.compareTo(s2)).get();
	}

}
