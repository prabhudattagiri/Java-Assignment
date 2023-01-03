/* Write a program to find area and perimeter of circle,square,rectangle and triangle using method 
overloading? */
class Shape
{
    void areaPerimeter(int a,int b, int c,int h)
    {
        int p = a+b+c;
        int ar =(b*h)/2;
        System.out.println("Area of Triangle is "+ar);
        System.out.println("Perimeter of Triangle is "+p);
    }
    void areaPerimeter(int l,int b)
    {
        int p = 2*(l+b);
        int a =l*b;
        System.out.println("Area of Rectangle is "+a);
        System.out.println("Perimeter of Rectangle is "+p);
    }
    void areaPerimeter(int s)
    {
        int p = 4*s;
        int a =s*s;
        System.out.println("Area of Square is "+a);
        System.out.println("Perimeter of Square is "+p);
    }
    void areaPerimeter(double r)
    {
        double p=2*Math.PI*r; //Math.PI give value of PI
        double a=Math.PI*r*r;
        System.out.println("Area of Circle is "+a);
        System.out.println("Perimeter of Circle is "+p);
    }
}
class P1
{
    public static void main(String[] args) 
    {
        Shape s = new Shape();
        s.areaPerimeter(6, 7, 12, 10);
        s.areaPerimeter(15, 8);
        s.areaPerimeter(13);
        s.areaPerimeter(7.0);
    }
}