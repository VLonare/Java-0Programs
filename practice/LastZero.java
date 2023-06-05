package practice;

import java.util.Scanner;
public class LastZero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rem;
			rem=num%10;
			if (rem==0) {
				System.out.println("The number has zero in its last digit.");
				
			}
			else {
				System.out.println("The number "+num+" does not have zero in its last digit.");
			
			}
			
	}
}
