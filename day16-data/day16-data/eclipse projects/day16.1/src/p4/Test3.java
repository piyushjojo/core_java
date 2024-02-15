package p4;

import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.app.core.Category;
import com.app.core.Product;

public class Test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated list of products
			List<Product> list = populateData();
			// pure FP style
			System.out.println("Orig Product list :in declarative / FP style");
			list.forEach(p -> System.out.println(p));
			// remove products of specified category from the underlying collection
			System.out.println("Enter product category");
			Category category=Category.valueOf(sc.next().toUpperCase());
			//Method of Collection i/f : public boolean removeIf(Predicate<? super T> filter)
			boolean removed=list.removeIf(p -> p.getProductCatgeory()==category);
			System.out.println("removed any products ? "+removed);
			System.out.println("List after removal");
			list.forEach(p -> System.out.println(p));
			
		}

	}

}
