package Encapsulation;

public class AccountDriver {
	public static void main(String[] args) {
		Account a1= new Account("Raju", "ICICI", 123456, "ICI123", "Savings", 100000, 1234);
		a1.setBalance(123456, 1234, 5000.0);
		a1.setPin(123456, 1234, 5678);
		a1.setBalance(123456, 5678, 3500);
		
		a1.getBank();
		
		a1.getBalance(123456, 5678);
		
	}

}
