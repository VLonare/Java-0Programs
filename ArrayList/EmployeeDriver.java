package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Manager name");
		String mgr = sc.next(); 
		
		ArrayList emp = new ArrayList<>();
		
		//int id, double sal, String manager, String name
		emp.add(new Employee(123, 15000, "John", "Mahesh"));
		emp.add(new Employee(168, 17000, "Adam", "Suresh"));
		emp.add(new Employee(167, 25000, "Smith", "Mala"));
		emp.add(new Employee(163, 70000, "Adam", "Bhima"));
		emp.add(new Employee(161, 19000, "John", "Swati"));
		
		boolean flag = false;
		int i;
		
		for (i = 0; i < emp.size(); i++) {
			Employee e1 = (Employee) emp.get(i);
			
			if (e1.manager.equals(mgr)) {
				flag = true;
				System.out.println(e1);
			}
		}
		
		if (flag==false) {
			System.out.println("Employee not found!");
		}
	}
	
}
