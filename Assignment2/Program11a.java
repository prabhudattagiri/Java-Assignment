/*Write a program to perform following using the numbers in between 23 to 249?
a) find number of even numbers that ends with 0 and 4?
*/
public class Program11a
{
    public static void main(String[] args) 
    {
        int count = 0;
        for (int i = 23; i <= 249; i++) 
        {
            if (i % 2 == 0 && i % 10 == 0 || i % 10 == 4)
            {
                count++;
            }
        }
        System.out.println(count + " no of even digit ends with 0 and 4 in between 23 to249.");
    }
}