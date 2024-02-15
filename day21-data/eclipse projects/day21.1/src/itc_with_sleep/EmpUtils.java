package itc_with_sleep;

public class EmpUtils {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		while (dataReady)
			Thread.sleep(30);// p : Blocked on sleep , inside the monitor
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		dataReady = true;

	}// lock released --p --> runnable

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while (!dataReady) //till the time data is NOT rdy , block!
			Thread.sleep(100);
		// consume data
		System.out.println("Read  Data " + e);
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		return e;
	}// lock released --c --> runnable

}
