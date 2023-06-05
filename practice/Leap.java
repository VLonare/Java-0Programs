package practice;

import java.util.Scanner;
public class Leap {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	
	System.out.print("Enter a year: ");
	int yr=x.nextInt();
	
	if ((yr %4==0 && yr%100!=0) || yr%400==0) {
		System.out.println("It is a leap year.");
	}
	
	else {
		System.out.println("Not a leap year.");
	}
}
}
