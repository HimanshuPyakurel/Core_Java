package oops;

public class Book {
	
	
	//Properties
	int id;
	String name;
	String author;
	int price;
	
	
	
	//Methods
	
	void PrintBook() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Book b = new Book();
		
		b.id =678;
		b.name = "Math";
		b.author= "Kandel Madam";
		b.price = 5000;
		
		b.PrintBook();
		System.out.println();
				
		b.id =121;
		b.name = "Biology";
		b.author= "Kandel miss";
		b.price = 5000;
		
		b.PrintBook();
	}
	
}
