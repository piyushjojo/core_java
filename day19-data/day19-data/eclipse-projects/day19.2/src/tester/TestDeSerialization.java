package tester;
import static utils.IOUtils.restoreProducts;

import java.util.Scanner;

public class TestDeSerialization {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name");
			System.out.println(restoreProducts(sc.nextLine()));
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
