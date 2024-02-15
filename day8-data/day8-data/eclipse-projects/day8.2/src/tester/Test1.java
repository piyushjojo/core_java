package tester;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.app.core.Vehicle;

public class Test1 {

	public static void main(String[] args) /* throws ParseException */ {
		try (Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate");
			Vehicle v1 = new Vehicle(sc.next(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()));
			System.out.println(v1);
		} // JVM auto : sc.close();
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main cntd....");

	}

}
