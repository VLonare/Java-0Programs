package practice;

import java.util.Scanner;
public class FirstDigit {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter a number to extract the first digit of it.");
		int num=x.nextInt();
		
		while (num>=10) {
			num/=10;
		}
		System.out.println(num);
	}
}
