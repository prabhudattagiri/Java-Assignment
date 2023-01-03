//find number of palindrome numbers?
public class Program11d 
{
    public static void main(String[] args) 
    {
        int count = 0, result, rem;
        for (int i = 23; i <= 249; i++) {
            int temp = i;
            result = 0;
            while (temp != 0) 
            {
                rem = temp % 10;
                result = result * 10 + rem;
                temp /= 10;
            }
            if (i == result) 
            {
                count++;
            }
        }
        System.out.println("Numbers of pallindrom between 23 to 249 is : " + count);
    }
}