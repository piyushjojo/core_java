package p4;

import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.app.core.Category;
import com.app.core.Product;

public class Test9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated list of products
			List<Product> list = populateData();
			// pure FP style
			System.out.println("Orig Product list :in declarative / FP style");
			list.forEach(p -> System.out.println(p));
			// remove products of specified category from the underlying collection
			System.out.println("Enter product category");
			Category category = Category.valueOf(sc.next().toUpperCase());
			System.out.println("List of products of a category "+category);
			// list ---> Stream<Product> : stream() -->filter ---> forEach
			list.stream() // Stream<Product> : all
					.filter(p -> p.getProductCatgeory() == category) // Stream<Product> : filtered products
					.forEach(p -> System.out.println(p));
			System.out.println("List contents again : ");
			//What will be o/p ?
			list.forEach(p -> System.out.println(p)); // all products or filtered ?

		}

	}

}
