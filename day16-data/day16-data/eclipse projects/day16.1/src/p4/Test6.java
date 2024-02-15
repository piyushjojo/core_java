package p4;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test6 {

	public static void main(String[] args) {
		// get populated list of products
		List<Product> list = populateData();
		// pure FP style
		System.out.println("Orig Product list :in declarative / FP style");
		list.forEach(p -> System.out.println(p));
		//display list of products sorted by it's manufacture date
		//higher order func : sort
		String s="fdgbsfd";//string literal
		int data=12345;//int literal
		//function literal 
		Comparator<Product> productComp=(p1,p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
		Collections.sort(list,productComp);
		System.out.println("Sorted  Product list :in declarative / FP style");
		list.forEach(p -> System.out.println(p));


	}

}
