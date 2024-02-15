package test_static;

import java.util.Scanner;

import com.cdac.core.Box;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the box1 details ");
		Box b1 = new Box(sc.nextDouble() , sc.nextDouble() , sc.nextDouble());
		if(b1.getVolume()>= 100) {
			b1.setWidth(b1.getWidth() * 2 ); 
		}
		System.out.println(b1.getBoxDims());
		System.out.println(b1.getClass());
		sc.close();
	}

}
