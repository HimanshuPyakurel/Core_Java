package MethodOverriding;

public class NMB extends CentralBank{
	
	@Override
	protected void getBankName() {
		System.out.println("NMB Bank");
	}
	
	@Override
	protected void getInterestRate() {
		System.out.println("20%");
	}

}
