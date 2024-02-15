package ser_deser_io;

import java.util.Scanner;
import static utils.CollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

public class StoreProductDetails {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name , for storing product details");
			storeProductDetails(populateMapFromList(populateData()), sc.nextLine());
			System.out.println("product details stored....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
