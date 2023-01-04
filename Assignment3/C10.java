/*Write a program to implement queue and perform following using class and object?
a) create an queue of size 10 using array
b) insert 10 elements into queue using insert method
c) replace even numbers available in queue with nearest prime numbers
d) display number of odd and prime numbers.
e) delete 3 elements from queue using delete method
f) display remaining element of queue.
*/
import java.util.Scanner;

class Queue
{
    int item[];
    int size;
    int front =-1,rear =-1;
    Queue(int n)
    {
        size =n;
        item= new int[size];
    }
    boolean isFull()
    {
        if(front==0 && rear==size-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty()
    {
        if(front==-1)
          return true;
        else
           return false;
    }
    void insert(int n)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
        }
        else
        {
            if(front == -1)
            {
                front=0;
            }
            rear++;
            item[rear]=n;
            System.out.println(n+" is Inserted into Queue");
        }
    }
    void delete()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            int t=item[front];
            if(front>=rear)
            {
                front =-1;
                rear =-1;
            }
            else
            {
                front++;
            }
            System.out.println(t+" is Remove from the Queue");
        }
    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Empty Queue");
        }
        else
        {
            System.out.println("Front index " + front);
            System.out.println("Items in the Queue are  ");
            for(int i=front;i<=rear;i++)
            {
                System.out.println(item[i]+" ");
            }
            System.out.println(" Rear index "+rear);
        }
    }
    void peak(int n)
    {
        boolean available = false;        
        for(int i=front;i<=rear;i++)
        {
            if(item[i]==n)
            {
                available =true;
            }
        }
        if(available)
        {
            System.out.println(n+" is Avalable in the Queue");
        }
        else
        {
            System.out.println(n+" is Not Avalable in the Queue");

        }
        
    }
    void displayPrimeOdd()
    {
        if(isEmpty())
        {
            System.out.println("Empty Queue");
        }
        else
        {
            System.out.println("Prime Number in the Queue are ");
            for(int i=0;i<size;i++)
            {
                int count =0;
                for(int j=1;j<=item[i];j++)
                {
                    if(item[i]%j==0)
                    {
                        count++;
                    }
                }
                if(count==2)
                {
                    System.out.print(item[i]+" ");
                }
            }
            System.out.println("Odd Number in the Queue are ");
            for(int i=0;i<size;i++)
            {
                if(item[i]%2!=0)
                {
                    System.out.print(item[i]+" ");
                }
            }
        }
    }
   
    void replaceEvenNum() 
    {
        for (int i = 0; i < 10; i++) 
        {
            if (item[i] % 2 == 0) 
            {
                int l = item[i] + 4;
                for (int j = item[i]; j <= l; j++) 
                {
                    int count = 0;
                    for (int k = 1; k <= j; k++) 
                    {
                        if ( j% k == 0) 
                        {
                            count++;
                        }
                    }
                    if (count == 2) 
                    {
                        item[i]=j;
                    }
                }
            }
            else
            {
                int s = item[i] - 4;
                for (int j = item[i]; j >=s; j--) 
                {
                    int count = 0;
                    for (int k = 1; k <= j; k++) 
                    {
                        if ( j% k == 0) 
                        {
                            count++;
                        }
                    }
                    if (count == 2) 
                    {
                        item[i]=j;
                    }
                }
            }
        }
    }
}

class C10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //create an queue of size 10 using array
        Queue q = new Queue(10);
        //insert 10 elements into queue using insert method
        for(int i=1;i<=10;i++)
        {
            System.out.print("Enter "+i+" Element to the Queue :");
            int n=sc.nextInt();
            q.insert(n);
        }
        //replace even numbers available in queue with nearest prime numbers
        q.replaceEvenNum();
        //display number of odd and prime numbers.
        q.displayPrimeOdd();
        //delete 3 elements from queue using delete method
        q.delete();
        q.delete();
        q.delete();
        //display remaining element of queue
        q.display();
        sc.close();
    }
}