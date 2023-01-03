/*Write a program to find volume of rectangle and square box using constructor overloading? */
class Box
{
    Box(int l,int b,int h)
    {
        int vol=l*b*h;
        System.out.println("Volume of the Rectangle box is "+vol);
    }
    Box(int s)
    {
        int vol=s*s*s;
        System.out.println("Volume of the Square box is "+vol);
    }
}
public class P7 
{
    public static void main(String[] args) 
    {
        Box b1 = new Box(5, 8, 7);
        Box b2 = new Box(4);
    }
}
