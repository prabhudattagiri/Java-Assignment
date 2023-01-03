/* Write a program to find transpose of a 3X4 matrics? */
import java.util.Scanner;

class A7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m[][]= new int[3][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("Enter element to "+ i+1 + " row and "+ j+1 + " column : ");
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of Martix is ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+m[j][i]);
            }
            System.out.println();
        }
        sc.close();
    }
}