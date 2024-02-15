package tester;

import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestComposition {

	public static void main(String[] args) {
		// Can u create DIRECTLY delivery address instance ? NO
		//if the access specifier "public" , can it be access from within the outer class instance ? YES
		Vehicle.DeliveryAddress adr=new Vehicle("abc-12345",Color.BLACK,34567,new Date())
				.new DeliveryAddress("a","b","c","d");
		System.out.println(adr);

	}

}
