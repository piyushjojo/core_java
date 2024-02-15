package test_iterator;

import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Vehicle;

public class Test5 {

	public static void main(String[] args) throws ParseException {
		// get populated list of vehicles
		ArrayList<Vehicle> vehicleList = populateVehicleList();
		Iterator<Vehicle> vehicleItr = vehicleList.iterator();
		// removing the 1st vehicle
		vehicleList.remove(0);// structural modification : size of the list is modified : no exc
	//	vehicleItr = vehicleList.iterator();
		System.out.println("Vehicle list using expl. Iterator");
		while (vehicleItr.hasNext())
			System.out.println(vehicleItr.next());// ConcurrentModificztionExc : since you are trying to use the SAME
													// iterator , after modifying the structure of the list

	}

}
