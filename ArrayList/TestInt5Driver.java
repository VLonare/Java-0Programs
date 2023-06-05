package ArrayList;

public class TestInt5Driver 
{
	public static void main(String[] args) 
	{
		TestInt5 a1 = (x, y) -> x+y;
		
		System.out.println(a1.add(12, 3));
		
		TestInt5 a2 = (a, b) -> a*b;
		
		System.out.println(a2.add(6, 3));
	}
}
