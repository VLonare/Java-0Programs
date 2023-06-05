package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp3 {
	public static void main(String[] args) {
		
		try {
			Scanner x = new Scanner(System.in);
			
			System.out.println("Enter numerator: ");
			int num=x.nextInt();
			
			System.out.println("Enter denominator: ");
			int den=x.nextInt();
			System.out.println(num/den);
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Dont't divide a number by zero..");
		}
		catch (InputMismatchException g3) {
			// TODO: handle exception
			System.out.println("Enter a valid input.");
		}
		
		System.out.println("Thank You.");
		
	}
}
