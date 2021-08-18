import java.util.*;
class primecomposite
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        double a,b,c=0;
        System.out.println ("Enter a number");
        a= sc.nextDouble();
        for (b=1; b<=a; b++)
        {
             if (a%b==0)
            c++;
           
        }
        if (c==2)
        System.out.println (a+" is a prime number");
        else
        System.out.println (a+" is a composite number");
    }
}