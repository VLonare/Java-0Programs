package practice;

import java.util.Scanner;

public class ResultDriver {

	public static void main(String[] args) {
		double subject1, subject2, subject3, subject4, subject5;
		int roll_no;
		String name, father_name;
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name=x.nextLine();
		
		System.out.println("Enter your Fathers'name: ");
		father_name=x.nextLine();
		
		System.out.println("Enter your Roll No.: ");
		roll_no=x.nextInt();
		
		System.out.println("Enter marks if Subject 1: ");
		subject1=x.nextDouble();
		
		System.out.println("Enter marks if Subject 2: ");
		subject2=x.nextDouble();
		
		System.out.println("Enter marks if Subject 3: ");
		subject3=x.nextDouble();
		
		System.out.println("Enter marks if Subject 4: ");
		subject4=x.nextDouble();
		
		System.out.println("Enter marks if Subject 5: ");
		subject5=x.nextDouble();
		
		Grade res = new Grade();
		res.info(name, father_name, roll_no);
		res.getPer(subject1, subject2, subject3, subject4, subject5);
		res.grade();
	}
}
