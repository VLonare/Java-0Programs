/*WAJP to print second largest element of an array.*/
package array;

public class SecondLargest 
{

	public static void main(String[] args) 
	{
		int a[] = {32,54,78,55,65,4,56,45,25,54};
		
		int max=a[0];
		int secmax=a[1];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>max) 
			{
				secmax = max;
				max = a[i];
			}
			
			else if (a[i]>secmax && a[i]!=max) 
			{
				secmax=a[i];
			}
		}
		
		System.out.println("Second Max. Element: "+secmax);
	}
}
