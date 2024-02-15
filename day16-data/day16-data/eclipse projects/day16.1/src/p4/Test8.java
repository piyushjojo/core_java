package p4;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test8 {

	public static void main(String[] args) {
		// get populated list of products
		List<Product> list = populateData();
		// pure FP style
		System.out.println("Orig Product list :in declarative / FP style --using Func streams");
		//Collection i/f method : public default Stream<T> stream()
		list.stream() //Stream<Product>
		.forEach(p -> System.out.println(p));//terminal op.
		

	}

}
