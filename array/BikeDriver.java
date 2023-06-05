package array;

public class BikeDriver {

	public static void main(String[] args) {
		Bike b[] = new Bike[5];
		
		b[0] = new Bike("Hero", "Splendor+", 90000.00, "Blue");
		b[1] = new Bike("Honda", "Activa", 100000.00, "White");
		b[2] = new Bike("TVS", "Jupiter", 93000.00, "Green");
		b[3] = new Bike("Honda", "Dio", 99000.00, "Blue");
		b[4] = new Bike("Hero", "Passion+", 97000.00, "Black");
		
		double max=0;
		int details=0;
		
		for (int i = 0; i < b.length; i++) {
			if(b[i].price>max)
			{
				max=b[i].price;
				details=i;
			}
		}
		
		System.out.println("Maximum price of bike is: "+max);
		b[details].displayBike();
		
 	}
	
}
