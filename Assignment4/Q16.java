/*  WAP to find summation, subtraction, multiplication, division, modulus and power of 2 numbers 
using swing and event handling?*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CalculatorS extends JFrame implements ActionListener
{
    Container cn;
    JLabel n1,n2,r;
    JTextField t1,t2,tr;
    JButton sum,sub,mul,div,mod,pow;
    public CalculatorS()
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
        tr=new JTextField();
        tr.setBounds(300,200,100,30);
        cn.add(tr);

        //For Button
        sum=new JButton("Sum");
        sum.setBounds(100,250,70,30);
        sum.addActionListener(this);
        cn.add(sum);

        sub=new JButton("Sub");
        sub.setBounds(180,250,70,30);
        sub.addActionListener(this);
        cn.add(sub);

        mul=new JButton("Mul");
        mul.setBounds(260,250,70,30);
        mul.addActionListener(this);
        cn.add(mul);

        div=new JButton("Div");
        div.setBounds(340,250,70,30);
        div.addActionListener(this);
        cn.add(div);

        mod=new JButton("Mod");
        mod.setBounds(420,250,70,30);
        mod.addActionListener(this);
        cn.add(mod);

        pow=new JButton("Pow");
        pow.setBounds(500,250,70,30);
        pow.addActionListener(this);
        cn.add(pow);

        setSize(800,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==sum) 
        {
            int res=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
            tr.setText(res+" ");
           
        }
        if (ae.getSource()==sub) 
        {
            int res=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
            tr.setText(res+" ");
           
        }
        if (ae.getSource()==mul) 
        {
            long res=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
            tr.setText(res+" ");
        }
        if (ae.getSource()==div) 
        {
            double res=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
            tr.setText(res+" ");
        }
        if (ae.getSource()==mod) 
        {
            int res=Integer.parseInt(t1.getText())%Integer.parseInt(t2.getText());
            tr.setText(res+" ");
        }
        if (ae.getSource()==pow) 
        {
            t2.setText(2+"");
            double res=Math.pow(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()));
            tr.setText(res+" ");
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
