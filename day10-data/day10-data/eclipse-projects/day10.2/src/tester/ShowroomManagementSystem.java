package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exception.ShowroomCapacityException;
import custom_exception.VehicleValidationException;

import static utils.VehicleValidationRules.validateAllInputs;
import static utils.ShowroomUtils.updateBasePrice;
import static utils.ShowroomUtils.findByChasisNo;

public class ShowroomManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter showroom capacity");// 100
			// create suitable D.S to store vehicle's info
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];// 1 array obj : null....null
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1 . Add New Vehicle 2. Display showroom info 3. Update Base Price "
						+ "4. Purchase a Vehicle 10.Exit");
				System.out.println("Choose option");
				try {
					switch (sc.nextInt()) {
					case 1: // add a vehicle
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate");
							Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									vehicles);
							// => all i/ps are valid
							vehicles[counter++] = vehicle;
							System.out.println("vehicle added ....");

						} else
							throw new ShowroomCapacityException("Showroom capacity full!!!!!");

						break;
					case 2:
						System.out.println("Showroom info.");
						if (counter == 0)
							System.out.println("Empty showroom !!!!!");
						else
							for (Vehicle v : vehicles)
								if (v != null)
									System.out.println(v);

						break;
					case 3:
						System.out.println("Enter chasis no n new base price");
						// this method should ret a mesg indicating succes OR throw the exc in case of
						// failure
						System.out.println(updateBasePrice(sc.next(), sc.nextDouble(), vehicles));
						break;
					case 4:
						System.out.println("Enter chasis no , to purchase a vehicle");
						Vehicle vehicle = findByChasisNo(sc.next(), vehicles);
						// => vehicle found
						if (vehicle.getAddress() != null) // =>not available
							throw new VehicleValidationException("Vehicle is already sold !!!!!!!!!!!");
						// => vehicle available
						System.out.println("Enter your address : city state country zip code");
						vehicle.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
						System.out.println("Assigned delivery address to the vehicle ...");

						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// read off all pending inputs from the scanner till new line
				sc.nextLine();
			}
		} // sc.cloe()
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("main over....");

	}

}
