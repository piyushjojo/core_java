package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * 1. Accept name of the text file from user(scanner) . Read the data from the file , in a buffered manner, till EOF n display the same.
 * filter the lines contianing a keyword "Vehicle" -- store them in a list
 */
public class TestBufferedFileReadFP3 {

	public static void main(String[] args) {
		System.out.println("Enter name of file (along with path)");
		try (Scanner sc = new Scanner(System.in);
				// Java App <-----BR <----FR(file) <----Text File
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			//read data from buffer of BR  till EOF
			List<String> collect = br.lines() //Stream<String> 
			.filter(s -> s.contains("Vehicle"))
			.collect(Collectors.toList());
			collect.forEach(System.out::println);
			System.out.println("end of read....");				

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");
	}

}
