package Abstraction;

public class Test {
	
	public static void main(String[] args) {
	
		CentralBank b = new PrabhuBank();
		
		b.getBankName();
		b.getInterestRate();
		
	}
}
