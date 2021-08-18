import java.util.*;
class switchcase
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        double t,f=0,c=0;
        int n;
        System.out.println ("Enter temperature to be converted");
        t= sc.nextDouble();
        System.out.println ("Enter 1 for converting to Celsius or Enter 2 for converting to Fahrenheit");
         n = sc.nextInt();
        switch (n)
        {
            case 1:
            c=(5/9)*(f-32);
            System.out.println ("Temperature in Celsius is "+c);
            break;
            case 2:
            f=1.8*t+32;
            System.out.println ("Temperature in Fahrenheit is "+f);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}
            