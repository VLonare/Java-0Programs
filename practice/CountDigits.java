package practice;

import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter a number to print count of digits in it");
		int num=x.nextInt();
		int count =0;
		while (num!=0) {
			count++;
			num/=10;
			
		}
		System.out.println(count);
	}
}
