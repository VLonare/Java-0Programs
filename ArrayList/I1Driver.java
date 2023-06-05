package ArrayList;

public class I1Driver 
{
	public static void main(String[] args) 
	{
		I1 i = new I1() 
		{
			@Override
			public void a() 
			{
				System.out.println("From anonymous a()");		
			}
			@Override
			public void b() 
			{
				System.out.println("From anonymous b()");			
			}		
		};
		
		i.a();
		i.b();
		System.out.println(i);
		
	}
	
}
