/*WAJP to print second smallest element of an array.*/
package array;

public class SecondSmallest {

	public static void main(String[] args) 
	{
		int a[] = {32,54,78,55,65,4,56,45,25,54};
		
		int min=a[0];
		int secmin=a[1];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<min) 
			{
				secmin = min;
				min = a[i];
			}
			
			else if (a[i]<secmin && a[i]!=min) 
			{
				secmin=a[i];
			}
		}
		
		System.out.println("Second Min. Element: "+secmin);
	}
	
}
