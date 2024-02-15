package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Product;

public interface IOUtils {
//add a static method , to store map of products in a file using  Serialization (java.io.ObjectOutputStream) = Conversion from state of the object to bun.
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException {
		// Java App ---> OOS --->bin strm (serialized bin strm) --> FOS ---> Bin File
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			//API public void writeObject(Object o) throws ...
			out.writeObject(map);
		}
	}
}
