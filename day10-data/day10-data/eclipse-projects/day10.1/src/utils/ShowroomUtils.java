package utils;

import com.app.core.Vehicle;

import custom_exception.VehicleValidationException;
import static utils.VehicleValidationRules.validatePrice;

public class ShowroomUtils {
//add a static method to update base price
	public static String updateBasePrice(String chasisNo, double newPrice, Vehicle[] vehicles)
			throws VehicleValidationException {
		// find the vehicle by its chasis no
		Vehicle vehicle = findByChasisNo(chasisNo, vehicles);
		//=> vehicle found , now validate new price
		validatePrice(newPrice);
		//=> valid price
		vehicle.setPrice(newPrice+vehicle.getColor().getAdditionalCost());		
		return "Price of the vehicle with chasis no " + chasisNo + " updated...";
	}

	// add a static method to find the vehicle by it's chasis no
	public static Vehicle findByChasisNo(String chasisNo, Vehicle[] vehicles) throws VehicleValidationException {
		// create vehicle instance , wrapping it's PK (chasisNo)
		Vehicle newVehicle = new Vehicle(chasisNo);
		for (Vehicle v : vehicles)
			if (v != null)
				if (v.equals(newVehicle))
					return v;
		// => vehicle not found
		throw new VehicleValidationException("Invalid Chasis No : Vehicle not found!!!!!!!!!!!!");
	}
}
