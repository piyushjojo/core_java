package test_override1;
public class A {
	static void test() {
		System.out.println("in A's test");
	}
	public static void main(String[] args) {
		A b1=new B();
		b1.test(); // will be called as A.test()
		
		B b2 = new B();
		b2.test(); // // will be called as B.test()
	}
}
class B extends A {
	
	//@Override
	//static method can not be overridden
	//we cannot override static methods because 
	//method overriding is based on dynamic binding 
	//at runtime and the static methods are bonded 
	//using static binding at compile time.
	static void test() {
		System.out.println("in B's test");
	}
}
