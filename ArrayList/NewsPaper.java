package ArrayList;

import java.util.Arrays;

public class NewsPaper {

	String name;
	double price[];
	double sum=0;
	
	public NewsPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewsPaper(String name, double[] price) {
		super();
		this.name = name;
		this.price = price;
		sum=sumPrice(this.price);
	}

	public double sumPrice (double [] price)
	{
		public String toString() {
			return "[Name: "+name+", Price: "+price+"]";
		}
		
	}

	
	
}
