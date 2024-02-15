package com.app.core;

public enum Color {
	//set of related (RESTICTED) self typed constants
	//public static final Color WHITE,SILVER....
	WHITE(1000), SILVER(2000), BLACK(3000), GREY(2500), RED(3500);
	//state : non static data member
	private int additionalCost;	
	
	private Color(int additionalCost) {
		this.additionalCost = additionalCost;
	}

	public int getAdditionalCost() {
		return additionalCost;
	}

	@Override
	public String toString()
	{
		return name().toLowerCase()+"@"+additionalCost;
	}
}
