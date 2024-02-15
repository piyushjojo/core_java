package utils;

import static com.app.core.Category.FRUITS;
import static com.app.core.Category.GRAINS;
import static com.app.core.Category.OIL;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.app.core.Product;

public interface CollectionUtils {
	static List<Product> populateData() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(100, "mango", FRUITS, parse("2019-01-01"), 500));
		products.add(new Product(10, "rice_bran", OIL, parse("2019-11-21"), 450));
		products.add(new Product(45, "sunflower", OIL, parse("2019-05-11"), 550));
		products.add(new Product(30, "rice", GRAINS, parse("2019-01-13"), 520));
		products.add(new Product(55, "orange", FRUITS, parse("2020-01-01"), 350));
		products.add(new Product(35, "wheat", GRAINS, parse("2018-07-11"), 700));
		return products;
	}

	// add a static method : which will copy refs from the List ---> Map
	static Map<Integer, Product> populateMapFromList(List<Product> list) {
		Map<Integer, Product> productMap = new LinkedHashMap<>();
		for (Product p : list)
			productMap.put(p.getId(), p);
		return productMap;
	}

	// add a static method : which will a accept un sorted , un ordered map of
	// products -- ret sorted ......
	static List<Product> sortProductsDescPrice(Map<Integer, Product> products) {
		// map (HM) --if u want to sort map as per the value based criteria(eg : price)
		// --can't use TreeMap
		// as TM uses N.O or Custom Order : BUT based upon Key!
		// Can u directly attach a Java 8 strm to a Map ? NO
		// map ---> collection of vals (values) --> stream() Stream<Product> --
		// sorted(Comparator) : Stream<P>--collect -> List
		Comparator<Product> comp=(p1,p2) ->((Double) p2.getPrice()).compareTo(p1.getPrice());
		return products.values().stream().sorted(comp).collect(Collectors.toList());

	}

}
