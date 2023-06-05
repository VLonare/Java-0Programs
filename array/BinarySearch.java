package array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ip[] = {5,16,19,25,52,93,150,310};
		
		System.out.println("Enter key to find:");
		int key = sc.nextInt();
		
		int start=0, end=ip.length-1;
		int mid=(start+end)/2;
		boolean found = false;
		
		for (int i = 0; i < ip.length; i++) {
			if (key==ip[mid]) {
				found=true;
				break;
			}
			else if (key>ip[mid]) {
				start=mid+1;
			}
			else if (key<ip[mid]) {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		
		if(found==true) {
			System.out.println("Key found at "+(mid+1)+" position.");
		}
		else if (found==false) {
			System.out.println("Element not found.");
		}
	}
	
}
