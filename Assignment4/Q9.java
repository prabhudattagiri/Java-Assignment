/* WAP to print your scroll and blink your name using Applet and multithreading? */
import java.applet.*;
import java.awt.*;

/*<applet code="Q9.class" width="600" height="400"> </applet> */

public class Q9 extends Applet implements Runnable
{
    Thread t; //create a thread
    String msg;
    boolean st=false;
    public void init()
    {
        msg=" Prabhu ";
    }
    public void start()
    {
        st=true;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try
        {
            //For Scroll Text
            while(st)
            {
                repaint();
                Thread.sleep(100);
                char ch =msg.charAt(0);
                String n= msg.substring(1,msg.length());
                msg=n+ch;
            }
            //For Blinking Text
            for(int i=0;i<100;i++)
            {
                if(i%2==0)
                {
                    msg=" Prabhu ";
                    repaint();
                }
                else
                {
                    msg=" ";
                    repaint();
                }
                Thread.sleep(500);
            }
        }
        catch(InterruptedException ie)
        {
            msg="Thread Interrupted";
            repaint();
        }
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 250, 200);
    }
    public void stop()
    {
        st=false;
    }
}
