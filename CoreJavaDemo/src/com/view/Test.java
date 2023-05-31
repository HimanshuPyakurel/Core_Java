package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		add();
		getAll();
		delete();
		//display again after deletion
		getAll();
			
	}

	//add
	static void add() {
		
		ProductService ps = new ProductServiceImpl();
		char flag = 'y';
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter Id:");
			System.out.println("Enter Name:");
			
			Product p = new Product(sc.nextInt(), sc.next(),"Apple",200000); //constructor
			ps.addProduct(p);
			
			System.out.println("Do you want to add more [y/n] : ");
			flag = sc.next().charAt(0);
		
		}while(flag == 'y');
	}
	
		
	static void getAll() {
		
		ProductService ps = new ProductServiceImpl();
		
		List<Product> plist = ps.getAllProduct();
		
		System.out.println(plist);
		
	}
	
	static void delete() {
		
		ProductService ps = new ProductServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter index to delete product:");
		ps.deleteProduct(sc.nextInt());
	}
		
		
		
	
	
}
