import java.util.*;
class overloading
{
    int temp;
    float temp1;
    void display(int a, int b)
    {
        temp=a;
        a=b;
        b=temp;
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
    void display(float a,float b)
    {
        temp1=a;
        a=b;
        b=temp1;
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int m,n;
        float p,q;
        System.out.println("Enter the value of m,n (Whole nos.) & p,q(decimals)");
        m=sc.nextInt();
        n=sc.nextInt();
        p=sc.nextFloat();
        q=sc.nextFloat();
        overloading ob=new overloading();
        ob.display(m,n);
        ob.display(p,q);
    }
}
