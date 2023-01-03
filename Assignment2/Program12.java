/*Write a java program to find following of 10 numbers using command line arguments? Do not use array?
a) Find difference between greatest and smallest number?
b) Find difference between average of all odd numbers and even numbers? */

//import java.util.Scanner; (Taking input from command line same as Question no 8)

public class Program12 
{
    public static void main(String args[]) 
    {
        int s, min=Integer.parseInt(args[0]), max = 0, eSum = 0, oSum = 0, eCount = 0, oCount = 0;
        for (int i = 0; i < 10; i++) 
        {
            s = Integer.parseInt(args[i]); //Taking input from command line
            if (s > max)
            {
                max = s;
            }
            if(s< min)
            {
                min = s;
            }

            if (s % 2 == 0) 
            {
                eSum = eSum + s;
                eCount++;
            } else 
            {
                oSum = oSum + s;
                oCount++;
            }
        }
        System.out.println("Difference between maximum and minimum from the given numbers is :" + (max - min));

        float eAvg = eSum / eCount;
        float oAvg = oSum / oCount;
        System.out.println("Difference between average of all odd numbers and even numbers :" + (eAvg - oAvg));
    }
}