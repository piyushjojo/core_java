package runnable_tasks;

import com.app.banking.JointBankAccount;
import static java.lang.Thread.currentThread;

public class CheckBalanceTask implements Runnable {
	// state : shared a/c
	private JointBankAccount jointAccount;

	public CheckBalanceTask(JointBankAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(currentThread() + " strted");
		try {
			while (true) {
				synchronized (jointAccount) {
					double balance = jointAccount.checkBalance();
					if (balance != 10000) {
						System.out.println("ERROR , INVALID BALANCE!!!!!!!!!!!!!!!!!!!!!!!!!!!");
						System.exit(-1);// JVM terminates over the err condition
					}
				}

				Thread.sleep(123);
			}
		} catch (Exception e) {
			System.out.println(currentThread() + " got err " + e);
		}
		System.out.println(currentThread() + " over");

	}

}
