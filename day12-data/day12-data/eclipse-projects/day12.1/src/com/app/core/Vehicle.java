package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Accept vehicle details : chasisNo(string) : unique: PK, color(string) , price(double) , manufactureDate(Date)
 */
public class Vehicle implements Comparable<Vehicle> {
	private String chasisNo;
	private Color color;
	private double price;
	private Date manufactureDate;
	// explicit HAS-A relationship
	private DeliveryAddress address;
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

	// add overloaded ctor to wrap PK
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (address == null)
			sb.append(" Not yet Sold");
		else
			sb.append(" " + address);

		return "Vehicle chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + sb;
	}

	// simply override equals method inherited from Object class : to replace ref
	// equality by content equality (PK)
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals");
		if (o instanceof Vehicle) {
			Vehicle v = (Vehicle) o;
			return this.chasisNo.equals(v.chasisNo); // && manufactureDate.equals(v.manufactureDate);
		}
		// => o IS NOT a Vehicle
		return false;
	}

	@Override
	public int compareTo(Vehicle anotherVehicle) {
		System.out.println("in vehicle's compareTo ");
		return this.chasisNo.compareTo(anotherVehicle.chasisNo);// Invoking String class's compareTo : which is based
																// upon lexicographical comparison
	}

	// add a non static method , to assign delivery address to "this" vehicle
	public void assignDeliveryAddress(String city1, String state1, String country1, String zipCode1) {
//		System.out.println(city);
		this.address = new DeliveryAddress(city1, state1, country1, zipCode1);
		// System.out.println(address.city);
	}

	// add a setter for setting new price
	public void setPrice(double price) {
		this.price = price;
	}

	// add getter for color
	public Color getColor() {
		return color;
	}
	// add getter for delivery address

	public DeliveryAddress getAddress() {
		return address;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public double getPrice() {
		return price;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	// inner class : non static nested class
	// inner class begins
	public class DeliveryAddress {
		private String city;
		private String state;
		private String country;
		private String zipCode;

		public DeliveryAddress(String city, String state, String country, String zipCode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}

		@Override
		public String toString() {
			return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode="
					+ zipCode + "]";
		}
		// add a getter for city

		public String getCity() {
			return city;
		}

	}// inner class end

}
