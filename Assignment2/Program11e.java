//find difference between average of palindrome and prime numbers?
public class Program11e 
{
    public static void main(String[] args) 
    {
        int count1 = 0, result, rem, sum = 0, count2 = 0, prime = 0, sum2 = 0;
        for (int i = 23; i <= 249; i++) 
        {
            int temp = i;
            result = 0;
            while (temp != 0) 
            {
                rem = temp % 10;

                result = result * 10 + rem;
                temp = temp / 10;
            }
            if (i == result) 
            {
                sum = sum + result;
                count1++;
            }
        }
        float avg1 = sum / count1;
        System.out.println("Avg of pallindroms in the given range :" + avg1);
        for (int i = 23; i <= 249; i++) {
            count2 = 0;
            for (int j = 1; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    count2++;
                }
            }
            if (count2 == 2) 
            {
                prime++;
                sum2 = sum2 + i;
            }
        }
        float avg2 = sum2 / prime;
        System.out.println("Avg of prime numbers in the given range :" + avg2);
        System.out.println("Difference between the two averages : " + (avg1 - avg2));
    }
}