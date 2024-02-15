package thrds2;

public class RunnableTask implements Runnable {
	

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
