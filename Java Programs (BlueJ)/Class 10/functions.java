import java.util.*;
class functions
{
    int a,b,s=0,d=0;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
    }
    void sum()
    {
        s=a+b;
        System.out.println("Sum = "+s);
    }
    void difference()
    {
        d=a-b;
        System.out.println("Difference = "+d);
    }
    public static void main(String args[])
    {
        functions ob = new functions();
        ob.input();
        ob.sum();
        ob.difference();
    }
}
