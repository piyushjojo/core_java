package p1;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) throws Exception {
		
		Class<Emp> empClass = Emp.class;
		//invoking def constr of emp class
		System.out.println("Invoking def constr of Emp class");
		Emp e = empClass.getConstructor().newInstance();
		System.out.println(e);//toString
		System.out.println("Invoking parameterized constr of Emp class : Emp(String name, double salary)");
		//get required constr object
		Constructor<Emp> constructor = empClass.getConstructor(String.class,double.class);
		Emp e2= constructor.newInstance("Madhura",12345.67);
		System.out.println(e2);
		System.out.println("Dynamic method invocation of a private method");
		//get required private method object
		Method updateMethod = empClass.getDeclaredMethod("updateSalary",double.class);
		//enable permission
		updateMethod.setAccessible(true);
		//dyn method invocation
		updateMethod.invoke(e2, 500);
		System.out.println(e2);
		//how to create array dynamically using reflection
		//doubl[] : size 10
		double[] doubles=(double[])Array.newInstance(double.class, 10);
		System.out.println(Arrays.toString(doubles));
		for(int i=0;i<doubles.length;i++)
			Array.setDouble(doubles, i, i/2);
		System.out.println(Arrays.toString(doubles));
		
	}

}
