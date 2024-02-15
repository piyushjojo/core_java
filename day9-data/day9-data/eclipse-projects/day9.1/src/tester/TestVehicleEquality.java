package tester;

import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestVehicleEquality {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("abc-12345",Color.BLACK, 50000, new Date());
		Vehicle v2=new Vehicle("abc-12345",Color.BLACK, 50000, new Date());
		System.out.println(v1==v2);//f
		System.out.println(v1.equals(v2));// true
		System.out.println(v1.hashCode()+" "+v2.hashCode());//different

	}

}
