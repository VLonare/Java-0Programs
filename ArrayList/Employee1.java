package ArrayList;

public class Employee1 {

	private String name;
	private int id;
	private double sal;
	private String manager;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int id, double sal, String manager, String name) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.manager = manager;
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
		return "Employee1 [name=" + name + ", id=" + id + ", sal=" + sal + ", manager=" + manager + "]";
	}
	
	
	
	
}
