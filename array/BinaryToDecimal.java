package array;

public class BinaryToDecimal 
{

	public static void main(String[] args) 
	{
		int bin [] = {1,0,1,1,1,0,1,0,0,1};
		
		int dec=0;
		int raise = 0;
		
		for (int i = bin.length-1; i >=0; i--) 
		{
			dec = dec + (bin[i]*(int)(Math.pow(2, raise)));
			raise++;
		}
		
		System.out.println("Decimal equivalent of given array is: "+dec);
	}
	
}
