package Constructor;

public class User {
	

	//Instance variable or Object ko variable
	String username;
	String password;
	
	//================== Default Constructor =================
	
//	User(){
//	
//		username = "test";
//		password = "1234";
//	}
	
	
	//================== Parameterized Constructor ===============
	
	User(String username, String password){
		
		
		//this();                 // calling default constructor
		//this("ram","23132");    // calling parameterized constructor
		
		
		this.username=username;
		this.password=password;
		
		
		//this.print(); 		 // Instance method calling
		
		/*
		 *   # 'this' keyword represents current object
		 *   # we can call instance variable, methods and constructor using
		 *     'this' keyword
		 */
	
		
	}
	
	
	void print(){
		System.out.println("Username = "+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
		User u=new User("ram", "999");
		
		u.print();
	
		
	}
	
	
}
