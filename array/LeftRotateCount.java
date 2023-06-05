/*WAJP to left rotate the array given number of times.*/
package array;

public class LeftRotateCount 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		
		int res[] = rotateLeft(a,3);
		
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] rotateLeft(int a[], int count)
	{
		for (int i = 0; i < count; i++) 
		{
			int first=a[0];
			
			for (int j = 1; j < a.length; j++) 
			{
				a[j-1] = a[j];
			}
			a[a.length-1] = first;
		}
		
		return a;
	}
	
}

