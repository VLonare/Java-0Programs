/*WAJP to print how many times given number is repeated */
package array;

import java.util.Scanner;

public class CountElement {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int size=x.nextInt();
		
		int ar1[] = new int[size];
		
		System.out.println("Enter the elements of an array:");
		
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]= x.nextInt();
		}
		
		System.out.println("Enter the element to be found:");
		int key=x.nextInt();
		
		int count=0;
		
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i]==key) {
				count++;
			}
		}
		
		if (count==0) {
			System.out.println("Element not found!");
		}
		else {
			System.out.println("Element found "+count+" times.");
		}
	}
	
}
