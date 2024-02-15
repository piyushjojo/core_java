package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.VehicleValidationException;
import static com.app.core.Vehicle.sdf;

public class VehicleValidationRules {
	public static final double MIN_PRICE;
	public static final double MAX_PRICE;
	public static Date startDate;

	public static Date endDate;
	static {
		MIN_PRICE = 10000;
		MAX_PRICE = 100000;
		try {
			//Date startDate = sdf.parse("1-4-2022"); : u are initing a local var n NOT static var
			startDate = sdf.parse("1-4-2022");
			endDate = sdf.parse("31-3-2023");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

//add static methods for validations
	//...., store=vehicles => copy of ref.
	public static Vehicle validateAllInputs(String chasisNo, String color, double price, String manufactureDate,ArrayList<Vehicle> store)
			throws ParseException, VehicleValidationException, IllegalArgumentException {
		// invoke specific validation rules
		 checkForDup(chasisNo,store);
		Color validatedColor = validateColor(color);
		validatePrice(price);
		Date validatedDate = validateDate(manufactureDate);
		//=> valid inputs 
		return new Vehicle(chasisNo, validatedColor, price, validatedDate);
	}
	//add a static method for chking dup vehicles based upon chasis no
	public static void  checkForDup(String chasisNo,ArrayList<Vehicle> store) throws VehicleValidationException
	{
		//showroom  : {v1(abc-1234....),v2(abc-1235...),v3(abc-1230...),v4(abc-1260...),null,.....null}
		Vehicle newVehicle=new Vehicle(chasisNo);//abc-1250
		if(store.contains(newVehicle))
					throw new VehicleValidationException("Dup Chasis No!!!!!!!!!!!!!!!!");
		//=> no dups !!!
		System.out.println("no dup chasis no ....");		
	}

	// add a static method for validating color
	public static Color validateColor(String clr) throws IllegalArgumentException {
		return Color.valueOf(clr.toUpperCase());
	}

	// add a static method for validating price
	public static void validatePrice(double price) throws VehicleValidationException {
		if (price < MIN_PRICE || price > MAX_PRICE)
			throw new VehicleValidationException("Invalid Price!!!!!!!");
		// => price : valid ...

	}

	public static Date validateDate(String date) throws ParseException, VehicleValidationException {
		// parsing
		Date d1 = sdf.parse(date);
		// => parsing successful !
		if (d1.before(startDate) || d1.after(endDate))
			throw new VehicleValidationException("Invalid Date!!!!!!!!!!!!!");
		// => validation success
		return d1;
	}
}
