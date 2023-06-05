package strings;

public class StringClassMethods 
{

	public static void main(String[] args) 
	{
		String s1 = "Aeroplane";
		
		System.out.println(s1.charAt(4));
		System.out.println(s1.compareTo("Aeroplane"));
		System.out.println(s1.compareToIgnoreCase("aeroplane"));
		System.out.println(s1.concat("Air India"));
		System.out.println(s1.contains("plane"));
		System.out.println(s1.endsWith("ane"));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('e', 2));
		System.out.println(s1.indexOf("ero"));
		System.out.println("banana".indexOf("na", 3));
		System.out.println("".isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.replace("planet", "space"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(2,6));
		
		char ch [] = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("Qspiders".toLowerCase());
		System.out.println("Qspiders".toUpperCase());
		System.out.println(" Jspiders".trim());
	}
	
}
