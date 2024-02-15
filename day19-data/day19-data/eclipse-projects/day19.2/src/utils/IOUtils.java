package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface IOUtils {
	//add a static method for de-serial.
	static Object restoreProducts(String fileName) throws IOException, ClassNotFoundException
	{
		//file validation
		File f1=new File(fileName);
		if(f1.isFile() && f1.canRead())
		{
			//valid file --> attach i/o strms for de-serial
			try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(f1)))
			{
				return in.readObject();//de serial
			}
		}
		System.out.println("Invalid file name or file doesn't exist !!!!!!!!!!!!!!!!!");
		return null;
	}

}
