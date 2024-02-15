package bin_io;

import java.util.LinkedHashSet;
import java.util.Scanner;

import com.app.core.Product;

import static utils.IOUtils.restoreProducts;

public class RestoreProductDetails {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter bin file name to restore product details");
			LinkedHashSet<Product> products = restoreProducts(sc.nextLine());
			if(products != null)
				products.forEach(System.out::println);
				
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
