package practice;

import java.util.Scanner;
public class Trial {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = x.nextInt();
		
		String res= num>0?"Positive":"Negative";
		
		System.out.println(res);
	}
}
