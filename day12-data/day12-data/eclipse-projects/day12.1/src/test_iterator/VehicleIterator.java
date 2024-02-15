package test_iterator;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Vehicle;

public class VehicleIterator {

	public static void main(String[] args) throws ParseException {
		//get sample data from utils
		ArrayList<Vehicle> vehicleList = populateVehicleList();
		//Can you attach an explicit iterator to the AL ? YES (since AL IS-A Iterable)
		Iterator<Vehicle> vehicleItr=vehicleList.iterator();
		System.out.println("List contents via Iterator");
		//pos of itr : before 1st elem
		while(vehicleItr.hasNext())
			System.out.println(vehicleItr.next());
		
		

	}

}
