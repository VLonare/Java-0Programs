package exceptions;

public class Exp5 
{
	
	public static void main(String[] args) {
		try 
		{
			div(10,0);
		} 
		catch (ArithmeticException a) 
		{
			System.out.println("We cannot divide a number by zero.");
		}
	}
	public static void div(int a, int b)
	{
		System.out.println(a/b);
	}
}
