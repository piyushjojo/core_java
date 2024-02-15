package p4;

import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.app.core.Category;
import com.app.core.Product;

public class Test10 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated list of products
			List<Product> list = populateData();
			// pure FP style
			System.out.println("Orig Product list :in declarative / FP style");
			list.stream().forEach(p -> System.out.println(p));//ordered o/p 
			System.out.println("---------------------------------");
			//Can you access the stream in a parallel manner w/o explicitly creating multiple thrds ?
			list.parallelStream()
			.forEach(p -> System.out.println(p));//un ordered o/p
		
		}

	}

}
