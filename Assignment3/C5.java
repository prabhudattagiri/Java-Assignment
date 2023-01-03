/*Write a program to find area and perimeter of triangle having 3 sides using class and object? */
import java.util.Scanner;
class Triangle
{
    int x,y,z;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three side of the Triangle :");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        sc.close();
    }
    void area()
    {
        float s =(float) (x+y+z)/2;
        //S = Semi perimeter
        float a=(s*(s-x)*(s-y)*(s-z));
        System.out.println("Area of the Triangle is "+Math.sqrt(a));
    }
    void perimeter()
    {
        int p=x+y+z;
        System.out.println("Perimeter of the Triangle is "+p);
    }
}public class C5
{
    public static void main(String[] args) 
    {
        Triangle T1 = new Triangle();
        T1.input();
        T1.area();
        T1.perimeter();
    
    }    
}