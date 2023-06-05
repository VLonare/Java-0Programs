package inheritance;

public class Developer extends SoftwareEngineer {
	String lang;
	String work;
	String post;
	int projects;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
	Developer(String type, String founder, String sector, String name, double sal, String job_type, int exp, String skill, String lang, String work, String post, int projects)
	{
		this.type=type;
		this.founder=founder;
		this.sector=sector;
		
		this.name=name;
		this.sal=sal;
		this.job_type=job_type;
		this.exp=exp;
		this.skill=skill;
		
		this.lang=lang;
		this.work=work;
		this.post=post;
		this.projects=projects;
	}
	
	public void dispDev()
	{
		dispSoft();
		System.out.println("Language: "+lang);
		System.out.println("Work: "+work);
		System.out.println("Position: "+post);
		System.out.println("Projects: "+projects);
		
		System.out.println("=================================");
	}
}
