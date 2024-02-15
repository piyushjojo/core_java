package runnable_tasks;

import com.app.banking.JointBankAccount;
import static java.lang.Thread.currentThread;

public class UpdaterTask implements Runnable {
	// state : shared a/c
	private JointBankAccount jointAccount;

	public UpdaterTask(JointBankAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(currentThread() + " strted");
		try {
			while(true)
			{
				synchronized (jointAccount) {
					jointAccount.updateBalance(5000);
				}
				
				Thread.sleep(234);
			}
		} catch (Exception e) {
			System.out.println(currentThread() + " got err " + e);
		}
		System.out.println(currentThread() + " over");

	}

}
