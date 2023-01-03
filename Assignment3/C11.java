/*Write a program to swap two numbers without using 3rd variable and with using
3rd variable using class and object?
 */
class Swap
{
    void swapWith(int a,int b)
    {
        System.out.println("Before Swapping with using 3rd variable A is "+a+" and B is "+b);

        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("After Swapping with using 3rd variable A is "+a+" and B is "+b);
    }
    void swapWithout(int a,int b)
    {
        System.out.println("Before Swapping without using 3rd variable A is "+a+" and B is "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping without using 3rd variable A is "+a+" and B is "+b);
    }
}
public class C11 
{
    public static void main(String[] args) 
    {
        Swap s = new Swap();
        s.swapWith(10, 15);
        s.swapWithout(7, 8);
    }
}
