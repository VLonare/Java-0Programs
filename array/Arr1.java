package array;

public class Arr1 {

	public static void main(String[] args) {
		String s[] = new String[5];
		s[0] = "India";
		s[1] = "Nepal";
		s[2] = "UAE";
		s[3] = "USA";
		s[4] = "Bhutan";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		
		for (int i = 0; i <s.length; i++) 
		{
			System.out.println(s[i]);
		}
		
		 for ( int j=s.length-1; j>=0; j-- )
		 {
			 System.out.println(s[j]);
		 }
	}
	
}
