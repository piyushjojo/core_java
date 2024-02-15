package exc_handling;

public class TestCheckedExc {

	public static void main(String[] args) {
		testMe();
		System.out.println("main cntd...");

	}

	private static void testMe() {
		System.out.println("Before");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("in IE");
		}
		System.out.println("After");
	}

}
