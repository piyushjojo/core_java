package bin_io;

import java.util.Scanner;
import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

public class StoreProductDetails {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter bin file name");
			//get populated map --store it in bin file
			storeProductDetails(populateMapFromList(populateData()),sc.nextLine());
			System.out.println("data stored....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
