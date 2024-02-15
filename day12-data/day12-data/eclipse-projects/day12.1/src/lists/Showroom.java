package lists;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exception.VehicleValidationException;
import custom_ordering.VehicleDatePriceComparator;
import custom_ordering.VehiclePriceDescComparator;

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
						+ "4. Update Base price 5. Delete Vehicle Details 6. Apply discount by date n color"
						+ "7. Purchase a vehicle 8. Display details by city 9. Sort vehicles as per chasis no "
						+ "10. Sort vehicles as per desc price 11. Sort vehicles as per asc date n price "
						+ "100. Exit");
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
//					Vehicle foundVehicle = findByChasisNo(sc.next(), vehicles);
//					System.out.println("Vehicle removed "+ vehicles.remove(foundVehicle));
						// [v1(abc1),v2(abc10),v3(abc3),v4,v5.......]
						Vehicle testVehicle = new Vehicle(sc.next());// abc3
						System.out.println("Vehicle removed " + vehicles.remove(testVehicle));
						break;
					case 6:
						System.out.println("Enter date , color n discount amount");
						applyDiscount(sc.next(), sc.next(), sc.nextDouble(), vehicles);
						break;
					case 7:
						System.out.println("Enter chasis no");
						testVehicle = findByChasisNo(sc.next(), vehicles);
						// chk if it's already sold
						if (testVehicle.getAddress() != null)
							throw new VehicleValidationException("Vehicle already sold !!!!!!!!!!!!!!!!");
						System.out.println("Enter delivery address : city state country zip code");
						testVehicle.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
						System.out.println(
								"assigned delvery address to the vehicle with chasis no " + testVehicle.getChasisNo());

						break;
					case 8:
						System.out.println("Enter city , of delivery address");
						String city = sc.next();
						System.out.println("Vehicles to be dispatched to : " + city);
						for (Vehicle v : vehicles)
							if (v.getAddress() != null) // => vehicle sold n has a delivery adr.
								if (v.getAddress().getCity().equals(city))
									System.out.println("Chasis No : " + v.getChasisNo() + " Net Price " + v.getPrice());
						break;
					case 9:
						System.out.println("Sorting vehicles as per chasis no");
						// API of Collections class : public static void sort(List<T> list)
						// Based upon : Natural ordering => List's generic type (eg : Vehicle) MUST
						// imple Comaprable , imple compreTo
						Collections.sort(vehicles);
						break;
					case 10:
						System.out.println("Sorting vehicles as per desc price");
						// API of Collections class : public static void sort(List<T> list,Comparator<T>
						// comp)
						// Based upon : Custom ordering => A separate class MUST
						// imple Comparator , imple compare(T o1,T o2)
						// args : 1 . :List to be sorted
						// 2. comp : instance of the class that imple. Comaparator
						// Collections.sort(vehicles,new VehiclePriceDescComparator());
						// replacing separate class by ano inner class
						Collections.sort(vehicles, new Comparator<Vehicle>() {

							@Override
							public int compare(Vehicle o1, Vehicle o2) {
								System.out.println("in ano inner class : desc price");
								return ((Double) o2.getPrice()).compareTo(o1.getPrice());
							}

						});
						break;
					case 11:
						Collections.sort(vehicles, new VehicleDatePriceComparator());
						break;

					case 100:
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
