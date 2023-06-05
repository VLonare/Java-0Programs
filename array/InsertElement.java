/*WAJP to insert an element in an array.*/
package array;

import java.util.Scanner;
public class InsertElement 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Enter value to be inserted: ");
		int value = sc.nextInt();
		System.out.println("Enter position for insertion:");
		int pos = sc.nextInt();
		
		int res[] = new int[a.length+1];
		
		for (int i = 0; i < res.length; i++) 
		{
			if (i<pos) 
			{
				res[i] = a[i];
			}
			else if (i==pos) 
			{
				res[i] = value;
			}	
			else 
			{
				res[i] = a[i-1];
			}
		}
		
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(res[i]+" ");
		}
	}
	
}
