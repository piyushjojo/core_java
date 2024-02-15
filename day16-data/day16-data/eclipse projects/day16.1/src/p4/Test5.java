package p4;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.List;

import com.app.core.Product;

public class Test5 {

	public static void main(String[] args) {
		// get populated list of products
		List<Product> list = populateData();
		// pure FP style
		System.out.println("Orig Product list :in declarative / FP style");
		list.forEach(p -> System.out.println(p));
		//display list of products sorted by it's manufacture date
		//higher order func : sort
		Collections.sort(list,(p1,p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		System.out.println("Sorted  Product list :in declarative / FP style");
		list.forEach(p -> System.out.println(p));


	}

}
