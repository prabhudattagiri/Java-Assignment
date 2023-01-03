/*3. Write a java program for temperature conversion? */
import java.util.Scanner;

public class Program3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius :");
        float c = sc.nextFloat();
        System.out.print("Enter Temperature in Fahrenheit :");
        float f =sc.nextFloat();
        float celsius = (f-32)*5/9;
        float fahrenheit = (c*9/5)+32;
        System.out.println(c+" Celsius is "+fahrenheit+" Fahrenheit");
        System.out.println(f+" Fahrenheit is "+celsius+" Celsius");
        sc.close();
    }
}
