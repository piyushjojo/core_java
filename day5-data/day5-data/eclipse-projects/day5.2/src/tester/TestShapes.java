package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestShapes {

	public static void main(String[] args) {
		BoundedShape[] shapes = /* new BoundedShape[] */ { new Circle(10, 20, 10.5), new Rectangle(30, 60, 10, 5.5) };// up
																														// casting
		// display details about the shapes + print area
		for (BoundedShape shape : shapes) {
			System.out.println(shape);//toString
			if (shape instanceof Circle) //area
				System.out.println(((Circle) shape).area());
			else
				System.out.println(((Rectangle) shape).area());
				
		}

	}

}
