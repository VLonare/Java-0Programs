package polymorphism;

public class CallOfDuty {
	int bullets =30;
	
	public void jump()
	{
		System.out.println("Jumped!");
	}
	
	public void run(int dist)
	{
		System.out.println("Ran "+dist+"m");
	}
	
	public void recoilAKM()
	{
		System.out.println(12);
	}
	
	public void reloadAKM()
	{
		this.bullets=40;
	}
	
	public void fire()
	{
		if (bullets>0) {
			System.out.println("Fired!");
			System.out.println(--bullets);
		}
		else {
			System.out.println("Reload");
		}
	}
}
