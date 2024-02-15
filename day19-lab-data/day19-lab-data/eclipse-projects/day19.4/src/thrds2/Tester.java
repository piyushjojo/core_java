package thrds2;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());// Thread : main , 5 ,main
		// create a runnable task instance
		RunnableTask task = new RunnableTask();
		// Attach a thrd to the runnable task
		// Thread(Runnable task , String name)
		Thread t1 = new Thread(task, "one");
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");
		Thread t4 = new Thread(task, "four");// NEW : 4 , Runnable : 1
		t1.start();
		t2.start();
		t3.start();
		t4.start();//Runnable : 1 (parent : main ), 4 : child thrds

		System.out.println("main exec some B.L ");
		for (int i = 0; i < 10; i++) {
			System.out.println("executed by " + Thread.currentThread().getName() + " exec count " + i);
			Thread.sleep(1000);
		}
		System.out.println("main over....");

	}

}
