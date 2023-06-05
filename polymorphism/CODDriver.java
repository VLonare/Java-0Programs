package polymorphism;

public class CODDriver {
	public static void main(String[] args) {
		CallOfDuty c1 = new CallOfDuty();
		
		c1.run(100);
		c1.jump();
		
		c1.fire();
		c1.fire();
		c1.fire();
		c1.fire();
		c1.fire();
		c1.fire();
		
		c1.reloadAKM();
		
		c1.fire();
		
		c1.recoilAKM();
		
		c1.fire();
		c1.fire();
	}
}
