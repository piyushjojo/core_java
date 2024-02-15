package p6;

public class TestExc {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		System.out.println("res=" + (a / b));// JVM throws a run time err : creates exc class
												// instance(java.lang.ArithmeticExc) n fires exc
		System.out.println("main over....");

	}

}
