//Find first five largest even number and smallest odd number?
public class Program11i 
{
    public static void main(String args[]) 
    {
        int count = 0;
        System.out.print("The first five largest even number in the given range :");
        for (int i = 249; i >= 23; i--) 
        {
            if (i % 2 == 0) 
            {
                System.out.print(" " + i);
                count++;
            }
            if (count == 5)
                break;
        }
        System.out.println();
        int count2 = 0;
        System.out.print("The first five smallest odd number in the given range :");
        for (int i = 23; i <= 249; i++) 
        {
            if (i % 2 != 0) 
            {
                System.out.print(" " + i);
                count2++;
            }
            if (count2 == 5)
                break;
        }
    }
}