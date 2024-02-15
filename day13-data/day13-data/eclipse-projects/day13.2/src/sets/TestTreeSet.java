package sets;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<>();
		String[] strings = { "one", "two", "three", "four", "five", "one", "yellow", "zen", "stable", "two" };
		// Populate HS using String []
		for (String s : strings)
			System.out.println("Added " + hs.add(s));// t t t t t f ....
		System.out.println("size " + hs.size());// 8
		System.out.println("TS " + hs);// un ordered n sorted : Natural ordering (i.e JVM will call : String 's
										// compareTo)
	}

}
