/*WAJP to print maximum element of an array*/
package array;

public class Max 
{

	public static void main(String[] args) 
	{
		int a[] = {32,54,78,55,65,4,56,45,25,54};
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i]>max) {
				max = a[i];
			}
		}
		
		System.out.println("Maximum Element: "+max);
	}
	
}
