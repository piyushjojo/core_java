package test_iterator;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Vehicle;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		//get populated list of vehicles
		ArrayList<Vehicle> vehicleList = populateVehicleList();
		System.out.println("Vehicle list using expl. Iterator");
		Iterator<Vehicle> vehicleItr=vehicleList.iterator();
		System.out.println("class loaded for itr "+vehicleItr.getClass());//java.util.ArrayList$Itr
		while(vehicleItr.hasNext()) 
			vehicleItr.remove();//will throw java.lang.IllegalStateExc : since next() has to be called before remove()
		System.out.println("Vehicle list after remove ");
		System.out.println(vehicleList);


	}

}
