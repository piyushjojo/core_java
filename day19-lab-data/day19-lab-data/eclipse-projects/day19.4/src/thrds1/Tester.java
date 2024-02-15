package thrds1;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());//Thread : main , 5 ,main
		NewThread t1=new NewThread("one");
		NewThread t2=new NewThread("two");
		NewThread t3=new NewThread("three");
		NewThread t4=new NewThread("four"); // JVM : Runnable : 1(main) + 4(child)
		System.out.println("main exec some B.L ");
		for (int i = 0; i < 10; i++) {
			System.out.println("executed by " +Thread.currentThread().getName() + " exec count " + i);
			Thread.sleep(1000);
		}
		System.out.println("main over....");

	}

}
