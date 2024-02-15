package itc_with_wait_notify;

public class EmpUtils {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		while (dataReady)
			wait();//p : Blocked on wait : outside mon.
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		dataReady = true;
		notify();//un blocking trigger for the consumer thrd which is blocked on wait , on the same obj's monitor
	}// lock released --p --> runnable

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while (!dataReady) //till the time data is NOT rdy , block!
			wait();//c : Blocked on wait : outside mon.
		// consume data
		System.out.println("Read  Data " + e);
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		notify();//un blocking trigger for the producer thrd which is blocked on wait , on the same obj's monitor
		return e;
	}// lock released --c --> runnable

}
