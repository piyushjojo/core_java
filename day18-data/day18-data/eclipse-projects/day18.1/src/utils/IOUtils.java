package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Product;

public interface IOUtils {
//add a static to store sorted product details in a text file using buffering
	static void storeProductDetails(List<Product> productList, String fileName) throws IOException {
		// attach i/o streams
		// Java App ---> PW ---> FW ---> Text File
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			productList.forEach(pw::println);// p -> pw.println(p)
		}//pw.close
	}
}
