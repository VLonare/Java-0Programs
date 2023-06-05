/*WAJP to check the given array is palindrome or not*/
package array;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int ar1 [] = new int[size];
		
		System.out.println("Enter the elements of array");
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]= sc.nextInt();
		}
		
		int res [] = new int[ar1.length];
		
		int j=res.length-1;
		for (int i = 0; i < res.length; i++) {
			res[i] = ar1[j];
			j--;
		}
		
		int count=0;
		for (int i = 0; i < res.length; i++) {
			if (ar1[i]==res[i]) {
				count++;
				
			}
		}
		
		if (count==res.length) {
			System.out.println("The array is palindrome array");
		}
		
		else {
			System.out.println("The array is not palindrome array");
		}
		
		
	}
	
}
