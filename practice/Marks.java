package practice;

public class Marks extends Student {
	
	double percentage, total;
	public void getPer(double subject1,double subject2,double subject3,double subject4,double subject5)
	{
		total=subject1+subject2+subject3+subject4+subject5;
		percentage=(total/500)*100;
	}

}
