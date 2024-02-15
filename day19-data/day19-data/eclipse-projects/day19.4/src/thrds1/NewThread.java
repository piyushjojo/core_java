package thrds1;

public class NewThread extends Thread {
	public NewThread(String thrdName) {
		super(thrdName);// state : NEW => ONLY thread class instance created in obj heap , BUT NO
						// separate flow of exec has statrted yet!!!
		start();// invoking inherited(from Thread class) start() ---> JVM run() on a separate
				// thrd.
		System.out.println("in ctor " + Thread.currentThread());
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println("started " + getName());
		// B.L
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("executed by " + getName() + " exec count " + i);
				Thread.sleep(400);
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + getName() + " err " + e);
		}
		System.out.println(getName() + " over ...");

	}

}
