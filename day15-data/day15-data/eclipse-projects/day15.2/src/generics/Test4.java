package generics;

import static generics.GenericUtils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<Double> doubles = Arrays.asList(2.0, 3.5, 4.3);
		printList3(doubles);

		List<Integer> ints = Arrays.asList(10, 20, 30, 40, 50);
		printList3(ints);

		List<Float> floats = Arrays.asList(1.2f, 3.45f, 5.0f);
		printList3(floats);
	//	printList3(Arrays.asList("1","2","3"));
		
		
		

	}

}
