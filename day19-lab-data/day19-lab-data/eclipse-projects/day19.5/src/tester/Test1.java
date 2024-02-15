package tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;

public class Test1 {

	public static void main(String[] args) {
		List<Student> list = populateList();
		System.out.println("Students : ");
		list.forEach(System.out::println);
		// Display phone nos of all students.
		System.out.println("Phone nos : ");
		list.stream() //Stream<Student>
		.map(s -> s.getAddress().getPhoneNo())
		.forEach(System.out::println);
		
	

	}

}
