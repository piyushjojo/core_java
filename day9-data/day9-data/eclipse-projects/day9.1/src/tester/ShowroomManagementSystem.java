package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exception.ShowroomCapacityException;
import static utils.VehicleValidationRules.validateAllInputs;

public class ShowroomManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter showroom capacity");// 100
			// create suitable D.S to store vehicle's info
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];// 1 array obj : null....null
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1 . Add New Vehicle 2. Display showroom info 10.Exit");
				System.out.println("Choose option");
				try {
					switch (sc.nextInt()) {
					case 1: // add a vehicle
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate");
							Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),vehicles);
							// => all i/ps are valid
							vehicles[counter++] = vehicle;
							System.out.println("vehicle added ....");

						} else
							throw new ShowroomCapacityException("Showroom capacity full!!!!!");

						break;
					case 2:
						System.out.println("Showroom info.");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);

						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				//read off all pending inputs from the scanner till new line
				 sc.nextLine();
			}
		} // sc.cloe()
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("main over....");

	}

}
