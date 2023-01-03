/* WAP to move a ball in a straight line left to right horizontally using Applet and multithreading? */
import java.applet.*;
import java.awt.*;

/* <applet code = "Q11.class" width = 500 height = 300> </applet> */

public class Q11 extends Applet implements Runnable 
{
    Thread t;
    int x = 0;
    int y = 100;
    int flag =1;

    public void start() 
    {
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) 
    {
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, 100, 100);
    }

    public void update() 
    {

        x = x + 10 * flag;
        if (x > 300)
            flag = -1;
        if (x < 100)
            flag = 1;
    }

    public void run() 
    {

        while(true) 
        {
            repaint();
            update();
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException ie) 
            {
                System.out.println(ie);
            }
        }
    }
}
