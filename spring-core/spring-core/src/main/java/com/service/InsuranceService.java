package com.service;

import insuranceModel.IRDA;

public class InsuranceService {
	
	private IRDA irda;
	
	InsuranceService()
	{
		System.out.println("Insurance-Service");
	}

	public IRDA getIrda() {
		return irda;
	}

	public void setIrda(IRDA irda) {
		this.irda = irda;
	}
	
	public double premiumValue(int age)
	{
		return irda.calculatePremium(age);
	}
	
	public void init()
	{
		System.out.println("Called before been initializes");
	}
	
	public void display()
	{
		System.out.println("Called after been initializes");
	}

}
