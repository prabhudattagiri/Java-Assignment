/*Write a program to find area and perimeter of rectangle using class and object? */

import java.util.Scanner;
class Rectangle
{
    int ln,br;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length and Breadth of Rectangle :");
        ln=sc.nextInt();
        br=sc.nextInt();
        sc.close();
    }
    void area()
    {
        int a=ln*br;
        System.out.println("Area of the Rectangle is "+a);
    }
    void perimeter()
    {
        int p=2*(ln+br);
        System.out.println("Perimeter of the Rectangle is "+p);
    }
}
public class C3 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        r1.input();
        r1.area();
        r1.perimeter();
    }   
}
