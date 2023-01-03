/* WAP to create one application for colour recognition for kids in which kids will chose button that 
shows colour name like RED,BLUE, etc. and after clicking on button background colour of window 
will change as per colour name?  */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RGB extends JFrame implements ActionListener
{
    Container cn;
    JButton r,g,b;
    Font fr,fg,fb;
    public RGB()
    {
        cn=getContentPane();
        setTitle("My Application");
        setLayout(null);

        fr=new Font("MS serif", java.awt.Font.PLAIN,25);
        fg=new Font("MS serif", java.awt.Font.BOLD,25);
        fb=new Font("MS serif", java.awt.Font.ITALIC,25);

        r=new JButton("RED");
        r.setBounds(20,100,150,50);
        r.setFont(fr);
        r.setBackground(Color.RED);
        r.addActionListener(this);
        cn.add(r);

        g=new JButton("GREEN");
        g.setBounds(200,100,150,50);
        g.setFont(fg);
        g.setBackground(Color.GREEN);
        g.addActionListener(this);
        cn.add(g);

        b=new JButton("BLUE");
        b.setBounds(380,100,150,50);
        b.setFont(fb);
        b.setBackground(Color.BLUE);
        b.addActionListener(this);
        cn.add(b);

        setSize(1200,800);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==r)
        {
            cn.setBackground(Color.RED);
        }
        if(ae.getSource()==g)
        {
            cn.setBackground(Color.GREEN);
        }
        if(ae.getSource()==b)
        {
            cn.setBackground(Color.BLUE);
        }
    }
}

class Q15
{
    public static void main(String[] args) 
    {
        new RGB();
    }
}
