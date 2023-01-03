/*Write a program to check whether a number or string is palindrome or not using method 
overloading? */
class Number
{
    void palindrome(int n)
    {
        int tn=n;
        int rev=0;
        while(tn!=0)
        {
            rev=rev*10+(tn%10);
            tn=tn/10;
        }
        if(rev==n)
        {
            System.out.println(n+" is Palindrome");
        }
        else
        {
            System.out.println(n+" is Not Palindrome");

        }
    }
    void palindrome(String nm)
    {
        String str = nm;
        String rev="";
        int len =str.length();
        for (int i = (len - 1); i >=0; --i) 
        {
            rev = rev + str.charAt(i);
        }
      
        if(str.toLowerCase().equals(rev.toLowerCase())) 
        {
            System.out.println(str + " is a Palindrome String.");
        }
        else 
        {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
public class P6 
{
    public static void main(String[] args) 
    {
        Number n = new Number();
        n.palindrome("prabhu");
        n.palindrome(3245423);
    }
}
