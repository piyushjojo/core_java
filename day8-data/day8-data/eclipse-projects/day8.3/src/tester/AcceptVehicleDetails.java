package tester;

import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;
import static com.app.core.Vehicle.sdf;

public class AcceptVehicleDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Choose from these available colors : ");
			for (Color c : Color.values())
				System.out.println(c);// toString of Enum : name

			System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate");
			Vehicle v1 = new Vehicle(sc.next(), Color.valueOf(sc.next().toUpperCase()), sc.nextDouble(),
					sdf.parse(sc.next()));
			System.out.println(v1);
		} // JVM auto : sc.close();
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main cntd....");

	}

}
