package relationships;

public class Computer {
	String brand;
	double price;
	String os;
	int ram;
	int hd;
	String color;
	Pendrive p1;

	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	Computer(String brand, double cost, String os, int ram, int hd, String color)
	{
		this.brand=brand;
		this.color=color;
		this.hd=hd;
		this.os=os;
		price=cost;
		this.ram=ram;
	}
	
	public void insertPendrive(String brand, double price, double memory, String type, String version)
	{
		p1=new Pendrive(brand, price, memory, type, version);
		System.out.println("Pendrive Inserted");
	}
	
	public void displayComputer()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("RAM: "+ram+" GB");
		System.out.println("HD: "+hd+" GB");
		System.out.println("Operating System: "+os);
		System.out.println("Price: "+price+" INR");
		System.out.println("=================================");
	}
}
