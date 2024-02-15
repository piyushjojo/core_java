package tester;

import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestVehicleEquality2 {

	public static void main(String[] args) {
		Object v1 = new Vehicle("abc-12345", Color.BLACK, 50000, new Date());// up casting
		Object v2 = new Vehicle("abc-12345", Color.BLACK, 50000, new Date());// up casting

		System.out.println(v1.equals(v2));// true => run time poly !
		String s="hello";
		System.out.println(v1.equals(s));

	}

}
