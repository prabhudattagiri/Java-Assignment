/*WAP to create scientific calculator and perform all arithmetic operations like sum,substraction,division,multiplication,
modulus, power,sqrt,cubic root, sinx, cos x, tanx, log x, exp x, absolute value of x using interface and package? */

import Calculator.*; //Using Package
import java.util.Scanner;

public class Q5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Calculator ca = new Calculator(); //Creating object of calculator
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        System.out.println("1.Addition "+"2.Substract "+"3.Multiplication "+"4.Division "+"5.Power "+"6.Square root "+"7.Cube root "+"8. Sinx "+"9. Cos x "+"10. Tan x "+"11. Log x "+"12. exp x"+"13. Absolute of x ");

        System.out.println("Enter operation: ");
        int operation = sc.nextInt();
        switch (operation)
        {
            case 1:
                System.out.println(ca.sum(a,b));
                break;
            case 2:
                System.out.println(ca.sub(a,b));
                break;
            case 3:
                System.out.println(ca.mul(a,b));
                break;
            case 4:
                System.out.println(ca.div(a,b));
                break;
            case 5:
                System.out.println(ca.pow(a,b));
                break;
            case 6:
                System.out.println(ca.sqroot(a));
                break;
            case 7:
                System.out.println(ca.cbroot(a));
                break;
            case 8:
                System.out.println(ca.sinx(a));
                break;
            case 9:
                System.out.println(ca.cosx(a));
                break;
            case 10:
                System.out.println(ca.tanx(a));
                break;
            case 11:
                System.out.println(ca.logx(a));
                break;
            case 12:
                System.out.println(ca.exp(a));
                break;
            case 13:
                System.out.println(ca.absoluteValue(a));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        
        }
        sc.close();     
    }
}
