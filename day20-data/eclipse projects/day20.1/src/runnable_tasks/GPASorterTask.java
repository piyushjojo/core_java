package runnable_tasks;

import java.io.IOException;
import java.util.Map;
import static utils.IOUtils.storeStudentDetails;
import static utils.StudentCollectionUtils.sortStudentsByGPA;

import com.app.core.Student;

public class GPASorterTask implements Runnable {
	//state
	private Map<String, Student> studentMap;
	private String fileName;
	
	

	public GPASorterTask(Map<String, Student> studentMap, String fileName) {
		super();
		this.studentMap = studentMap;
		this.fileName = fileName;
		System.out.println("in ctor of "+getClass()+" invoked by "+Thread.currentThread());
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" strted");
		try {
			storeStudentDetails(fileName,sortStudentsByGPA(studentMap));
			System.out.println("sorting n storing done....");
		} catch (Exception e) {
			System.out.println(Thread.currentThread()+" got err "+e);
		}
		System.out.println(Thread.currentThread()+" over");

	}

}
