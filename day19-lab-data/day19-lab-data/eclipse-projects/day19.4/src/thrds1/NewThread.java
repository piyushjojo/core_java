package thrds1;

public class NewThread extends Thread {
	public NewThread(String thrdName) {
		super(thrdName);// state : NEW => ONLY thread class instance created in obj heap , BUT NO
						// separate flow of exec has started yet!!!
	start();// invoking inherited(from Thread class) start() ---> JVM run() on a separate
				// thrd.
	//	run(); chk what will happen ?
		System.out.println("in ctor invoked by : " + Thread.currentThread());//main thrd
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println("started " + Thread.currentThread().getName());
		// B.L
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("executed by " + Thread.currentThread().getName() + " exec count " + i);
				Thread.sleep(400);
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over ...");

	}

}
