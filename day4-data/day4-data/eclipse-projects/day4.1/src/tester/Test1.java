package tester;

import inheritance.*;

public class Test1 {

	public static void main(String[] args) {
		// create student object
		Student s1 = new Student("Rama", "Kher", 2021, "PG-DAC", 123456, 80);//cls : Object , Person Student,String
		System.out.println(s1);//implicitly s1.toString()
		Faculty f1=new Faculty("Rakesh", "Sharma", 10, "java,react,oracle");
		System.out.println(f1);//implicitly f1.toString() ???? HOW ??? Hint : java docs: PrintStream
	}

}
