package utils;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.VehicleValidationException;
import static utils.VehicleValidationRules.validatePrice;
import static com.app.core.Vehicle.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class ShowroomUtils {
//add a static method to update base price
	public static String updateBasePrice(String chasisNo, double newPrice, ArrayList<Vehicle> vehicles)
			throws VehicleValidationException {
		// find the vehicle by its chasis no
		Vehicle vehicle = findByChasisNo(chasisNo, vehicles);
		// => vehicle found , now validate new price
		validatePrice(newPrice);
		// => valid price
		vehicle.setPrice(newPrice + vehicle.getColor().getAdditionalCost());
		return "Price of the vehicle with chasis no " + chasisNo + " updated...";
	}

	// add a static method to find the vehicle by it's chasis no
	public static Vehicle findByChasisNo(String chasisNo, ArrayList<Vehicle> vehicles)
			throws VehicleValidationException {
		// create vehicle instance , wrapping it's PK (chasisNo)
		Vehicle newVehicle = new Vehicle(chasisNo);
		// find out index of occurrence of vehicle
		int index = vehicles.indexOf(newVehicle); //O(n)
		if (index == -1) // => vehicle not found
			throw new VehicleValidationException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
		//=> vehicle found
		return vehicles.get(index);//O(1)
	}
	//add a static method to return populated list of vehicles (5)
	public static ArrayList<Vehicle> populateVehicleList() throws ParseException
	{
		ArrayList<Vehicle> list=new ArrayList<Vehicle>(100);
		//chasisNo, Color color, double price, Date manufactureDate
		list.add(new Vehicle("abc-12345", Color.BLACK,50000,sdf.parse("3-4-2022")));
		list.add(new Vehicle("abc-12340", Color.WHITE,40000,sdf.parse("13-4-2022")));
		list.add(new Vehicle("abc-12343", Color.WHITE,56000,sdf.parse("23-4-2022")));
		list.add(new Vehicle("abc-12350", Color.BLACK,59000,sdf.parse("1-4-2022")));
		list.add(new Vehicle("abc-12347", Color.SILVER,48000,sdf.parse("10-4-2022")));
		return list;
	}
}
