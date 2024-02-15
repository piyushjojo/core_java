package tester;

import inheritance.*;

public class Test2 {

	public static void main(String[] args) {
		// super cls ref , super cls object , sub cls ref , sub cls obj
		// create student object
		// Student type of ref ---> Student type of obj : DIRECT referencing
		Student s1 = new Student("Rama", "Kher", 2021, "PG-DAC", 123456, 80);// cls : Object , Person Student,String
		System.out.println(s1);// implicitly s1.toString()
		// Faculty ref --> Faculty obj : DIRECT referencing
		Faculty f1 = new Faculty("Rakesh", "Sharma", 10, "java,react,oracle");
		System.out.println(f1);// implicitly f1.toString() ???? HOW ??? Hint : java docs: PrintStream
		Person p;//
		System.out.println("details via indirect ref.");
		p = new Student("Rama1", "Kher1", 2021, "PG-DAC", 123456, 80);// up casting : since Student IS-A Person
		System.out.println(p);// JVM will invoke toString method on : Student => run time poly.
		p = f1;// are there any objs for GC ? 1 : student "Rama1", "Kher1", 2021, "PG-DAC",
				// 123456, 80
		System.out.println(p);
		// IMPORTANT : javac resolves the method binding by type of reference BUT JVM
		// resolves it by type of the instance it's referring to.
		Object o;// o: Object (ref)
		o=s1;//up casting : Student IS-A Person ---IS-A Object
		System.out.println(o);//toString of Student : run time poly.
		o=f1;
		System.out.println(o);//toString of Faculty : : run time poly.
		
	}

}
