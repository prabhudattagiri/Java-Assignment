// Write a program to determinant and inverse of a 3X3 matrix?

import java.util.Scanner;

public class A6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int det = 0;
        int m[][] = new int[3][3];
        System.out.println("Enter elements of matrix row wise:");
        for (i = 0; i < 3; ++i) 
        {
            for (j = 0; j < 3; ++j) 
            {
                m[i][j] = sc.nextInt();
            }
        }
        // For Determinant
        int x = (m[1][1] * m[2][2]) - (m[2][1] * m[1][2]);
        int y = (m[1][0] * m[2][2]) - (m[2][0] * m[1][2]);
        int z = (m[1][0] * m[2][1]) - (m[2][0] * m[1][1]);

        det = (m[0][0] * x) - (m[0][1] * y) + (m[0][2] * z);

        System.out.println("\ndeterminant = " + det);
        if (det != 0) 
        {
            System.out.println("Inverse of matrix is:"); // M (inverse) = 1/(det M) * Adj M
            for (i = 0; i < 3; ++i) 
            {

                for (j = 0; j < 3; ++j)
                {
                    System.out.print((((m[(j + 1) % 3][(i + 1) % 3] * m[(j + 2) % 3][(i + 2) % 3]) -(m[(j + 1) % 3][(i + 2) % 3] * m[(j + 2) % 3][(i + 1) % 3])) / det) + " ");
                }
                System.out.print("\n");
            }
        }
        sc.close();
    }
}