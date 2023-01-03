//Check whether the difference between largest even number and smallest palindrome or not ?
public class Program11h 
{
    public static void main(String args[]) 
    {
        int oNum = 0, eNum = 0, rem, result = 0;
        for (int i = 249; i >= 23; i--) 
        {
            if (i % 2 == 0) 
            {
                eNum = i;
            }
        }
        for (int i = 23; i <= 249; i++) 
        {
            if (i % 2 != 0) 
            {
                oNum = i;
            }
        }
        int diff = eNum - oNum;
        int temp = diff;
        while (diff != 0) 
        {
            rem = diff % 10;
            result = result * 10 + rem;
            diff = diff / 10;
        }
        if (temp == result) 
        {
            System.out.println("Difference between largest even number and smallest odd number is pallindrom.");
        } else 
        {
            System.out.println("Difference between largest even number and smallest odd number is not a pallindrom.");
        }
    }
}