package inheritance;

public class B extends A{

	double d;
	
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	B(double d, int a)
	{
		super(a);
		this.d=d;
	}
	
	public void abc()
	{
		System.out.println("From class B");
		System.out.println(d);
		System.out.println(a);
	}
}
