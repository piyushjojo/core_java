package shapes;

public class Rectangle extends BoundedShape {
	private double width, height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle "+super.toString()+"  [width=" + width + ", height=" + height + "]";
	}
	
	//add a method for computing the area of a rect
	public double area()
	{
		return width*height;
	}
	

}
