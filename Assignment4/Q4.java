/* WAP to find repeated elements and no of repeated elements in the array of 20 user defined values
 and also remove redundant values and update array with unique values only using simple inheitence?  */
import java.util.Scanner;

class Array
{
    int arr[] = new int [20];
    int rp =0;
    Scanner sc = new Scanner(System.in);
    Array()
    {
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter "+(i+1)+" Element to Array : ");
            arr[i]=sc.nextInt();
        }
    }
    void findDuplicate()
    {
        System.out.println("Repeated elements in the array are : ");
        for(int i=0;i<20;i++)
        {
            for(int j=i+1;j<20;j++)
            {
                if(arr[i]==arr[j])
                {
                    rp++;
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println("\nNumber of repeated elements is "+rp);
    }
}
class Unique extends Array
{
    int uniarr []= new int[20-rp];
    void removeDuplicate()
    {
        int k=0;
        for(int i=0;i<20;i++)
        {
            boolean notduplicate = true;
            for(int j=i+1;j<20;j++)
            {
                if(arr[i]==arr[j])
                {
                    notduplicate = false;
                }
            }
            if(notduplicate)
            {
                uniarr[k]=arr[i];
                k++;
            }
        }
        //Display array after remove duplicate
        System.out.println("After remove redundant values , Element in Array are : ");
        for(int i=0;i<k;i++)
        {
            System.out.print(uniarr[i]+" ");
        }    
    }
}
public class Q4 
{
    public static void main(String[] args) 
    {
        Unique a = new Unique();
        a.findDuplicate();
        a.removeDuplicate();
    }
}
