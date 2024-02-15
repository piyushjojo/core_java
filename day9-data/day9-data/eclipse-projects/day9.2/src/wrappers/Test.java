package wrappers;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// Integer i1=new Integer(1234);//boxing
		Integer i1 = Integer.valueOf(12345);// boxing
		int data = i1.intValue();// un boxing
		i1 = 100;// int ---> Integer : auto boxing
		data = i1;// auto un boxing
		Boolean flag = true;// auto boxing : done by javac
		String s = new String("123456");
//		s++;
		Date d1 = new Date();
//		d1 += 10;
		i1++;// auto un boxing --> int --> inc --> auto boxing
		System.out.println(i1);
		double d2 = 1200;// widening : auto promotion (int --> double)
		// Double d2=100;//int --> auto boxing --> Integer ---XXX---> Double
		Double d3 = (double) 100;// prog :byte/ int --> double , javac : auto boxing
		Number n = 123.456F;// float ---> Float (auto boxing) ----> Number (up casting)
		n = 124567;
		n = 123.34567;
		System.out.println(n.getClass());// java.lang.Double
		Object o = true;
		o = 123;
		o = new Date();
		System.out.println(o.getClass());
		// Is java purely object oriented ? NO
		// Can Object type of a reference , refer to any primitive type(auto boxing + up
		// casting) as well as ref type(up casting) ? YES

	}

}
