package generics;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// How will you use it for getting a fixed size List<Integer> ?
		//API of java.util.Arrays class : public static <T> List<T> asList(T... args)
		//10 20 30 40 50 ,10
		List<Integer> intList=Arrays.asList(10 ,20, 30, 40, 50 ,10);
		System.out.println(intList);
		//intList.add(1234);
		//intList.remove(0);
		intList.set(0, 9999);
		System.out.println(intList);
		//use toArray method , to convert the list ---> array
		//java.util.Collection 
		//public <T> T[] toArray(T[] type)
		Integer[] ints=new Integer[intList.size()];
		ints=intList.toArray(ints);
		System.out.println(Arrays.toString(ints));
		
		

	}

}
