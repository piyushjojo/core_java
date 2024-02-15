package lists;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Vehicle;
import static utils.VehicleValidationRules.validateAllInputs;
import static utils.ShowroomUtils.*;

public class Showroom {

	public static void main(String[] args) throws ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			// get the populated showroom having vehicle info.(sample data)
			ArrayList<Vehicle> vehicles = populateVehicleList();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1 . Add a Vehicle 2. Display All 3. Get Specific Vehicle Details "
						+ "4. Update Base price 5. Delete Vehicle Details 10. Exit");
				System.out.println("Choose ");
				try {
					switch (sc.nextInt()) {
					case 1: // add a vehicle
						System.out.println("Enter vehicle details : chasisNo,  color,  price,  manufactureDate");
						vehicles.add(validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), vehicles));
						System.out.println("vehicle added to the showroom....");
						break;
					case 2:
						if (vehicles.isEmpty())
							System.out.println("Empty Showroom!");
						else {
							System.out.println("Showroom Details");
							for (Vehicle v : vehicles)
								System.out.println(v);
						}
						break;
					case 3:
						System.out.println("Enter chasis no ");
						System.out.println(findByChasisNo(sc.next(), vehicles));
						break;
					case 4:
						System.out.println("Enter chasis no n new base price ");
						System.out.println(updateBasePrice(sc.next(), sc.nextDouble(), vehicles));
						break;
					case 5:
						System.out.println("Enter chasis no , to delete vehicle details");
//						Vehicle foundVehicle = findByChasisNo(sc.next(), vehicles);
//						System.out.println("Vehicle removed "+ vehicles.remove(foundVehicle));
						System.out.println("Vehicle removed " + vehicles.remove(new Vehicle(sc.next())));
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					// System.out.println(e.getMessage());
					e.printStackTrace();
				}
				// to clear the scanner's buffer , till new line
				sc.nextLine();
			}
		} // sc.close()
//		catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
