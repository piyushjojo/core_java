package tester;

import java.util.Scanner;

import com.app.core.Vehicle;
import static com.app.core.Vehicle.sdf;

public class Test2 {

	public static void main(String[] args) /* throws ParseException */ {
		try (Scanner sc = new Scanner(System.in)) {
			
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
