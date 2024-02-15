package com.app.core;

public class Emp {
	private String id;
	private String name;
	private double salary;
	public Emp(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	//PK of Emp : emp id (OR UID : emp id)
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp equals");
		if(o instanceof Emp)
		{
			Emp e=(Emp) o;
			return this.id.equals(e.id);
		}
		return false;
	}
	//MUST override the hashCode , to ensure that equal objects produce SAME value of the hashcode.
	@Override
	public int hashCode()
	{
		System.out.println("in emp's hashCode");
//		return 100;
		return id.hashCode();
		
	}
	

}
