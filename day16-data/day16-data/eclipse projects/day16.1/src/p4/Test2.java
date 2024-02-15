package p4;
import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.function.Consumer;

import com.app.core.Product;
public class Test2 {

	public static void main(String[] args) {
		// get populated list of products
		List<Product> list = populateData();
		System.out.println("Product list :in  imperative style");
		for(Product p : list)
			System.out.println(p);
		//API of Iterable : public void forEach(Consumer<? super T> consumer)
		//ano inner cls
		//Is List Iterable ? YES
//		list.forEach(new Consumer<Product>() {
//
//			@Override
//			public void accept(Product t) {
//				System.out.println(t);
//				
//			}
//			
//		});
		//pure FP style 
		System.out.println("Product list :in declarative / FP style");
		list.forEach(p -> System.out.println(p));
		

	}

}
