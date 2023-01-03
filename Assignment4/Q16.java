/*  WAP to find summation, subtraction, multiplication, division, modulus and power of 2 numbers 
using swing and event handling?*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CalculatorS extends JFrame implements ActionListener
{
    Container cn;
    JLabel n1,n2,r;
    JTextField t1,t2;
    JButton sm,sb,ml,di,md,pw;
    CalculatorS()
    {
        cn=getContentPane();
        setTitle("Calculator");
        setLayout(null);

        //For First Number
        n1=new JLabel("Enter First Number :");
        n1.setBounds(100,100,200,30);
        cn.add(n1);
        t1=new JTextField();
        t1.setBounds(300,100,100,30);
        cn.add(t1);

        //For Second Number
        n2=new JLabel("Enter First Number :");
        n2.setBounds(100,150,200,30);
        cn.add(n2);
        t2=new JTextField();
        t2.setBounds(300,150,100,30);
        cn.add(t2);

        //For Result
        r=new JLabel("Result");
        r.setBounds(100,200,300,30);
        cn.add(r);

        //For Button
        sm=new JButton("Sum");
        sm.setBounds(100,250,70,30);
        sm.addActionListener(this);
        cn.add(sm);

        sb=new JButton("Sub");
        sb.setBounds(180,250,70,30);
        sb.addActionListener(this);
        cn.add(sb);

        ml=new JButton("Mul");
        ml.setBounds(260,250,70,30);
        ml.addActionListener(this);
        cn.add(ml);

        di=new JButton("Div");
        di.setBounds(340,250,70,30);
        di.addActionListener(this);
        cn.add(di);

        md=new JButton("Mod");
        md.setBounds(420,250,70,30);
        md.addActionListener(this);
        cn.add(md);

        pw=new JButton("Pow");
        pw.setBounds(500,250,70,30);
        pw.addActionListener(this);
        cn.add(pw);

        setSize(800,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        //For summation
        if(ae.getSource()==sm);
        {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            r.setText("Result : Sum = "+(a+b));
        }
        //For subtraction
        if(ae.getSource()==sb);
        {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            r.setText("Result : Sub = "+(a-b));
        }
        //For multiplication
        if(ae.getSource()==ml);
        {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            r.setText("Result : Mul = "+(a*b));
        }
        //For division
        if(ae.getSource()==di);
        {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            r.setText("Result : Div = "+(a/b));
        }
        //For Modulus
        if(ae.getSource()==md);
        {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            r.setText("Result : Mod = "+(a%b));
        }
        //For Power
        if(ae.getSource()==md);
        {
            String s1=t1.getText();
            String s2=t2.getText();
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int p=1;
            for(int i=1;i<=b;i++)
            {
                p=p*a;
            }
            r.setText("Result : Pow = "+p);
        }
    }

}
public class Q16
{
    public static void main(String[] args) 
    {
        new CalculatorS();
    }
}
