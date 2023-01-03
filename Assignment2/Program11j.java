//Find sum of product of corresponding digits of 2nd largest even number and 3rd smallest odd number?
public class Program11j 
{
    public static void main(String args[]) 
    {
        int count = 0, Enum = 0, count2 = 0, Onum = 0, sum = 0, d, d2;
        for (int i = 249; i >= 23; i--) 
        {
            if (i % 2 == 0) 
            {
                count++;
            }
            if (count == 2) 
            {
                Enum = i;
                System.out.println("The 2nd largest even number in the given range : " +Enum);
                break;
            }
        }
        for (int i = 23; i <= 249; i++) 
        {
            if (i % 2 != 0) 
            {
                count2++;
            }
            if (count2 == 3) 
            {
                Onum = i;
                System.out.println("The 3rd smallest odd number in the given range : " +Onum);
                break;
            }
        }
        while (Enum != 0) 
        {
            d = Enum % 10;
            d2 = Onum % 10;
            sum = sum + (d * d2);
            Enum = Enum / 10;
            Onum = Onum / 10;
        }
        System.out.println("Sum of product of corresponding digits the above numbers :" + sum);
    }
}