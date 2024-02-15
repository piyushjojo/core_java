package tester;
import static utils.CollectionUtils.*;

import java.util.Map;
import java.util.TreeMap;

import com.app.core.Product;

public class Test1 {

	public static void main(String[] args) {
		Map<Integer, Product> products = populateMapFromList(populateData());
		System.out.println("Products ");
		products.forEach((k,v) -> System.out.println(v));
		//sort the product details as per it's id
		//sorting criteria : key based : can be done with TreeMap
		System.out.println("Sorted Products  as per id");
		TreeMap<Integer, Product> sortedProducts=new TreeMap<>(products);
		sortedProducts.forEach((k,v) -> System.out.println(v));
		//sort the products as per manu. date
		//sorting criteria  : value based --is it possible to sort using a TreeMap ? NO
		//map --> Collection<Product> : values --> AL/LL --> sort
		//OR : FP 
		//Can u attach a stream DIRECTLY to a Map ? NO 
		//map --> collection : values --> stream() ---> Stream<Product> --sorted(Comparator<? super Product> p) --forEach
		System.out.println("Sorted Products  as per date");
		products.values() //Collection<Product>
		.stream() //Stream<Product> : unsorted 
		.sorted((p1,p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate())) // Stream<Product> : sorted 
		.forEach(p -> System.out.println(p));
		//lab work : sort the products as per date n price

	}

}
