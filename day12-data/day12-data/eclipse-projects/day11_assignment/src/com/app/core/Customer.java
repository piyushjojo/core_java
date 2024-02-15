package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

//id(int) name(string),email(string),password(string),registrationAmount(double),dob(Date),
//type (ServicePlan : enum)
public class Customer {
	private int id;
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	private ServicePlan plan;
	//automatic id generation : using static counter
	public static int idCounter;
	//add SDF for parsing n formatting
	public static SimpleDateFormat sdf;
	static  {
		idCounter=1;
		sdf=new SimpleDateFormat("dd-MM-yyyy");		
	}
	//ctor : required args constr
	public Customer(String name, String email, String password, double regAmount, Date dob, ServicePlan plan) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
		this.id=idCounter++;
	}
	//ctor required to wrap PK fields
	public Customer(String email, Date dob) {
		super();
		this.email = email;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", regAmount=" + regAmount + ", dob="
				+sdf.format(dob) + ", plan=" + plan + "]";
	}
	//override inherited equals from Object class : to replace ref equality by PK based equality
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in cust equals");
		if(o instanceof Customer)
		{
			Customer c=(Customer)o;
			return this.email.equals(c.email) && this.dob.equals(c.dob);
		}
		return false;
		
	}
	
}
