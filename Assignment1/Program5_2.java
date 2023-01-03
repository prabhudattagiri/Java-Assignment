/*Find the face value and position value of any 4 digit number? */
public class Program5_2
{
    public static void main(String args[])
    {
        int num=7896;
        //face value is same as number in digit
        int fvalue4th=7896%10;
        int fvalue3rd=(7896/10)%10;
        int fvalue2nd=(7896/100)%10;
        int fvalue1st=(7896/1000)%10;
        //finding position value
        int pvalue1st = fvalue1st*1000;
        int pvalue2nd = fvalue2nd*100;
        int pvalue3rd = fvalue3rd*10;
        int pvalue4th = fvalue4th*1;
        System.out.println("4 Digit Number is "+num);
        System.out.println("Face value of 1st digit is "+fvalue1st+" position value is "+pvalue1st);
        System.out.println("Face value of 2nd digit is "+fvalue2nd+" position value is "+pvalue2nd);
        System.out.println("Face value of 3rd digit is "+fvalue3rd+" position value is "+pvalue3rd);
        System.out.println("Face value of 4th digit is "+fvalue4th+" position value is "+pvalue4th);

    }
}