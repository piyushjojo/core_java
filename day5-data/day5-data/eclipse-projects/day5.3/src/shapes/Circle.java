package shapes;

import static java.lang.Math.PI;

public class Circle extends BoundedShape {
	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle " + super.toString() + " radius=" + this.radius;
	}

	// add a method for computing the area of a circle
	@Override
	public double area() {
		return PI * radius * radius;
	}
}
