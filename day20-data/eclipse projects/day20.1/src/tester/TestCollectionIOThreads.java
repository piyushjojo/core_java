package tester;
import static utils.StudentCollectionUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DobSorterTask;
import runnable_tasks.GPASorterTask;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			//get populated map from collection utils
			Map<String, Student> map = populateMap(populateList());
			System.out.println("Enter file name to store student details asorted as per DoB");
			String file1=sc.nextLine();
			System.out.println("Enter file name to store student details asorted as per GPA");
			String file2=sc.nextLine();
			//create task instance --attach a thrd to the task n start it !
			//Thread(Runnable task , String name)
			Thread t1=new Thread(new DobSorterTask(map, file1),"dob_sorter");
			Thread t2=new Thread(new GPASorterTask(map, file2),"gpa_sorter");
			//t1 , t2 : NEW , main : RUNNABLE
			t1.start();
			t2.start();
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();//main is Blocked on join for t1's completion
			t2.join();//main is Blocked on join for t2's completion
			System.out.println("child thrds over....");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
		

	}

}
