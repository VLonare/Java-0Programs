package practice;

import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number of fibonacci series you want to print.");
		
		int find =sc.nextInt();
		int n1=0, n2=1, n3;
		for (int i = 0; i < find; i++) {
			n3= n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;

		}
		
	}
}
