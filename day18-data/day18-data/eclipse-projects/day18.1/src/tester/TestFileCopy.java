package tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter src file n dest file names on 2 separate lines");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <---- FR <----- src text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				// Java App ---> PW ---> FW --> dest txt file
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(),true))) {
			//FP
			br.lines(). //src : Stream<String>
			forEach(pw :: println); //terminal op  line -> pw.println(line)
			System.out.println("file copy over....");

		} //pw.close , br.close , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
