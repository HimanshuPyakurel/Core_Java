package Abstraction;

public class InterfaceTest {
	public static void main(String[] args) {
		
		UserService us = new UserServiceImpl();
		us.addUser();
		us.deleteUser();
	    us.print();
		
	}

}
