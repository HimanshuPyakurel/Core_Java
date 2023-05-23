package ObjectWithArray;

import java.util.Scanner;

public class Product_Test {
	public static void main(String[] args) {
	
		// WAP to store and print data of 5 products
		
		Product[] products = new Product[5];
		Scanner sc = new Scanner(System.in);
		
		//Store product in array
		
		for(int i=0; i<5; i++) {
		
			Product p = new Product();
			
			System.out.println("Enter Id : ");
			p.setId(sc.nextInt());
			
			System.out.println("Enter Product Name : ");
			p.setName(sc.next());
			
			System.out.println("Enter Product Price : ");
			p.setPrice(sc.nextInt());
			
			System.out.println("Enter Company Name : ");
			p.setCompany(sc.next());
			 
			System.out.println(" ");
			
			products[i] = p;

		}
		
		//Store product in array
		
		for(Product p : products) {
			System.out.println(p);
		}
		
		
	}
}
