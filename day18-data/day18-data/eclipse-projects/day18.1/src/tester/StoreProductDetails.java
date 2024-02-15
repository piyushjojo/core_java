package tester;

import java.util.Scanner;
import static utils.IOUtils.storeProductDetails;
import static utils.CollectionUtils.*;

public class StoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			// get populated sample data(map) --sort --store it
			storeProductDetails(sortProductsDescPrice(populateMapFromList(populateData())), sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
