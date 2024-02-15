package com.app.core;

public enum ServicePlan {
	SILVER(500), GOLD(1000), DIAMOND(1500), PLATINUM(2000);

	private int planCharges;

	private ServicePlan(int planCharges) {
		this.planCharges = planCharges;
	}
	
	public int getPlanCharges() {
		return planCharges;
	}

	@Override
	public String toString()
	{
		return name()+"@"+planCharges;
	}
}
