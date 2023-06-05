package ArrayList;

public class TestIntDriver2 
{
	public static void main(String[] args) 
	{
		TestInt3 t1 = (int num) ->
		{
			if (num%2==0) {
				System.out.println("Even.");
			}
			else 
			{
				System.out.println("Odd.");
			}
		};
		t1.even(78);
	}
}
