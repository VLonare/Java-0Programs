package Encapsulation;

public class Account {
	private String bank;
	private String type;
	private String name;
	private int accno;
	private String ifsc;
	private double balance;
	private int pin;
	
	public String getBank()
	{
		return bank;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAccno()
	{
		return accno;
	}
	
	public String getIfsc()
	{
		return ifsc;
	}
	
	public double getBalance(int acno, int pass)
	{
		if (accno==acno && pin==pass) {
			System.out.println("BALANCE: "+balance);
			return balance;
			
		}
		System.out.println("Incorrect Credentials!");
		return 0;
	}
	
	public double setBalance(int acno, int pass, double amt)
	{
		if (accno==acno && pin==pass) {
			System.out.println("Login Success!");
			if (balance-amt>=1000) {
				balance=balance-amt;
				System.out.println("Withdraw Success");
				System.out.println(balance);
				return balance;
			}
			else {
				System.out.println("Insufficient Balance!");
			}
		}
		else {
			System.out.println("Inavlid Credentials!");
		}
		return 0;
	}
	Account(){}
	Account(String name, String bank, int accno, String ifsc, String type, double balance, int pin)
	{
		this.accno=accno;
		this.balance=balance;
		this.bank=bank;
		this.ifsc=ifsc;
		this.name=name;
		this.pin=pin;
		this.type=type;
	}
	
	public void setPin(int acno, int old_pin, int new_pin)
	{
		if (acno==accno && old_pin==pin) {
			this.pin=new_pin;
			System.out.println("Pin Updated");
		}
		else {
			System.out.println("Invalid Credentials!");
		}
	}

}
