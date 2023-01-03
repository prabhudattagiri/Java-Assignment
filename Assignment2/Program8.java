/* Write a program to find following data of student using mark of four subjects like C, C++, Java, and Python. Mark of 4 subjects will be accepted at the run time and credit of all the mentioned subject is 3?
     a) Grade of 4 subjects?
     b) Total Mark and %age of mark secured by Students?
     c) SGPA of Student?
 */

/*Code Written By Ramesh Sir in Lab
 * Take input Through command line (Written like below )
 * javac Program8.java
 * java Program8 60 78 45 92
 */
public class Program8 
{
    public static void main(String[] args) 
    {
        int cp = 3, fms = 400, sgpat = 0, tms = 0, gp = 1;
        int nos = args.length;
        for (int i = 0; i < nos; i++) 
        {
            char gd = 's';
            int m = Integer.parseInt(args[i]);
            tms = tms + m;
            if (m >= 35 && m < 40) 
            {
                m = m + 5;
            }
            int mv = m / 10;
            switch (mv) {
                case 0:
                case 1:
                case 2:
                case 3:
                    gd = 'F';
                    gp = 2;
                    break;
                case 4:
                    gd = 'D';
                    gp = 5;
                    break;
                case 5:
                    gd = 'C';
                    gp = 6;
                    break;
                case 6:
                    gd = 'B';
                    gp = 7;
                    break;
                case 7:
                    gd = 'A';
                    gp = 8;
                    break;
                case 8:
                    gd = 'E';
                    gp = 9;
                    break;
                case 9:
                case 10:
                    gd = 'O';
                    gp = 10;
                    break;
                default:
                    gd = 's';
                    gp = 0;
            }
            System.out.println("Your mark for subject " + i + "is" + args[i] + "and grade is " + gd);
            sgpat = sgpat + gp * cp;
        }
        double percent = (tms / fms) / 100;
        double sgpa = sgpat / 12;
        System.out.println("Total Mark is " + tms);
        System.out.println("% of mark is " + percent);
        System.out.println("Your SGPA is " + sgpa);

    }
}