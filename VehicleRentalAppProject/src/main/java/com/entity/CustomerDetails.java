package com.entity;

public class CustomerDetails {

	private int CID;
	private String Cname;
	private String VCategory;
	private String VRegNo;
	private String FDate;
	private String TDate;
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getVCategory() {
		return VCategory;
	}
	public void setVCategory(String vCategory) {
		VCategory = vCategory;
	}
	public String getVRegNo() {
		return VRegNo;
	}
	public void setVRegNo(String vRegNo) {
		VRegNo = vRegNo;
	}
	public String getFDate() {
		return FDate;
	}
	public void setFDate(String fDate) {
		FDate = fDate;
	}
	public String getTDate() {
		return TDate;
	}
	public void setTDate(String tDate) {
		TDate = tDate;
	}
	public CustomerDetails(int cID, String cname, String vCategory, String vRegNo, String fDate, String tDate) {
		super();
		CID = cID;
		Cname = cname;
		VCategory = vCategory;
		VRegNo = vRegNo;
		FDate = fDate;
		TDate = tDate;
	}
	
	
}
