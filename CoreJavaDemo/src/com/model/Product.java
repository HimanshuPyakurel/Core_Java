package com.model;

public class Product {
	
	private int id;
	private String name;
	private String company;
	private int price;
	
	//default constructor
	public Product() {} 
	
	//Parameterized constructor
	public Product(int id, String name, String company, int price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//to stringS
	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
	
	

}
