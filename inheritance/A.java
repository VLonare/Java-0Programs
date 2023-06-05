package inheritance;

public class A {

	int a; 
	
	public A() {
		// TODO Auto-generated constructor stub
	}
	
	A(int a)
	{
		System.out.println("From constructor A");
		this.a=a;
	}
	
	public void xyz()
	{
		System.out.println("From class A");
		System.out.println(a);
	}
}
