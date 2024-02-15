package tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.stream.Collectors;

import com.app.core.Student;

public class Test2 {

	public static void main(String[] args) {
		List<Student> list = populateList();
		System.out.println("Students : ");
		list.forEach(System.out::println);
		// Display hobbies of all students.
		System.out.println("Hobbies : ");
		list.stream() //Stream<Student>
		.flatMap(s -> s.getHobbies().stream()) //1 ----> *
		.collect(Collectors.toSet())
		.forEach(System.out::println);
	}

}
