/*WAJP to right rotate the array given number of times.*/
package array;

import java.util.Scanner;
public class RightRotateCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size  = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the elements to the array:");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter how many times you want to rotate the array");
		int count= sc.nextInt();
		
		int res[] = rotate(a,count);
		
		System.out.println("The rotated array is:");
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
	}

	public static int[] rotate(int a[], int count)
	{
		for (int i = 0; i < count; i++) {
			int temp = a[a.length-1];
			for (int j =a.length-1; j>0 ; j--) {
				a[j] = a[j-1];
			}
			a[0] = temp;
		}
		return a;
	}
	
}
