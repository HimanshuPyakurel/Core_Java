package ObjectWithArray;

public class Product_Test {
	public static void main(String[] args) {
	
		// WAP to store and print data of 5 products
		
		Product[] products = new Product[5];
		
		//Store product in array
		
		for(int i=0;i<5;i++) {
		
			Product p = new Product();
			p.setId(444);
			p.setName("Mobile");
			p.setPrice(4000);
			p.setCompany("Samsung");
			
			products[i] = p;

		}
		
		//Store product in array
		
		for(Product p : products) {
			System.out.println(p);
		}
		
		
	}
}
