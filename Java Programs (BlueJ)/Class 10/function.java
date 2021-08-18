import java.util.*;
class function
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
    void product()
    {
        s=a*b;
        System.out.println("Product = "+s);
    }
    void quotient()
    {
        d=a/b;
        System.out.println("Quotient = "+d);
    }
    public static void main(String args[])
    {
        function ob = new function();
        ob.input();
        ob.product();
        ob.quotient();
    }
}
