package Abstraction;

public class UserServiceImpl implements UserService{

	@Override
	public void update() {
		
	}
	
	
	@Override
	public void addUser() {
		System.out.println("Add Success");
	}

	@Override
	public void deleteUser() {
		System.out.println("Delete Sucess");
	}

	@Override
	public void print() {
		System.out.println("...Printing...");
	}

	
}
