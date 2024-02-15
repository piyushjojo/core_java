package exc_handling;

public class TestUnchkedExc {

	public static void main(String[] args) {
		try {
			testMe();
			System.out.println("after method call");
		} catch (Exception e) {
			System.out.println("in catch-all");
	//		System.out.println(e.getMessage());
	//		System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("main cntd.....");

	}

	private static void testMe() {
		try {
			int a = 10;
			int b = 3;
			System.out.println("res=" + (a / b));// AE
			System.out.println("int value " + Integer.parseInt("12345"));// NFE
			String s = "afdgadf";
			System.out.println("char at index 0 " + s.charAt(0));// NPE
			String[] names = { "aa", "bb", "cc" };
			System.out.println(names[3]);// AOB
			System.out.println("end of try");
		} catch (ArithmeticException e) {
			System.out.println("1");
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println("2");
		}
		System.out.println("end of method");
	}
	
}
