package ArrayList;

public class Books {

	String name;
	int id;
	double price;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
	public int compareTo(Object o)
	{
		Books b1 = (Books) o;
		if (this.price>b1.price) {
			return 1;
		}
		else if (this.price<b1.price) {
			return -1;
		}
		return 0;
	}
	
}
