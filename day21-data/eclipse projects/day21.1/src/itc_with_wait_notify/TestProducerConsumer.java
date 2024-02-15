package itc_with_wait_notify;

public class TestProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		EmpUtils u = new EmpUtils();
		String[] nms = { "Producer", "Consumer" };
		Consumer c1 = new Consumer(u);
		// Thread(Runnable inst,String nm)
		Thread t2 = new Thread(c1, nms[1]);// consumer thrd---new
		t2.start();// rdy pool
		Thread.sleep(10);
		// produce task ---thrd --strt
		Producer p1 = new Producer(u);// thrd doesn't exist
		// Thread(Runnable inst,String nm)
		Thread t1 = new Thread(p1, nms[0]);// new
		t1.start();// rdy
		
			// Thread.sleep(5);
		System.out.println("Press enter to exit");
		System.in.read();//main thrd Blocked on i/p
		p1.stop();
		c1.stop();
		System.out.println("main waiting for some time for the thrds to complete exec");
		t1.join(500);
		t2.join(400);
		System.out.println("main checking if thrds are still alive --yes --sending interrupt");
		if(t1.isAlive())
			t1.interrupt();//waiting thrd gets : InterruptedExc 
		if(t2.isAlive())
			t2.interrupt();//waiting thrd gets : InterruptedExc
		t1.join();
		t2.join();
		System.out.println("main over...");
	}

}
