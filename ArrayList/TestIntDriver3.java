package ArrayList;

public class TestIntDriver3 
{
	public static void main(String[] args) 
	{
		TestInt4 t1 = (int base, int raise) ->
		{
			int pow = 1;
			for (int i = 0; i < raise; i++) 
			{
				pow*=base;
			}
			return pow;
		};
		System.out.println(t1.power(5, 3));
	}
}
