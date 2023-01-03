/*WAP to create digital clock using swing and multithreading? */
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;

class DigitalClock extends JFrame implements Runnable
{
    Container cn;
    JButton b;
    int hour=0,min=0,sec=0;
    String time ="";
    Thread t;
    DigitalClock()
    {
        cn = getContentPane();
        t=new Thread(this);
        t.start();
        b=new JButton();
        b.setBounds(100,100,100,50);
        cn.add(b);

        setTitle("Digital Clock");
        setLayout(null);
        setSize(300,400);
        setVisible(true);
    }
    public void run()
    {
        try
        {
            while(true)
            {
                Calendar c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR_OF_DAY);
                if(hour>12)
                {
                    hour=hour-12;
                }
                min = c.get(Calendar.MINUTE);
                sec = c.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date date = c.getTime();
                time = formatter.format(date);

                printTime();
                t.sleep(1000);
            }
        }
        catch (InterruptedException ie)
        {
            System.out.println(ie);
        }
    }
    public void printTime()
    {
        b.setText(time);
    }
}
public class Q13
{
    public static void main(String[] args) 
    {
        new DigitalClock();
    }
}