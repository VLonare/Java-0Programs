package pack1;

public class A {

	private static int a = 10;
	private double d=122.12;
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println(a1.d);
		
		abc();
	}
	
	public static void abc()
	{
		System.out.println(a);
	}
	
}
