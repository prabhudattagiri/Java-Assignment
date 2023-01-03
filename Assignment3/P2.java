/*Write program to display following pattern using method overloading and constructor 
overloading?
Odd number based pyramid starts from value n received from user

         n+1
       n+3 n+6
    n+5 n+10 n+15
 n+7 n+14 n+21 n+28
 even number based pyramid starts from value n received from user

       n+2
     n+4 n+6
    n+6 n+10 n+14
 n+8 n+14 n+20 n+26
 user defined character suppose entered character is k
     k
    k k
   k k k
  k k k k 
 */
class Pyramid
{
  void pattern(int n)
  {
    if(n%2==0) //For Even Number
    {
      int i=0;
      for(int row=1;row<5;row++)
      {
        for(int space =1;space<5-row;space++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
          System.out.print(n+((col*i)+2)+" ");
        }
        i=i+2;
        System.out.println();
      }
    }
    else
    {
      int i=1; //For Odd Number
      for(int row=1;row<5;row++)
      {
        for(int space =1;space<5-row;space++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
          System.out.print(n+(col*i)+" ");
        }
        i=i+2;
        System.out.println();
      }
    }
  }
  void pattern(char k)
  {
    for(int row=1;row<5;row++)
    {
      for(int space =1;space<5-row;space++)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=row;col++)
      {
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }
}

public class P2 
{
    public static void main(String[] args) 
    {
      Pyramid p = new Pyramid();
      p.pattern(2);
      p.pattern(3);
      p.pattern('K');
    }
}
