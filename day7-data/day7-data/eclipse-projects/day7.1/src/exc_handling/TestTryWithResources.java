package exc_handling;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) //try-with-resources
		{
			System.out.println("Enter an int value");
			System.out.println("You entered : "+sc.nextInt());
			System.out.println("end of try");
		}//JVM auto. invokes sc.close()
		System.out.println("main over...");
		

	}

}
