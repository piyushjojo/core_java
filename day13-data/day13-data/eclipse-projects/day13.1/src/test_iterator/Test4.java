package test_iterator;

import static utils.ShowroomUtils.populateVehicleList;
import static utils.VehicleValidationRules.validateDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Vehicle;

public class Test4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated list of vehicles
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			System.out.println("Original Vehicle list using expl. Iterator");
			Iterator<Vehicle> vehicleItr = vehicleList.iterator();
			while (vehicleItr.hasNext()) {
				System.out.println(vehicleItr.next());
			}
			//vehicleItr : after the last elem
			System.out.println("Enter date : day-mon-yr");
			Date d1=validateDate(sc.next());
			//remove all the vehicles produced before this date
	//		System.out.println(vehicleItr.next());//NoSuchElemExc
			 vehicleItr = vehicleList.iterator();
			while(vehicleItr.hasNext())
				if(vehicleItr.next().getManufactureDate().before(d1))
					vehicleItr.remove();
			System.out.println("Vehicle list after remove");
			 vehicleItr = vehicleList.iterator();
			while (vehicleItr.hasNext()) {
				System.out.println(vehicleItr.next());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
