package inheritance;

public class Student extends Person{
	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	public Student(String fn,String ln,int gradYear,String course,double courseFees,int marks)
	{
		
		super(fn,ln);//explictly calling immediate super cls'  MATCHING ctor
		System.out.println("in student");
		this.gradYear=gradYear;
		this.course=course;
		fees=courseFees;
		this.marks=marks;
		
	}
	//Are u happy inheriting Person's toString or do u want to modify it further? : modify
	@Override
	public String toString()
	{
		return "Student "+super.toString()+" graduated in "+gradYear+" course "+course+" fees "+fees+" marks "+marks;
	}

}
