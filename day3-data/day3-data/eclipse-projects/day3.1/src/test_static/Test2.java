package test_static;

import java.util.Scanner;

public class Test2 {
	private static int counter = 10;
	private int data;
	static {
		System.out.println("in SIB , counter=" + (counter++));
		inc();
	}
	static {
		System.out.println("in another SIB");
	}
	//intstance init block
	{
		System.out.println("in instance init block...");
	}

	public Test2(int data) {
		System.out.println("in ctor");
		this.data = data;
	}

	public static void main(String[] args) {
		System.out.println("in main , counter=" + counter);
		Test2 t1=new Test2(1234);
		System.out.println(t1.data);
		System.out.println(t1.getClass());
		Test2 t2=new Test2(1235);
		System.out.println(t2.data);
		System.out.println(t2.getClass());//test_static.Test2
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.getClass());//java.util.Scanner
		sc.close();
		

	}

	static void inc() {
		System.out.println("in inc");
		counter++;
	}

}
