package com.cdac.core;

public class Box {
	// tight encapsulation
	private double width, depth, height;

	// add a parameterized ctor to init complete state of the Box
	public Box(double width, double d, double height) {
		this.width = width;// this : mandatory
		this.depth = d;// this : optional
		this.height = height;// this : mandatory
	}

	// add overloaded ctor to init cube
	public Box(double side) {
		// width=depth=height=side;
		// ctor chaining
		// can u call another ctor of the same class from some other ctor ? YES :
		// this(....)
		this(side, side, side);
	}

	// add another overloaded ctor to create def inited box
	public Box() {
		// width=depth=height=-1;
		this(-1);
	}

	// Add a non static method to return Box details in String form (dimensions of
	// Box)
	public String getBoxDims() {
		return "Box dims w=" + this.width + " d=" + this.depth + " h=" + this.height;
	}

	// add non static method to ret computed volume of the box
	public double getVolume() {
		return width * depth * height;// javac impl adds : this
	}

	// add non static method to test equality of 2 boxes
	// In java : oass by value : this=b1 , anotherBox=b2
	public boolean isEqual(Box anotherBox) {
		System.out.println(this.hashCode() + " " + anotherBox.hashCode());
		return this.width == anotherBox.width 
				&& this.depth == anotherBox.depth && this.height == anotherBox.height;
	}
	//add non static method to create a new box with supplied offsets
	public Box createNewBox(double wOff,double dOff,double hOff)
	{
		Box tmp=new Box(this.width+wOff, this.depth+dOff, this.height+hOff);
		System.out.println("tmp's hash code "+tmp.hashCode());
		return tmp;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}