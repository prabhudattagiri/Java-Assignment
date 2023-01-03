/*WAP to create pyramid of even and odd numbers using multithreading? 
      1 
     3 5 
    7 9 11 
 13 15 17 19 

      2 
     4 6 
   8 10 12 
 14 16 18 20 
 */

class Patten 
{
  synchronized void pyramid(int n)
  {
    for (int row = 1; row < 5; row++) 
    {
      for (int space = 1; space < 5 - row; space++) 
      {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) 
      {
        System.out.print(n + " ");
        n = n + 2;
      }
      System.out.println();
    }
  }
}

class ThreadD implements Runnable 
{
  Thread t;
  String tnm;
  Patten p;

  ThreadD(String nm, Patten q) 
  {
    tnm = nm;
    p=q;
    t = new Thread(this, tnm);
    t.start();
  }

  public void run() 
  {
    String tp = (String) Thread.currentThread().getName();
    if (tp.equals("Odd")) 
    {
      p.pyramid(1);
    }
    if (tp.equals("Even")) 
    {
      p.pyramid(2);
    }
  }
}

public class Q8 
{
  public static void main(String args[]) 
  {
    Patten p1 = new Patten();
    new ThreadD("Even",p1);
    new ThreadD("Odd",p1);
  }
}
