package exc_handling;

public class TestCheckedExc2 {

	public static void main(String[] args) throws InterruptedException{
		testMe();
		System.out.println("main cntd...");

	}

	private static void testMe() throws InterruptedException {
		System.out.println("Before");
		
			Thread.sleep(1000);//javac FORCES handling of CHECKED Excs
		
		System.out.println("After");
	}

}
