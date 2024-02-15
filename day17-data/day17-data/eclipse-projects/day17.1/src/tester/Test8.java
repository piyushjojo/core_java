package tester;
import static utils.CollectionUtils.*;

import java.util.Map;

import com.app.core.Category;
import com.app.core.Product;

public class Test8 {

	public static void main(String[] args) {
		/*
		 * 8. Display sum of product prices of a specific category. I/P category name
		 * Products are stored in a map o/p sum.
		 * 
		 */
		
		
		Category cat=Category.GRAINS;
		Map<Integer, Product> products = populateMapFromList(populateData());
		System.out.println("Product details");
		products.forEach((k,v)->System.out.println(v));
		System.out.println("Sum="+ products.values() //Collection<Product>
		.stream() //Stream<Product>
		.filter(p -> p.getProductCatgeory() == cat) // filtered Stream<Product>
		.mapToDouble(Product::getPrice) //DoubleStream --p -> p.getPrice()
		.sum());
		
		

	}

}
