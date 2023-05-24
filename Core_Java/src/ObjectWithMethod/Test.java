package ObjectWithMethod;

public class Test {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Account acnt = t.getAccountData();
		t.printAccountDetails(acnt);		
	}
	

 // =============== Object as parameter ==========================	
	
	void printAccountDetails(Account ac) {
		
		System.out.println("Account Number : "+ac.getNumber());
		System.out.println("Name : "+ac.getName());
		System.out.println("Balance : "+ac.getBalance());
		System.out.println("Type : "+ ac.getType());
		System.out.println("Bank Name : "+ac.getBankName());
			
	}


// ================ Object as return type ========================

	Account getAccountData() {
	
		Account a = new Account();
		
		a.setBalance(20);
		a.setName("Hp");
		a.setBankName("NIC");
		a.setType("Saving");
		a.setNumber(2321456);
		
		return a;
	}
	
}
