package com.revature.model;

public class Mobile {
	private String model;
	private String company;
	private String cost ;
	private String madein="INDIA";

	public Mobile(String model, String company, String cost) {
		super();
		this.model = model;
		this.company = company;
		this.cost = cost;
	}
	public Mobile() {
		super();
	}
	public String getModel() {
		return model;
	}
	public void setModel(String string) {
		this.model = string;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", company=" + company + ", cost=" + cost + ", madein=" + madein + "]";
	}
	

}
