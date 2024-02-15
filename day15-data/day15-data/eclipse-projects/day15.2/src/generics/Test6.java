package generics;

import static generics.GenericUtils.addElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Test6 {

	public static void main(String[] args) {
		// add a non generic (using wild card) method to all var no elements to the
		// given list
		ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 10));
		LinkedList<Double> doubles = new LinkedList<>(Arrays.asList(2.0, 3.5, 4.3));
		Vector<String> strings = new Vector<>(Arrays.asList("one", "two", "three"));
		addElements(intList,12,34,56,78);
		addElements(doubles,12.0,3.4,5.6,7.8);
		addElements(strings,"1","2","34","red");
		
	}

}
