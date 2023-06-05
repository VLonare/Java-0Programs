package polymorphism;

public class CallOfDutyV2 extends CallOfDuty{
	
	public void recoilAKM()
	{
		System.out.println("Recoil: "+9);
	}
	
	public void reloadAKM()
	{
		this.bullets=40;
		System.out.println("AKM reloaded!");
	}
	
	public void fire()
	{
		if(bullets>0)
		{
			System.out.println("Fired!");
			System.out.println((--bullets)+" bullets left!");
		}
		else
		{
			System.out.println("Reload");
		}
	}
}
