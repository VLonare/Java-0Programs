package inheritance;

public class Fruit {
	String name;
	String color;
	int wt;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	Fruit(String name, String color, int wt)
	{
		super();
		System.out.println("Fruit Started");
		this.name=name;
		this.color=color;
		this.wt=wt;
		System.out.println("Fruit Ended");
	}
	
	public void dispFruit()
	{
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Weight: "+wt);
	}
}
