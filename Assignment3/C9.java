import java.util.Scanner;

/*Write a program to implement stack and perform following using class and object?
a) create an stack of size 10 using array
b) insert 10 elements into stack using push and isfull method
c) find factorial of difference between largest and smallest element of stack
d) search any user defined element in stack using peak method
e) delete 3 elements from stack using pop and isempty method
f) display remaining element of stack */

class Stack
{
    int num[],top,size;
    Stack(int n)
    {
        size =n;
        num = new int [size];
        top= -1;
    }
    boolean isfull()
    {
        if(top==size-1)
            return true;
        else
            return false;
    }
    boolean isempty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    void push (int a)
    {
        //boolean st= isfull();
        if(isfull())
            System.out.println("Overflow");
        else
        {
            top=top+1;
            num[top]=a;
            System.out.println(num[top]+" has been inserted into stack");
        }
    }
    void pop ()
    {
        //boolean st =isempty();
        if(isempty())
           System.out.println("Underflow");
        else
        {
            int t=num[top];
            top =top-1;
            System.out.println("Popped item from stack is "+t);
        }
    }
    void display()
    {
        //boolean st = isempty();
        if(isempty())
        {
            System.out.println("Stack is empty , Nothing to display");
        }
        else
        {
            System.out.println("Element in Stack are ");
            for(int i=0;i<=top;i++)
            {
                System.out.println("Top position = "+i+" and Available data is "+num[i]);
            }
        }
    }
    void peak(int n)
    {
        boolean Available=false;
        for(int i=0;i<10;i++)
        {
            if(num[i]==n)
            {
                Available =true;
            }
        }
        if(Available)
        {
            System.out.println(n+" is Available in Stack");
        }
        else
        {
            System.out.println(n+" is Not Available in Stack");

        }
    }
    int factorial(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    int largest()
    {
        int l=num[0];
        for(int i=1;i<10;i++)
        {
            if(l<num[i])
            {
                l=num[i];
            }
        }
        int fl = factorial(l);
        return fl;
    }
    int smallest()
    {
        int s=num[0];
        for(int i=1;i<10;i++)
        {
            if(s>num[i])
            {
                s=num[i];
            }
        }
        int fs = factorial(s);
        return fs;
    }
}

class C9
{
    public static void main(String[] args) 
    {
        //create an stack of size 10 using array
        Stack s = new Stack(10);
        Scanner sc = new Scanner(System.in);
        //insert 10 elements into stack using push and isfull method
        for(int i=1;i<=10;i++)
        {
            System.out.print("Enter "+i+" Element to stack :");
            int n = sc.nextInt();
            s.push(n);
        }
        //find factorial of difference between largest and smallest
        int diff = s.largest()-s.smallest();
        System.out.println("factorial of difference between largest and smallest element of stack is "+diff);
        //search any user defined element in stack using peak method
        System.out.print("Enter a number to search in the stack :");
        int se=sc.nextInt();
        s.peak(se);
        //delete 3 elements from stack using pop and isempty method
        s.pop();
        s.pop();
        s.pop();
        // display remaining element of stack
        s.display();
        sc.close();
    }
}