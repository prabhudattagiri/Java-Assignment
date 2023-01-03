/*Write a program to perform following using the numbers in between 23 to 249?
   g) find GCD and LCM of all odd numbers? */

public class Program11g 
{
    public static void main(String[] args) 
    {
		int LCM=0,GCD=0;
		for (int i = 23; i <= 249; i = i + 2)
		{
			int a=i,b=i+2;
			//For GCD
			for(int j=1;j<=b;j++)
			{
				if(a%j==0 && b%j==0)
				{
					GCD=j;
				}
			}
			//For LCM
			for(int j=b;j<=a*b;j++)
			{
				if(j%a==0 && j%b==0)
				{
					LCM=j;
				}
			}
		}
		System.out.println("GCD = "+GCD+" and LCM = "+LCM+" for all odd number in between 23 to 249");
    }
}
