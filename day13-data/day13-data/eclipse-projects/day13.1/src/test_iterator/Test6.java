package test_iterator;

import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.app.core.Vehicle;

public class Test6 {

	public static void main(String[] args) throws ParseException {
		// get populated list of vehicles
		ArrayList<Vehicle> vehicleList = populateVehicleList();
		System.out.println("Vehicle list using expl. Iterator");
		Iterator<Vehicle> vehicleItr = vehicleList.iterator();
		while (vehicleItr.hasNext())
			System.out.println(vehicleItr.next());
		// display the vehicles in reverse order : using ListIterator
		ListIterator<Vehicle> listItr = vehicleList.listIterator(vehicleList.size());// cursor is placed after the
																							// last elem
		System.out.println("cls for ListItr "+listItr.getClass());
		System.out.println("Vehicle list in reverse order ");
		while(listItr.hasPrevious())
			System.out.println(listItr.previous());
		

	}

}
