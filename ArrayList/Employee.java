package ArrayList;

public class Employee {

	int id;
	double sal;
	String manager;
	String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	Employee(int id, double sal, String manager, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.manager = manager;
		this.name = name;
	}
	
	public void displayEmployee()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+sal);
		System.out.println("Manager: "+manager);
		System.out.println("========================");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", manager=" + manager + ", name=" + name + "]";
	}
	
	
	
}
