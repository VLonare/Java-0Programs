package ArrayList;

import java.util.ArrayList;

public class EmployeeDriver1 {

	public static void main(String[] args) {
		ArrayList emp = new ArrayList();
		
			emp.add(new Employee1(123, 15000, "John", "mahesh"));
			emp.add(new Employee1(168, 17000, "Adam", "raju"));
			emp.add(new Employee1(167, 25000, "John", "nagesh"));
			emp.add(new Employee1(163, 70000, "Smith", "ganesh"));
			emp.add(new Employee1(161, 19000, "Allen", "yogesh"));
			
			System.out.println(emp);
			
			ArrayList updatename = nameFormatter(emp);
			System.out.println(updatename);
			
			ArrayList pattern = namePattern(emp, "r");
			
			
	}
	
	public static ArrayList namePattern(ArrayList a, String pat)
	{
		boolean flag = false;
		for (int i = 0; i < a.size(); i++) {
			Employee1 e1 = (Employee1) a.get(i);
			
			if (e1.getName().toUpperCase().contains(pat.toUpperCase())) {
				flag = true;
				System.out.println(e1);
			}
		}
		
		if (flag == false) {
			System.out.println("Employee not Found!");
		}
		return a;
	}
	
	public static ArrayList nameFormatter(ArrayList a)
	{
		for (int i = 0; i < a.size(); i++) {
			Employee1 e1 = (Employee1) a.get(i);
			String name = e1.getName();
			
			if (name.charAt(0)>=97 && name.charAt(0)<=122) {
				String sub = name.substring(1);
				String newname ="";
				newname = newname+((char)(name.charAt(0)-32))+sub;
				e1.setName(newname);
			}
		}
		return a;
	}
	
	
}
