package strings;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		String s1="testing strings is easy testing";
		System.out.println(s1.charAt(0)+" "+s1.charAt(s1.length()-1));
		String[] names= {"Riya","Aseem","Nikhil","Neeta","Rama","Mihir","Asmita","Riya"};
		System.out.println(names[0].compareTo(names[1]));// >0
		System.out.println(names[1].compareTo(names[3]));// < 0
		System.out.println(names[1].compareTo(names[6]));// < 0
		System.out.println(names[3].compareTo(names[2]));// < 0
		System.out.println(names[0].compareTo(names[7]));// =0
		System.out.println(s1.contains("easy"));//t
		System.out.println(Arrays.toString(s1.getBytes()));
		System.out.println(s1.indexOf("testing")+" "+s1.lastIndexOf("testing"));
		System.out.println(s1.matches(".*is.*"));
		System.out.println(Arrays.toString(s1.split(" ")));
		System.out.println(new String(new byte[] {65,66,67,68,69,70}));
		System.out.println(new String (new char[] {'s','o','m','e'}));

	}

}
