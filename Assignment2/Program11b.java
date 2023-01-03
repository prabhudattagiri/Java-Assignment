//find number of odd numbers that ends with 5 and 7?
public class Program11b {
    public static void main(String[] args) 
    {
        int count = 0;
        for (int i = 23; i <= 249; i++)
        {
            if (i % 2 != 0 && i % 10 == 5 || i % 10 == 7)
            {
                count++;
            }
        }
        System.out.println(count + " number of odd digits that ends with 5 and 7 between 23 to 249 .");
    }
}