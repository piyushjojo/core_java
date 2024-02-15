package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * 1. Accept name of the text file from user(scanner) . Read the data from the file , in a buffered manner, till EOF n display the same.
 */
public class TestBufferedFileRead {

	public static void main(String[] args) {
		System.out.println("Enter name of file (along with path)");
		try (Scanner sc = new Scanner(System.in);
				// Java App <-----BR <----FR(file) <----Text File
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			//read data from buffer of BR  till EOF
			String s=null;
			while((s=br.readLine()) != null)
				System.out.println(s);
			System.out.println("end of read....");				

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");
	}

}
