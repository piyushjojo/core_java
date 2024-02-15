package sorting;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Vehicle;

public class SortVehiclesByChasisNo {

	public static void main(String[] args) throws ParseException {
		ArrayList<Vehicle> list = populateVehicleList();
		System.out.println("Original list : ordered ");
		for(Vehicle v : list)
			System.out.println(v);
		//API of java.util.Collections : public static void sort(List<T> list)
		Collections.sort(list);
		System.out.println("Vehicles sorted as per chasis no  ");
		for(Vehicle v : list)
			System.out.println(v);
		

	}

}
