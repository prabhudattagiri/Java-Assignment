//find number of prime numbers?
public class Program11c 
{
    public static void main(String[] args) 
    {
        int count = 0, prime = 0;
        for (int i = 23; i <= 249; i++) 
        {
            count = 0;
            for (int j = 1; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                }
            }
            if (count == 2)
            {
                prime++;
            }
        }
        System.out.println("the number of prime numbers between 23 to 249 : " +prime);
    }
}