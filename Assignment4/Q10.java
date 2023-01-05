/*WAP to create smiley face and Start using Applet and multithreading?  */
import java.applet.*;
import java.awt.*;

/*<applet code=Q10.class width=400 height=400> </applet> */

public class Q10 extends Applet implements Runnable
{
    Thread t;
    public void start()
    {
        t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(120,120,150,150); //For face
        
        g.setColor(Color.black);
        g.fillOval(150,160,15,25);  //Left Eye 
        g.fillOval(220,160,15,25);  //Right Eye

        int x[] = {195,185,206};
        int y[] = {185,204,204};
        g.drawPolygon(x, y, 3); //Nose (Triangle)

        g.drawArc(155,195,78,50,0,-180);  //Smile
        g.drawLine(150,226,160,216);   //Smile arc1
        g.drawLine(228,215,239,226);  //Smile arc2
    }
    public void run()
    {
        try{
            for(int i=1;i<20;i++)
            {
                if(i%2==0)
                {
                    repaint();
                    Thread.sleep(500);
                }
                repaint();
            }
        }catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted");
        }
    }
}
