package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Product;

import custom_exceptions.ProductHandlingException;

import static utils.IOUtils.*;

public class TestCollectionIO {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name for restoring products data");
			String fileName = sc.nextLine();
			// init phase of the app : restore the map (de-serial)
			Map<Integer, Product> map = restoreProducts(fileName);
			System.out.println("Products : ");
			//display the products
			map.forEach((k,v) -> System.out.println(v));
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1. Update product price 2.Remove a product 3.Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter product id n price offset");
						Product p = map.get(sc.nextInt());
						if (p == null)
							throw new ProductHandlingException("Invalid Product ID!!!!!!!!!!!!!");
						// valid product id
						p.setPrice(p.getPrice() + sc.nextDouble());
						System.out.println("Price updated for Product , with ID=" + p.getId());
						break;
					case 2:
						System.out.println("Enter product id");
						p = map.remove(sc.nextInt());
						if (p == null)
							throw new ProductHandlingException("Invalid Product ID, Can't remove Product!!!!!!");
						System.out.println("Removed Product : "+p);
						break;

					case 3:
						exit = true;
						storeProductDetails(map, fileName);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
