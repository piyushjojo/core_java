package generics;

import static generics.GenericUtils.addElements;

import java.util.List;
import java.util.Set;

/*
 * Objective : Create a class GenericUtils , as a non generic class
1. Add a static method to print elements of any numeric type of the List.
eg : printList(List<Number> numList)
Test cases :
printList : List<Integer> , List<Double> , List<Float>........
 */
public class GenericUtils {
	// Add a static method to print elements of ANY type : ?
	public static void printList(List<?> numList) {
		for (Object n : numList)
			System.out.println(n);
	}

//	public static void printList2(List<Object> numList) {
//		for (Object n : numList)
//			System.out.println(n);
//	}
	// Add a static method to print elements of ANY type :T
	public static <T> void printList2(List<T> numList) {
		for (T n : numList)
			System.out.println(n);
	}

	// Add a static method to print elements of any numeric type of the List.
	public static void printList3(List<? extends Number> numList) {
		// ? extends Number => ANY type which is either a Number ot it's sub type (eg :
		// Byte , Short......)
		for (Number n : numList)
			System.out.println(n);
	}

	// add a non generic static method to return sum of set of ints/long/float ...
	public static double sumIt(Set<? extends Number> set) {
		double sum = 0.0;
		for (Number n : set)
			sum += n.doubleValue();
		return sum;
	}

	// add a generic static method to return sum of set of ints/long/float ...
	public static <T extends Number> double sumIt2(Set<T> set) {
		double sum = 0.0;
		for (T n : set)
			sum += n.doubleValue();
		return sum;
	}

	// add a non generic static method to return sum of set of ints/long/float ...
	public static double sumIt3(Set<? extends Number> set) {
		double sum = 0.0;
		for (Number n : set)
			sum += n.doubleValue();
		// lab work : un comment n understand the err !
		// set.add(123);//trying to add Integer type of the ref --err --since You can
		// pass to this method Set<Double> n Integer IS-NOT -A Double
		// set.add(1245678l);
		// set.add(123.35f);
		return sum;
	}

	// add a non generic (using wild card) method to all var no elements to the
	// given list
//	public static void addElements(List<? super Number> numList , Number ... numbers)
//	{
//		for(Number n : numbers)
//			numList.add(n);
//	}
	// addElements(intList,12,34,56,78); => T : Integer, ? super Integer --Integer,
	// Number , Object, T ... : var-args of Integer
	public static <T> void addElements(List<? super T> list, T... elems) {
		for (T t : elems)
			list.add(t);
	}

}
