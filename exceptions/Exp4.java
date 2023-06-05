package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp4 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter numerator:");
		int num=x.nextInt();
		
		System.out.println("Enter denominator:");
		int den=x.nextInt();
		
		try 
		{
			System.out.println(num/den);
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Enter valid input.");
		}
		
		catch(Exception e) 
		{
			System.out.println("Error occured ! Restart");
		}
		finally 
		{
			System.out.println("Thank You.");
		}
	}
}
