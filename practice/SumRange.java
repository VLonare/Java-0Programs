package practice;

public class SumRange {
public static void main(String[] args) {
	int start=10;
	int end=20;
	int sum=0;
	while(start<=end)
	{
		sum=sum+start;
		start++;
	}
	System.out.println(sum);
	
	int b=10;
	System.out.println(b--);
	System.out.println(b--);
	System.out.println(--b);
	
}
}
