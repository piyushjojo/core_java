package tester;

import static utils.CollectionUtils.populateData;
import static utils.CollectionUtils.populateMapFromList;

import java.util.Map;
import java.util.OptionalDouble;

import com.app.core.Category;
import com.app.core.Product;

public class Test10 {

	public static void main(String[] args) {
		// 9. Display average of product prices , having products with price > 450
//		I/P threshold price
//		o/p average
		double price = 350;
		Map<Integer, Product> products = populateMapFromList(populateData());
		System.out.println("Product details");
		products.forEach((k, v) -> System.out.println(v));
		 products.values().stream().filter(p -> p.getPrice() > price)
				.mapToDouble(Product::getPrice).average().ifPresent(System.out::println);
		

	}

}
