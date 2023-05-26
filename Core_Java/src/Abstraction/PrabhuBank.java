package Abstraction;

public class PrabhuBank extends CentralBank{

	@Override
	protected void getBankName() {
		System.out.println("Prabhu Bank");
	}

	@Override
	protected void getInterestRate() {
		System.out.println("20%");
	}
	
	

}
