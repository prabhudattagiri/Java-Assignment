/*Write a program to find area and perimeter of square using class and object? */
import java.util.Scanner;
class Square
{
    int s;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square :");
        s=sc.nextInt();
        sc.close();
    }
    void area()
    {
        int a=s*s;
        System.out.println("Area of the Square is "+a);
    }
    void perimeter()
    {
        int p=4*s;
        System.out.println("Perimeter of the Square is "+p);
    }
}public class C4 
{
    public static void main(String[] args) 
    {
        Square s1 = new Square();
        s1.input();
        s1.area();
        s1.perimeter();
    
    }    
}
