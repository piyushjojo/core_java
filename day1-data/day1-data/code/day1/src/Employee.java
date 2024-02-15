class Employee
{
  //to achieve tight encap : add private state
  //state = non static data members =instance variables
  //mem allocated on the heap .
  private int id;
  private String name;
  private double salary;
  /*
    public Employee()
	{}
  */
  //add parametrized ctor to init COMPLETE state of the object
  Employee(int empId,String name,double sal)
  {
	  this.id=empId;//empId : method local var, id : instance var.
	  ////using this : keyword : OPTIONAL
	//  name=name;//no javac err, no run time err , instance var name =null
	this.name=name;//using this : keyword : MANDATORY 
	  this.salary=sal;//using this : keyword : OPTIONAL  
  }
  //Add method getEmpDetails : to return string form of complete emp details
  String getEmpDetails()
  {
	  return "Emp Details : empid= "+this.id+" name "+this.name+" earning salary :"+this.salary;
  }

  
}