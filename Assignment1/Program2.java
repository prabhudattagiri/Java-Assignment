/*2. Write a java program to find simple interest? */
public class Program2 
{
    public static void main(String args[])
    {
        int p=12000; // princepal amount
        int t=3; // Time Duration
        int r=10; // Rate of interest
        float si = (p*t*r)/100;
        System.out.println("Principal Amount is "+p);
        System.out.println("Rate of Interest is "+r+" %");
        System.out.println("Time Duration is "+t+" Years");
        System.out.println("Simple interest is "+si);
    }
}
