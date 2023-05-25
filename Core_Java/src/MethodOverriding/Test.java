package MethodOverriding;

public class Test {
	
	public static void main(String[] args) {
		
		//Static or early binding of object
		//Reference is only for NabilBank
		NabilBank nb = new NabilBank();
		nb.getBankName();
		nb.getInterestRate();
		
		
		//up-casting (child object is accessed through parent class)
		CentralBank b = new NabilBank();
		
	}
	
	
	//late or dynamic binding of object
	//Central bank ko reference usko ni aauna sakxa ya child ko ni aauna sakxa
	//run-time polymorphism
	
	void printBankInfo(CentralBank b) {	
		b.getBankName();
		b.getInterestRate();
	}
	
}
