package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntegerList {

	public static void main(String[] args) {
		// create empty AL for storing integer refs
		ArrayList<Integer> intList=new ArrayList<>();//size=0, init capa=10
		//create array of ints n use it for populating AL
		int[] data= {45,10,23,45,10};
		for(int i : data)//i=data[0].....i=data[data.length-1]
			intList.add(i);//javac impl conversion : autoboxing , intList.add(Integer.valueOf(i));
		System.out.println("AL contents via toString "+intList);//toString of AL(inherited from AbstractList)
		System.out.println("size of the list "+intList.size());
		//Can you attach a for-each to the AL ? YES (since AL IS-A Iterable !)
		System.out.println("AL via for-each");
		for(int i : intList) //impl conv : auto un boxing
			System.out.println(i);
		//Can you attach a for loop to the AL ? YES
		System.out.println("AL via for loop");
		for(int i=0;i<intList.size();i++)
			System.out.println(intList.get(i));
		//insert 
		intList.add(0,99);
		System.out.println("AL after insert "+intList);
		//Create another empty list of ints
		ArrayList<Integer> list2=new ArrayList<>(100);//size = 0   init capa=100
		list2.add(11);
		list2.add(21);
		list2.addAll(1,intList);//O(n)
		System.out.println("list2 contents "+list2);//[11, 99, 45, 10, 23, 45, 10, 21]
		//get the element by it's index : O(1)
	//	System.out.println(list2.get(100));IndexOutOfBoundsExc
		System.out.println(list2.get(list2.size()-1));//last elem : 21
		System.out.println(list2.indexOf(10)+" "+list2.lastIndexOf(100));
		System.out.println(list2.remove(3));//removed elem : 10
		System.out.println("list2 after remove "+list2);//[11, 99, 45, 23, 45, 10, 21]
		System.out.println(list2.set(0, 12345));//11 : old elem
		System.out.println(list2);//[12345, 99, 45, 23, 45, 10, 21] : O(1)
		System.out.println(list2.contains(45));//t
		//create Integer[] to store elements in the list
		//intList : 99, 45,10,23,45,10
		Integer[] intArray=new Integer[intList.size()];
		System.out.println(Arrays.toString(intList.toArray(intArray)));//[99, 45,10,23,45,10]
		//sort the integer list as per asc order
		Collections.sort(list2);
		System.out.println(intList);//ordered o/p
		System.out.println(list2);//sorted o/p
		
			
		
		
		

	}

}
