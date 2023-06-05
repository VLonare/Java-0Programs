package practice;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		 int p=1;
         int q=1;
         for (int i = 1; i <= 5; i++) 
        {
            if(i%2==0)
            {
                q=p + (i - 1);
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(q+" ");
                    q--;
                    p++;
                }
            }
            else
            {
                q=p;
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(q+" ");
                    q++;
                    p++;
                }
            }
            System.out.println();
        }
     }
}