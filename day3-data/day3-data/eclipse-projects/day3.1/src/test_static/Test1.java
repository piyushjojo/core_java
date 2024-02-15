package test_static;
import static java.lang.System.*;
import static java.lang.Math.sqrt;

import java.util.Scanner;


public class Test1 {
	private int i;
	private static int j;

	public static void main(String[] args)  //Test1 class will be loaded here!
	{
		//scanner
		Scanner sc=new Scanner(in);
		show();
		Test1 ref=new Test1();
		ref.showAgain();
		out.println("sqrt of 25 "+sqrt(25));
		
		sc.close();

	}
	static void show()
	{
		//what all can u access ? i , j , both or neither  : j
		out.println(j);
	}
	void showAgain()
	{
		//what all can u access ? i , j , both or neither  : i n j both
		out.println(i+" "+j);
	}

}
