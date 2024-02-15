package tester;

import com.app.banking.JointBankAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdaterTask;

public class TestSharedResource {

	public static void main(String[] args) {
		// create SINGLE joint a/c
		JointBankAccount acct=new JointBankAccount(10000);
		//create tasks --attach thrds --start the thrds
		Thread t1=new Thread(new UpdaterTask(acct), "c1");
		Thread t2=new Thread(new CheckBalanceTask(acct), "c2");//1 : runnable , cust1 ,cust2 : NEW
		t1.start();
		t2.start();//runnable : 3
		System.out.println("main waiting for child thrds to complete");
		System.out.println("main over!");
		

	}

}
