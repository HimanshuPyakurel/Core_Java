package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_tbl")

public class Product {
	
	@Id 			 // PK -> primary key
	@GeneratedValue  // AI -> auto-increment
	private int id;
	
	private String name;
	private int price;
	private String company;
	
	// getter and setter
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// To string
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company + "]";
	}
	
	
	
}
