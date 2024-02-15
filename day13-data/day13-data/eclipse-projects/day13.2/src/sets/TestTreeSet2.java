package sets;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		// Create a treeset , using desc order of sorting of strings
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("in ano inner");
				return o2.compareTo(o1);
			}

		});
		System.out.println("TS "+ts);//[]
		String[] strings = { "one", "two", "three", "four", "five", "one", "yellow", "zen", "stable", "two" };
		LinkedList<String> list=new LinkedList<>();
		for(String s : strings)
			list.add(s);
		ts.addAll(list);//no dups , invokes ano inner's compare method
		System.out.println(ts);//populated TS
			
	}

}
