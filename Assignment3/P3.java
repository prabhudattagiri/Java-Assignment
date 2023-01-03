/*Write a program to sort 10 numbers in the array using following sorting algorithm and method overloading?
a) merge sort
b) quick sort
c) heap sort */
import java.util.Scanner;

class Sorting 
{
    // Merge Sort
    void merge(int a[], int beg, int mid, int end) 
    {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (i = 0; i < n1; i++)
        {
            LeftArray[i] = a[beg + i];
        }
        for (j = 0; j < n2; j++)
        {
            RightArray[j] = a[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = beg;

        while (i < n1 && j < n2) 
        {
            if (LeftArray[i] <= RightArray[j]) 
            {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) 
        {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(int a[], int beg, int end) 
    {
        if (beg < end) 
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    // Quick Sort
    int partition(int a[], int start, int end) 
    {
        int pivot = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) 
        {
            if (a[j] < pivot) 
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    void quicksort(int a[], int start, int end) 
    {
        if (start < end) 
        {
            int p = partition(a, start, end);
            quicksort(a, start, p - 1);
            quicksort(a, p + 1, end);
        }
    }

    // Heap Sort
    void heapify(int a[], int n, int i) 
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && a[left] > a[largest])
            largest = left;
        // If right child is larger than root
        if (right < n && a[right] > a[largest])
            largest = right;
        // If root is not largest
        if (largest != i) 
        {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            heapify(a, n, largest);
        }
    }

    /* Function to implement the heap sort */
    void heapSort(int a[], int n) 
    {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);

        for (int i = n - 1; i >= 0; i--) 
        {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, i, 0);
        }
    }

    /* Function to print the array */
    void printArray(int a[]) 
    {
        System.out.println("After Sorting Element in the array are :");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

}

public class P3 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        Sorting s = new Sorting();
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Enter " + (i + 1) + " Element to array :");
            arr[i] = sc.nextInt();
        }
        System.out.println("1- merge sort 2- quick sort 3- heap sort");
        System.out.print("Choose one sorting : ");
        int choice =sc.nextInt();
        if(choice==1)
        {
            s.mergeSort(arr, 0, 9); //0 is first index , 9 is last indes
            s.printArray(arr);
        }
        else if(choice == 2)
        {
            s.quicksort(arr, 0, 9);
            s.printArray(arr);
        }
        else if(choice == 3)
        {
            s.heapSort(arr, 10);
            s.printArray(arr);
        }
        else
        {
            System.out.println("Sorry , You are entered a wrong option");
        }
        sc.close();
    }
}
