class Box
{
 //tight encapsulation 
 private double width,depth,height;
 //add a parameterized ctor to init complete state of the Box
 Box(double width,double d,double height)
 {
	  this.width=width;//this : mandatory
	  this.depth=d;//this  : optional
	  this.height=height;//this : mandatory	  
 }
 //Add a non static method  to return Box details in String form (dimensions of Box)
 String getBoxDims()
 {
	  return "Box dims w="+this.width+" d="+this.depth+" h="+this.height;	  
 }
 //add non static method to ret computed volume of the box
 double getVolume()
 { 
  return width*depth*height;//javac impl adds : this 
 } 
}