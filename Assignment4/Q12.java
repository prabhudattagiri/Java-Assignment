/*WAP to move a square box in a straight line top to bottom vertically using Applet and multithreading?  */
import java.applet.*;
import java.awt.*;

/* <applet code = "Q12.class" width = 500 height = 800> </applet> */

public class Q12 extends Applet implements Runnable 
{
    Thread t;
    int x = 200;
    int y = 0;
    int flag =1;

    public void start() 
    {
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) 
    {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 100, 100);
    }

    public void update() 
    {

        y = y + 10 * flag;
        if (y > 600)
            flag = -1;
        if (y < 100)
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
