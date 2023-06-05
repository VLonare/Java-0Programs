package strings;

public class String1 
{

	public static void main(String[] args) 
	{
		String s1 = new String("Qspiders");
		System.out.println(s1);
		
		char ch[] = {'a', 'b', 'c'};
		String s2 = new String(ch);
		System.out.println(s2);
		
		String s3 = new String("Qspiders");
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
	
}
