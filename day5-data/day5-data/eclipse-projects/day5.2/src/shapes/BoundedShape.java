package shapes;

public class BoundedShape /* extends Object */{
	private int x,y;
	public BoundedShape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString()
	{
		return "x="+x+" y="+y;
	}
	//to avoid extra instanceof chking n down casting : add common area() in the super class
	public double area()
	{
		return -100;
	}
}
