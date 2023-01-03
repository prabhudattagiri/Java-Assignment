/* Write a program to display type of triangle using sides of triangle? */
import java.util.Scanner;

class Striangle
{
    int a,b,c;
    Striangle(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void typeOfTriangle()
    {
        if(a==b && b==c)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
public class C6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three side of trianle :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Striangle st = new Striangle(a, b, c);
        st.typeOfTriangle();
        sc.close();
    }
}
