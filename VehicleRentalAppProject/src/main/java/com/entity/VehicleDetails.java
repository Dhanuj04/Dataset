package com.entity;

public class VehicleDetails {
	
	private String RegNo;
	private String Category;
	private String Manufacturer;
	private double DRent;
	private float Mileage;
	private String FType;
	private String descp;
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public double getDRent() {
		return DRent;
	}
	public void setDRent(double dRent) {
		DRent = dRent;
	}
	public float getMileage() {
		return Mileage;
	}
	public void setMileage(float mileage) {
		Mileage = mileage;
	}
	public String getFType() {
		return FType;
	}
	public void setFType(String fType) {
		FType = fType;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public VehicleDetails(String regNo, String category, String manufacturer, double dRent, float mileage, String fType,
			String descp) {
		super();
		RegNo = regNo;
		Category = category;
		Manufacturer = manufacturer;
		DRent = dRent;
		Mileage = mileage;
		FType = fType;
		this.descp = descp;
	}
	

		
	
	@Override
	public String toString() {
		return "VehicleDetails [RegNo=" + RegNo + ", Category=" + Category + ", Manufacturer=" + Manufacturer
				+ ", DRent=" + DRent + ", Mileage=" + Mileage + ", FType=" + FType + ", descp=" + descp + "]";
		
	}
	
	

}
