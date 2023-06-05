package array;

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter elements to the array:");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		
		int res[] = sort(a);
		
		System.out.println("The sorted array is: "+Arrays.toString(res));
	}
	
	public static int[] sort(int a[])
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if (a[j]>a[j+1]) 
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	
}
