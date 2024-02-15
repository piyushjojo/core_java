package generics;

import static generics.GenericUtils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Double> doubles = Arrays.asList(2.0, 3.5, 4.3);
		printList(doubles);

		List<Integer> ints = Arrays.asList(10, 20, 30, 40, 50);
		printList2(ints);

		List<Float> floats = Arrays.asList(1.2f, 3.45f, 5.0f);
		printList2(floats);
		
		
		// Can you say : Double IS-A Number ? Yes
		Number n = 123.456;
		// BUT can say : List<Double> IS-A LIst<Number> : NO
		// printList2(doubles);
		// BUT can u say : List<Double> IS-A LIst<Object> : NO
		Emp e = new SalesMgr(12345);// up casting
		e.computeSalary();// run time poly.
		ArrayList<Emp> emps = new ArrayList<>();
		ArrayList<SalesMgr> mgrs = new ArrayList<>();
		// emps=mgrs;
		ArrayList<Object> objs = new ArrayList<>();
		// objs=emps;
		// objs=mgrs;
		ArrayList<?> anyList = new ArrayList<>();// inferred RHS generic type : Object
		anyList = emps;
		anyList = mgrs;

	}

}
