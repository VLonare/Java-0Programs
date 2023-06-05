/*WAJP to print minimum element of an array*/
package array;

public class Min 
{
	public static void main(String[] args) 
	{
		int a[] = {32,54,78,55,65,4,56,45,25,54};
		
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i]<min) {
				min = a[i];
			}
		}
		
		System.out.println("Minimum Element: "+min);
	}
}
