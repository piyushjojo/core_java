package linked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLInkedList2 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();//size=0, capacity : irrelevent
		Collections.addAll(l1, "one", "two", "three", "four", "five");
		System.out.println(l1);
		Iterator<String> itr = l1.descendingIterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		//how to copy these elems in the AL?
		ArrayList<String> al=new ArrayList<String>(l1);
		System.out.println("AL "+al);
		

	}

}
