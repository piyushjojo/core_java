package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * 1. Accept name of the text file from user(scanner) . Read the data from the file , in a buffered manner, till EOF n display the same.
 * filter the lines < 40 char length --uppercase n display
 */
public class TestBufferedFileReadFP2 {

	public static void main(String[] args) {
		System.out.println("Enter name of file (along with path)");
		try (Scanner sc = new Scanner(System.in);
				// Java App <-----BR <----FR(file) <----Text File
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			//read data from buffer of BR  till EOF
			br.lines() //Stream<String> 
			.filter(line -> line.length() < 40)
			.map(String :: toUpperCase)
			.forEach(System.out::println);
			System.out.println("end of read....");				

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");
	}

}
