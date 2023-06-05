package ArrayList;

public class Pen 
{
	String name;
	String color;
	double price;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
	public Pen(String name, String color, double price) 
	{
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Pen [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
