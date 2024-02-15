package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Student;

public interface IOUtils {
//add a static method to write list of sorted students to the text file , in buffered manner
	static void storeStudentDetails(String fileName, List<Student> students) throws IOException
	{
		//attach i/o streams : Java App ----> PW --> FW --> text file
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			students.forEach(pw::println);//s -> pw.println(s)
		}
		
	}
	
}
