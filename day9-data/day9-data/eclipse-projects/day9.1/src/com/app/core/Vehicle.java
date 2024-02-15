package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Accept vehicle details : chasisNo(string) : unique: PK, color(string) , price(double) , manufactureDate(Date)
 */
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	private Date manufactureDate;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Vehicle(String chasisNo, Color color, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price + color.getAdditionalCost();
		this.manufactureDate = manufactureDate;
	}
	//add overloaded ctor to wrap PK
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + "]";
	}

	


	// simply override equals method inherited from Object class : to replace ref
	// equality by content equality (PK)
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals");
		if (o instanceof Vehicle) {
			Vehicle v=(Vehicle)o;
			return this.chasisNo.equals(v.chasisNo); //&& manufactureDate.equals(v.manufactureDate);
		}
		//=> o IS NOT a Vehicle
		return false;
	}

}
