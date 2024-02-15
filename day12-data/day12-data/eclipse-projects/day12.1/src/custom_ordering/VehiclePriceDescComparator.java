package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceDescComparator implements Comparator<Vehicle>{
	@Override
	public int compare(Vehicle v1,Vehicle v2)
	{
		System.out.println("in price desc compare ");
//		if(v1.getPrice() < v2.getPrice())
//			return 1;
//		if(v1.getPrice()==v2.getPrice())
//			return 0;
//		return -1;	
		return ((Double)v2.getPrice()).compareTo(v1.getPrice());//to give a hint to javac : prog has to explicitly use type cast or valueOf
		//invoker . BUT javac can perform auto boxing for the arg .
	}

}
