/*Write a program to override sum method if arguments are numbers than it will add numbers or 
string than concat two strings using constructor overloading 
*/
class Add
{
    void sum(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum of two number is : "+c);
    }
    void sum(String x,String y)
    {
        String z=x+y;
        System.out.println("Concatination of Two String is "+z);
    }
}

public class P5
{
    public static void main(String[] args) 
    {
        Add a = new Add();
        a.sum(34, 45);
        a.sum("Prabhu", "Datta");
    }
}
